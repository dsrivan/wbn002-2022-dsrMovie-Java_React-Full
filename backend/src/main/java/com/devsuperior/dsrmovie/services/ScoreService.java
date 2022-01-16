package com.devsuperior.dsrmovie.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dsrmovie.dto.MovieDTO;
import com.devsuperior.dsrmovie.dto.ScoreDTO;
import com.devsuperior.dsrmovie.entities.Movie;
import com.devsuperior.dsrmovie.entities.Score;
import com.devsuperior.dsrmovie.entities.User;
import com.devsuperior.dsrmovie.repositories.MovieRepository;
import com.devsuperior.dsrmovie.repositories.ScoreRepository;
import com.devsuperior.dsrmovie.repositories.UserRepository;

@Service
public class ScoreService {
	
	@Autowired
	private MovieRepository movieRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private ScoreRepository scoreRepository;
	
	@Transactional
	public MovieDTO saveScore(ScoreDTO scoreDTO) {
		 
		Double sum = 0D;
		Double avg = 0D;
		
		User user = userRepository.findByEmail(scoreDTO.getEmail());
		if (user == null) {
			user = new User();
			user.setEmail(scoreDTO.getEmail());
			user = userRepository.saveAndFlush(user);
		}
		
		Movie movie = movieRepository.findById(scoreDTO.getMovieId()).get();
		
		Score score = new Score();
		score.setMovie(movie);
		score.setUser(user);
		score.setValue(scoreDTO.getScore());
		
		score = scoreRepository.saveAndFlush(score);
		
		for (Score s: movie.getScores()) {
			sum = sum + s.getValue();
		}		
		avg = sum / movie.getScores().size();
		
		movie.setScore(avg);
		movie.setCount(movie.getScores().size());
		
		movie = movieRepository.save(movie);
		
		return new MovieDTO(movie);
	}
}
