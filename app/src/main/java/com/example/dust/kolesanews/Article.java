package com.example.dust.kolesanews;

/**
 * Created by Dust on 30.05.2016.
 */
public class Article {

    private String url;
    private String title;
    private String source;
    private String date;
    private String desc;

    public Article(String url, String title, String source, String date, String desc) {
        this.url = url;
        this.title = title;
        this.source = source;
        this.date = date;
        this.desc = desc;
    }

    public String getSource(){
        return source;
    }

    public String getUrl() {
        return url;
    }

    public String getTitle() {
        return title;
    }

    public String getDate() {
        return date;
    }

    public String getDesc() {
        return desc;
    }
}
