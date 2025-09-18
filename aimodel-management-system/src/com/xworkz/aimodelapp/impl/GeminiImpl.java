package com.xworkz.aimodelapp.impl;

import com.xworkz.aimodelapp.aimodel.AiModel;

public class GeminiImpl implements AiModel {
    @Override
    public void train() {
        System.out.println("Gemini Ai model is trained");
    }

    @Override
    public void predict() {
        System.out.println("Gemini Ai model can predict data");
    }

    @Override
    public void evaluate() {
        System.out.println("Gemini Ai model is evaluated");
    }
}
