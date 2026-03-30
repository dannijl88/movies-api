package com.dani.movies_api.service;

import com.dani.movies_api.model.Movie;
import com.dani.movies_api.model.MovieResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${tmdb.api.key}")
    private String apiKey;

    @Value("${tmdb.api.base-url}")
    private String baseUrl;

    public MovieResponse getPopularMovies(){
        String url = baseUrl + "/movie/popular?api_key=" + apiKey;
        return restTemplate.getForObject(url, MovieResponse.class);
    }

    public MovieResponse getByTitle(String title){
        String url = baseUrl + "/search/movie?api_key=" + apiKey + "&query=" + title;
        return restTemplate.getForObject(url, MovieResponse.class);
    }

    public Movie getById(Long id){
        String url = baseUrl + "/movie/{id}?api_key=" + apiKey;
        return restTemplate.getForObject(url, Movie.class, id);
    }

    public MovieResponse getMostRated(){
        String url = baseUrl + "/movie/top_rated?api_key=" + apiKey;
        return restTemplate.getForObject(url, MovieResponse.class);
    }
}
