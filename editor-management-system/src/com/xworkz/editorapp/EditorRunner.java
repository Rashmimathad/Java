package com.xworkz.editorapp;

import com.xworkz.editorapp.editor.Editor;
import com.xworkz.editorapp.impl.NotepadImpl;

public class EditorRunner {
    public static void main(String[] args) {
        Editor editor=new NotepadImpl();
        editor.openFile();
        editor.saveFile();
        editor.closeFile();
    }
}
