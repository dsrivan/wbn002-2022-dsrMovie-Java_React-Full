package com.devsuperior.dsrmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsrmovie.entities.Score;
import com.devsuperior.dsrmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {}
