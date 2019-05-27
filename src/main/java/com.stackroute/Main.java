package com.stackroute;

import com.stackroute.awareinterface.ApplicationContextAwareDemo;
import com.stackroute.awareinterface.BeanFactoryAwareDemo;
import com.stackroute.awareinterface.BeanNameAwareDemo;
import com.stackroute.awareinterface.ResourceLoaderAwareDemo;
import com.stackroute.config.AppConfig;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String args[]){
        AnnotationConfigApplicationContext applicationContext=new AnnotationConfigApplicationContext();
        applicationContext.register(AppConfig.class);
        applicationContext.refresh();

    }
}
