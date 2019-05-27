package com.stackroute.domain;

public class Movie {
    private Actor actor;
    private String movieName;
    public Movie(Actor actor,String movieName) {
        this.actor = actor;
        this.movieName=movieName;
    }

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
