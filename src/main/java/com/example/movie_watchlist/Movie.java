package com.example.movie_watchlist;

public class Movie {
    private Long id;
    private String title;
    private String director;
    private int releaseYear;
    private String genre;
    private int personalRating;
    private boolean watched;
    private String notes;

    public Movie(Long id, String title, String director, int releaseYear, String genre, int personalRating, boolean watched, String notes) {
        this.id = id;
        this.title = title;
        this.director = director;
        this.releaseYear = releaseYear;
        this.genre = genre;
        this.personalRating = personalRating;
        this.watched = watched;
        this.notes = notes;
    }

    public Long getId() { return id; }
    public String getTitle() { return title; }
    public String getDirector() { return director; }
    public int getReleaseYear() { return releaseYear; }
    public String getGenre() { return genre; }
    public int getPersonalRating() { return personalRating; }
    public boolean isWatched() { return watched; }
    public String getNotes() { return notes; }
}
