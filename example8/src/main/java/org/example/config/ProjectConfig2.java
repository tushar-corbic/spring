package org.example.config;

import org.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="org.example.beans")
public class ProjectConfig2 {
    @Bean
    Vehicle vehicle1(){
        var veh = new Vehicle();
        veh.setName("Vehicle 1");
        return veh;
    }
    @Bean
    Vehicle vehicle2(){
        var veh= new Vehicle();
        veh.setName("vehicle2");
        return veh;
    }
    @Bean
    Vehicle vehicle3(){
        var veh = new Vehicle();
        veh.setName("vehicle3");
        return veh;
    }

}
