package com.bnta.springcinema.service;


import com.bnta.springcinema.models.Movie;
import com.bnta.springcinema.repository.InterfaceMovies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieService {
    @Autowired
    InterfaceMovies movieRepository;

    private ArrayList<Movie> cinema;

    public MovieService(InterfaceMovies movieRepository, ArrayList<Movie>movies) {
        this.movieRepository = movieRepository;
        this.cinema = movies;
    }
    public MovieService()  {
        this.cinema = new ArrayList<>();
    }


    public List<Movie> getAllMovies(){
        return movieRepository.findAll();
    }


    public Movie createMovie(Movie newMovie) {
        return movieRepository.save(newMovie);
    }

    // include code to update movie for PUT
    public Movie updateMovie(Movie movie){
        movieRepository.save(movie);
        return movie;
    }



    public Movie getMovieById(int id){
        return movieRepository.findById(id).get();
    }

    public void deleteMovie(int id) {
        movieRepository.delete(movieRepository.findById(id).get());
    }

}
