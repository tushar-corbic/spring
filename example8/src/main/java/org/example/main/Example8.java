package org.example.main;
import org.example.beans.Person;
import org.example.config.ProjectConfig2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example8 {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig2.class);
        Person person = context.getBean(Person.class);
        System.out.println(person.getVehicle().getName());
    }

}

