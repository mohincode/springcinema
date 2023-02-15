package com.bnta.springcinema.models;

import jakarta.persistence.*;

@Entity(name = "movies")

public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "title")
    private String title;
    @Column(name = "rating")
    private int rating;
    @Column(name = "duration")
    private int duration;

    public Movie(int id, String title, int rating, int duration) {
        this.id = id;
        this.title = title;
        this.rating = rating;
        this.duration = duration;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getRating() {
        return rating;
    }

    public int getDuration() {
        return duration;
    }
}
