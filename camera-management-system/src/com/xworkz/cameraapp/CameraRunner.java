package com.xworkz.cameraapp;

import com.xworkz.cameraapp.camera.Camera;
import com.xworkz.cameraapp.impl.DslrCameraImpl;

import java.net.DatagramSocket;

public class CameraRunner {
    public static void main(String[] args) {
            Camera camera=new DslrCameraImpl();
            camera.zoomIn();
            camera.zoomOut();
            camera.capture();
    }
}
