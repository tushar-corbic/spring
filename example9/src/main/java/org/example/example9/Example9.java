package org.example.example9;

import org.example.bean.Person;
import org.example.bean.Vehicle;
import org.example.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContextExtensionsKt;

public class Example9 {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(AppConfig.class);
        String[] persons = context.getBeanNamesForType(Person.class);
        String[] vehicles = context.getBeanNamesForType(Vehicle.class);
        for(String name: persons){
            System.out.println(name);
        }
        for(String name: vehicles){
            System.out.println(name);
        }
    }
}
