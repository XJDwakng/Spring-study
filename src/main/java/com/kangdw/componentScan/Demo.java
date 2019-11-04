package com.kangdw.componentScan;

import com.kangdw.componentScan.conf.DemoConfigure;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {
    @Test
    public void test1() {
        ApplicationContext context = new AnnotationConfigApplicationContext(DemoConfigure.class);
        String[] nameArray = context.getBeanDefinitionNames();
        for (String name : nameArray) {
            System.out.println(name);
        }
    }
}
