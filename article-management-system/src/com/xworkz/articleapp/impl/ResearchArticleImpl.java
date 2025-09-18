package com.xworkz.articleapp.impl;

import com.xworkz.articleapp.article.Article;

public class ResearchArticleImpl implements Article {
    @Override
    public void write() {
        System.out.println("Research Article is written");
    }

    @Override
    public void edit() {
        System.out.println("Research Article is edited");
    }

    @Override
    public void publish() {
        System.out.println("Research Article is published");
    }
}
