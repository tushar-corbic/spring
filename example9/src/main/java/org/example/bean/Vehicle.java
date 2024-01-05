package org.example.bean;

import org.example.services.VehicleServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("vehicleBean")
public class Vehicle {
    private String name ="Honda";
    private final VehicleServices vehicleServices;

    @Autowired
    public Vehicle(@Qualifier("vehicleServicesBean")VehicleServices vehicleServices){
        this.vehicleServices = vehicleServices;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public VehicleServices getVehicleServices() {
        return vehicleServices;
    }
}
