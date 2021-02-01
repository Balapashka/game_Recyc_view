package com.example.list;

public class Game {

    String photo;
    String title;
    String desc;
    String genre;

    public Game(String photo, String title, String desc, String genre){
        this.photo = photo;
        this.title = title;
        this.desc = desc;
        this.genre = genre;
    }

    public String getPhoto() {
        return photo;
    }

    public String getTitle() {
        return title;
    }

    public String getDesc() {
        return desc;
    }

    public String getGenre() {
        return genre;
    }
}
