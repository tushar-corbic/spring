package org.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"org.example.implementation","org.example.services"})
@ComponentScan(basePackageClasses={org.example.bean.Vehicle.class, org.example.bean.Person.class})
public class AppConfig {
}
