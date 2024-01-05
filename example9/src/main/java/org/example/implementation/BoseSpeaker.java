package org.example.implementation;

import org.example.interfaces.Speaker;
import org.springframework.stereotype.Component;

@Component
public class BoseSpeaker implements Speaker {
    public String makeSound(){
        return "Playing Music with Bose Speaker";
    }
}
