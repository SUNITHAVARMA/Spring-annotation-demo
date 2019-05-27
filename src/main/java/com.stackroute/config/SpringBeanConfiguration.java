package com.stackroute.config;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class SpringBeanConfiguration {

    public Actor getActor(){
        return new Actor(20,"sunitha","female");
    }
    public Actor getActor2(){
        return new Actor(22,"varma","female");
    }
    @Bean(name="movie")

    public Movie getMovie(){

        return new Movie(getActor(),"Bahubali1");
    }
    @Bean(name="movie1")
    @Scope("prototype")
    public Movie getMovie1(){

        return new Movie(getActor2(),"Bahubali2");
    }
}
