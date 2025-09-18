package com.xworkz.cameraapp.impl;

import com.xworkz.cameraapp.camera.Camera;

public class DslrCameraImpl implements Camera {
    @Override
    public void capture() {
        System.out.println("Picture captured by Dslr Camera");
    }

    @Override
    public void zoomIn() {
        System.out.println("Dslr Camera Zoomed In");
    }

    @Override
    public void zoomOut() {
        System.out.println("Dslr Camera Zoomed Out ");
    }
}
