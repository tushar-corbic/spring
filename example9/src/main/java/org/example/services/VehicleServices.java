package org.example.services;

import org.example.interfaces.Speaker;
import org.example.interfaces.Tyre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("vehicleServicesBean")
public class VehicleServices {

    @Autowired
    private Speaker speaker;
    private Tyre type;

    public void playMusic(){
        String music = speaker.makeSound();
        System.out.println(music);
    }

    public void moveVehicle(){
        String status = type.rotate();
        System.out.println(status);
    }

    public Speaker getSpeaker() {
        return speaker;
    }

    public void setSpeaker(Speaker speaker) {
        this.speaker = speaker;
    }

    public Tyre getType() {
        return type;
    }

    @Autowired
    public void setType(Tyre type) {
        this.type = type;
    }
}
