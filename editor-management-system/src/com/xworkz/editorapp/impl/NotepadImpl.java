package com.xworkz.editorapp.impl;

import com.xworkz.editorapp.editor.Editor;

public class NotepadImpl implements Editor {
    @Override
    public void openFile() {
        System.out.println("File opened in Notepad Editor");
    }

    @Override
    public void closeFile() {
        System.out.println("File closed from Notepad Editor");
    }

    @Override
    public void saveFile() {
        System.out.println("File saved using Notepad Editor");
    }
}
