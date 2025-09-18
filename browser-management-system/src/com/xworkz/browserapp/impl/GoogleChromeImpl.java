package com.xworkz.browserapp.impl;

import com.xworkz.browserapp.browser.Browser;

public class GoogleChromeImpl implements Browser {
    @Override
    public void openTab() {
        System.out.println("Tab opened in Google Chrome");
    }

    @Override
    public void closeTab() {
        System.out.println("Tab closed in Google Chrome");
    }

    @Override
    public void refresh() {
        System.out.println("Google Chrome browser tab refreshed");
    }
}
