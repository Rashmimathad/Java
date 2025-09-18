package com.xworkz.folderapp;

import com.xworkz.folderapp.folder.Folder;
import com.xworkz.folderapp.impl.LocalFolderImpl;

public class FolderRunner {
    public static void main(String[] args) {
        Folder folder=new LocalFolderImpl();
        folder.create();
        folder.listAllFiles();
        folder.delete();
    }
}
