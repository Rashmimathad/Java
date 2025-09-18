package com.xworkz.articleapp;

import com.xworkz.articleapp.article.Article;
import com.xworkz.articleapp.impl.ResearchArticleImpl;

public class ArticleRunner {
    public static void main(String[] args) {
        Article article=new ResearchArticleImpl();
        article.write();
        article.edit();
        article.publish();
    }
}
