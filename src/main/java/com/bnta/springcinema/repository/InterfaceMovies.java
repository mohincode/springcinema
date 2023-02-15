package com.bnta.springcinema.repository;

import com.bnta.springcinema.models.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InterfaceMovies extends JpaRepository<Movie, Integer> {
}
