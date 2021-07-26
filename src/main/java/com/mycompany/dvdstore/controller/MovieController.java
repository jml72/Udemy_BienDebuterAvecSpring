package com.mycompany.dvdstore.controller;

import com.mycompany.dvdstore.entity.Movie;

import com.mycompany.dvdstore.service.MovieServiceInterface;

import java.util.Scanner;

public class MovieController {

    private MovieServiceInterface movieService;

    public MovieServiceInterface getMovieService() {
        return movieService;
    }

    public void setMovieService(MovieServiceInterface movieService) {
        this.movieService = movieService;
    }

    public void addUsingConsole() {
        System.out.println( "Donnez-moi le titre du film" );
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();
        System.out.println( "Donnez-moi le genre du film" );
        String genre = sc.nextLine();
        Movie movie = new Movie();
        movie.setTitle(title);
        movie.setGenre(genre);
        movieService.registerMovie(movie);
    }

}
