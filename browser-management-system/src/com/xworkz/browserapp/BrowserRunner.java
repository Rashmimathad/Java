package com.xworkz.browserapp;

import com.xworkz.browserapp.browser.Browser;
import com.xworkz.browserapp.impl.GoogleChromeImpl;

public class BrowserRunner {
    public static void main(String[] args) {
        Browser browser=new GoogleChromeImpl();
        browser.openTab();
        browser.refresh();
        browser.closeTab();
    }
}
