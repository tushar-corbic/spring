package org.example.main;
import org.example.config.ProjectConfig1;
import org.example.beans.Vehicle;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Random;
import java.util.function.Supplier;

public class Example1 {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig1.class);

        Vehicle volkwagen = new Vehicle();
        volkwagen.setName("Volkswagin");
        Supplier<Vehicle> volkswagenSupplier = ()->volkwagen;

        Supplier<Vehicle> audiSupplier = ()->{
            Vehicle audi = new Vehicle();
            audi.setName("Audi");
            return audi;
        };

        Random random = new Random();
        int randomNumber = random.nextInt(10);
        System.out.println("Next Number : "+ randomNumber);

        if(randomNumber%2==0){
            context.registerBean("volkswagen", Vehicle.class, volkswagenSupplier);
        }else{
            context.registerBean("audi", Vehicle.class, audiSupplier);
        }
        Vehicle volksVehicle = null;
        Vehicle audiVehicle = null;
        try{
            volksVehicle = context.getBean("volkswagen", Vehicle.class);
        }catch(NoSuchBeanDefinitionException noSuchBeanDefinitionException){
            System.out.println("Error while creatting the vokswagen car");
        }

        try{
            audiVehicle = context.getBean("audi", Vehicle.class);
        }catch(NoSuchBeanDefinitionException noSuchBeanDefinitionException){
            System.out.println("Error while creating the audi car");
        }
    }
}

