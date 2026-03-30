package com.dani.movies_api.controller;

import com.dani.movies_api.model.Movie;
import com.dani.movies_api.model.MovieResponse;
import com.dani.movies_api.service.MovieService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MovieController {

    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/movies/popular")
    public MovieResponse getPopularMovies(){
        return movieService.getPopularMovies();
    }

    @GetMapping("/search/movie/{title}")
    public MovieResponse getByTitle(@PathVariable String title){ return movieService.getByTitle(title); }

    @GetMapping("/movie/{id}")
    public Movie getById(@PathVariable Long id){
        return movieService.getById(id);
    }

    @GetMapping("/movies/most-rated")
    public MovieResponse getMostRated(){
        return movieService.getMostRated();
    }
}
