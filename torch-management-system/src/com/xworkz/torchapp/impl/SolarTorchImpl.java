package com.xworkz.torchapp.impl;

import com.xworkz.torchapp.torch.Torch;

public class SolarTorchImpl implements Torch {
    @Override
    public void on() {
        System.out.println("Solar Torch turned on");
    }

    @Override
    public void off() {
        System.out.println("Solar Torch turned off");
    }

    @Override
    public void adjustBrightness() {
        System.out.println("Solar Torch  adjust Brightness");
    }
}
