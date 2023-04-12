package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Example1 {

    @Autowired
    private Example2 example2;

    public void playMusic(){
        example2.playGame();
    }
}
