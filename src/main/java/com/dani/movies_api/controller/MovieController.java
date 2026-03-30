package com.dani.movies_api.controller;

import com.dani.movies_api.model.MovieResponse;
import com.dani.movies_api.service.MovieService;
import org.springframework.web.bind.annotation.GetMapping;
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
}
