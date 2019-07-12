package com.example.spring.soundsystem;

import org.springframework.stereotype.Component;

/**
 * @program: springdemo
 * @description:
 * @author: Rodger Luo
 * @create: 2019-02-16 20:54
 **/
@Component
public class SgtPeppers implements CompactDisc {
    private String title = "Sgt, Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";

    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
