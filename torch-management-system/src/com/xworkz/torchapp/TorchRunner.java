package com.xworkz.torchapp;

import com.xworkz.torchapp.impl.SolarTorchImpl;
import com.xworkz.torchapp.torch.Torch;

public class TorchRunner {
    public static void main(String[] args) {
        Torch torch=new SolarTorchImpl();
        torch.on();
        torch.adjustBrightness();
        torch.off();
    }
}
