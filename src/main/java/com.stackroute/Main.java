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
        System.out.println("Autowire Example");
        System.out.println(movie);


    }
}
