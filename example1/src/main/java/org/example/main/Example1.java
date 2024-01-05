package org.example.main;
import org.example.config.ProjectConfig1;
import org.example.beans.Vehicle;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example1 {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig1.class);
        Vehicle vehicle = context.getBean(Vehicle.class);
        System.out.println(vehicle.getName());
        context.close();
    }
}

