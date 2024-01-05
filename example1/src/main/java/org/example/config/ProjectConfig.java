package org.example.config;

import org.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {

    @Bean(name="vehicle")
    Vehicle vehicle(){
        Vehicle veh = new Vehicle();
        veh.setName("audi");
        return veh;
    }
    @Bean(value="vehicle2")
    Vehicle vehicle2(){
        Vehicle veh = new Vehicle();
        veh.setName("audi 2");
        return veh;
    }
    @Primary
    @Bean("vehicle3")
    Vehicle vehicle3(){
        Vehicle veh = new Vehicle();
        veh.setName("audi 3");
        return veh;
    }
}
