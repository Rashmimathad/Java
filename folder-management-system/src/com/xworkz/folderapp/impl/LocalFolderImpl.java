package com.xworkz.folderapp.impl;

import com.xworkz.folderapp.folder.Folder;

public class LocalFolderImpl implements Folder {
    @Override
    public void create() {
        System.out.println("Local Folder created");
    }

    @Override
    public void delete() {
        System.out.println("Local folder deleted");
    }

    @Override
    public void listAllFiles() {
        System.out.println("All files in local folder are listed");
    }
}
