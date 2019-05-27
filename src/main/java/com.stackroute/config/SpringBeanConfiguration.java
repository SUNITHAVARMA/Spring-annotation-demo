package com.stackroute.config;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class SpringBeanConfiguration {


    @Bean(name="movie")

    public Movie getMovie(){
        Movie movie=new Movie();
        movie.setMovieName("Bahubali");

        return movie;
    }

    @Bean(name = "actor")
    public Actor getActor(){
        Actor actor=new Actor();
        actor.setAge(20);
        actor.setGender("female");
        actor.setName("sunitha");
        return actor;
    }
   /* @Bean(name="movie1")
    @Scope("prototype")
    public Movie getMovie1(){

        return new Movie(getActor2(),"Bahubali2");
    }*/
}
