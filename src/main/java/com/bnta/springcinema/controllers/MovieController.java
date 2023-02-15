package com.bnta.springcinema.controllers;


import com.bnta.springcinema.models.Movie;
import com.bnta.springcinema.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.nio.file.Path;
import java.util.List;

@RestController
@RequestMapping(value = "/movies")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping
    public ResponseEntity<List<Movie>> getAllMovies(){
        List<Movie> movie = MovieService.getAllMovies();
        return new ResponseEntity<>(movie, HttpStatus.OK);
    }

    @GetMapping(value ="/{id}")
    public ResponseEntity<Movie> getMovieById (PathVariable int id){
        Movie movie = movieService.getMovieById(id);
        return new ResponseEntity<>(movie, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Movie> createMovie(@RequestBody Movie movie) {
        Movie movieToBeSaved = movieService.createMovie(movie);
        return new ResponseEntity<>(movieToBeSaved, HttpStatus.CREATED);


    }

}
