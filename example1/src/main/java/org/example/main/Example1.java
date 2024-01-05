package org.example.main;
import org.example.config.ProjectConfig;
import org.example.beans.Vehicle;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example1 {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle vehicle = context.getBean(Vehicle.class);
        System.out.println(vehicle.getName());
//        Vehicle vehicle2 = context.getBean("vehicle2", Vehicle.class);
//        System.out.println(vehicle2.getName());
    }
}

