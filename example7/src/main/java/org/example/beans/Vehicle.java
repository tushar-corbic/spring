package org.example.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.stereotype.Component;

public class Vehicle {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @PostConstruct
    public void initialize(){
        this.name="tushar";
    }
    @PreDestroy
    public void destroy(){
        System.out.println("Destroying the bean");
    }
}
