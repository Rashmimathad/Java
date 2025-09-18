package com.xworkz.singerapp;

import com.xworkz.singerapp.impl.PlayBackSingerImpl;
import com.xworkz.singerapp.singer.Singer;

public class SingerRunner {
    public static void main(String[] args) {
        Singer singer=new PlayBackSingerImpl();
        singer.rehearse();
        singer.sing();
        singer.record();
    }
}
