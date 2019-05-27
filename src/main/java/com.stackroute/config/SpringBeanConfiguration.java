package com.stackroute.config;

import com.stackroute.awareinterface.ApplicationContextAwareDemo;
import com.stackroute.awareinterface.BeanFactoryAwareDemo;
import com.stackroute.awareinterface.BeanNameAwareDemo;
import com.stackroute.awareinterface.ResourceLoaderAwareDemo;
import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class SpringBeanConfiguration {
@Bean(name="applicationContextAware")
    public ApplicationContextAwareDemo getApplication(){
    return  new ApplicationContextAwareDemo();
}
@Bean(name="beanFactoryAware")
    public BeanFactoryAwareDemo getBeanFactory(){
    return new BeanFactoryAwareDemo();
}
@Bean(name="beanNameAware")
    public BeanNameAwareDemo getBeanAware(){
    return new BeanNameAwareDemo();
}
@Bean(name="resourceLoaderAware")
    public ResourceLoaderAwareDemo getResourceLoader(){
    return new ResourceLoaderAwareDemo();
}
//    @Bean(name="movie")
//
//    public Movie getMovie(){
//        Movie movie=new Movie();
//        movie.setMovieName("Bahubali");
//
//        return movie;
//    }
//
//    @Bean(name = "actor")
//    public Actor getActor(){
//        Actor actor=new Actor();
//        actor.setAge(20);
//        actor.setGender("female");
//        actor.setName("sunitha");
//        return actor;
//    }

}
