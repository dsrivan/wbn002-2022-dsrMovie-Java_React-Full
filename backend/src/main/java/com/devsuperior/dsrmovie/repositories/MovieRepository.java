package com.devsuperior.dsrmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsrmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {}
