package com.xworkz.fileapp.impl;

import com.xworkz.fileapp.file.File;

public class PdfFileImpl implements File {
    @Override
    public void open() {
        System.out.println("PDF File opened");
    }

    @Override
    public void close() {
        System.out.println("PDF File closed");
    }

    @Override
    public void save() {
        System.out.println("PDF File saved");
    }
}
