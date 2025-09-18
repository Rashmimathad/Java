package com.xworkz.videoplayerapp.impl;

import com.xworkz.videoplayerapp.videoplayer.VideoPlayer;

public class MxPlayerimpl implements VideoPlayer {
    @Override
    public void playVideo() {
        System.out.println("Mx Player started playing video");
    }

    @Override
    public void pauseVideo() {
        System.out.println("Mx Player paused Video  ");
    }

    @Override
    public void forwardVideo() {
        System.out.println("Mx Player forwarding video");
    }
}
