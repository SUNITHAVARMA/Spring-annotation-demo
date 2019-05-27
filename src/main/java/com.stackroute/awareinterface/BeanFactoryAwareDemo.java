package com.stackroute.awareinterface;

import org.springframework.beans.factory.BeanNameAware;

public class BeanFactoryAwareDemo implements BeanNameAware {
    @Override
    public void setBeanName(String s) {
        s="sunitha";
        System.out.println(s);
    }
}
