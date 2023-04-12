package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Example2 {

    @Autowired
    private Example1 example2;

    public void playGame(){
        example2.playMusic();
    }
}
