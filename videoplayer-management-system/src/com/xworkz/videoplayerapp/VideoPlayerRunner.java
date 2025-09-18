package com.xworkz.videoplayerapp;

import com.xworkz.videoplayerapp.impl.MxPlayerimpl;
import com.xworkz.videoplayerapp.impl.MxPlayerimpl;
import com.xworkz.videoplayerapp.videoplayer.VideoPlayer;

public class VideoPlayerRunner {
    public static void main(String[] args) {
        VideoPlayer videoPlayer=new MxPlayerimpl();
        videoPlayer.playVideo();
        videoPlayer.pauseVideo();
        videoPlayer.forwardVideo();
    }
}
