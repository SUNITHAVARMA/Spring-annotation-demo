package com.stackroute;

import com.stackroute.config.AppConfig;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String args[]){
        AnnotationConfigApplicationContext applicationContext=new AnnotationConfigApplicationContext();
        applicationContext.register(AppConfig.class);
        applicationContext.refresh();
        Movie movie=(Movie) applicationContext.getBean("movie");
        System.out.println(movie);
        Movie movie1=(Movie) applicationContext.getBean("movie1");
        System.out.println(movie1);
        Movie movie2=(Movie) applicationContext.getBean("movie1");
        System.out.println(movie2);
        System.out.println(movie1==movie2);

    }
}
