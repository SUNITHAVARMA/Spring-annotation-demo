package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


public class Movie {

    @Autowired
    private Actor actor;
    private String movieName;

    public void setActor(Actor actor) {
        this.actor = actor;
    }
    public void setMovieName(String movieName){
        this.movieName=movieName;
    }
    public Actor getActor() {
        return actor;
    }
    public String getMovieName(){
        return movieName;
    }

    @Override
    public String toString() {
        return "Movie {" +
                "movie=" + movieName+" "+
                "actor=" + actor +
                '}';
    }
}
