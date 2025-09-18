package com.xworkz.singerapp.impl;

import com.xworkz.singerapp.singer.Singer;

public class PlayBackSingerImpl  implements Singer {
    @Override
    public void sing() {
        System.out.println("Playback singer sings the song");
    }

    @Override
    public void rehearse() {
        System.out.println("Playback singer rehearses the song");
    }

    @Override
    public void record() {
        System.out.println("Playback singer records the song");
    }
}
