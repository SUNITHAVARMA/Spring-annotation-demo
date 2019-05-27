package com.stackroute.config;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringBeanConfiguration {
    Actor actor =new Actor(20,"sunitha","female");
    Actor actor2 =new Actor(22,"varma","female");
    @Bean(name="movie")
    public Movie getMovie(){

        return new Movie(actor,"Bahubali1");
    }
    @Bean(name="movie1")
    public Movie getMovie1(){

        return new Movie(actor2,"Bahubali2");
    }
}
