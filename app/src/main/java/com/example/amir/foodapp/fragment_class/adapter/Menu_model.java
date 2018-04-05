package com.example.amir.foodapp.fragment_class.adapter;

/**
 * Created by Amir on 12/13/2017.
 */

public class Menu_model {
    String Title;
    String Body;
    Integer Image;
    Integer    id;


    public Menu_model(String title, String body, Integer image, Integer id) {
        Title = title;
        Body = body;
        Image = image;
        this.id = id;
    }


    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getBody() {
        return Body;
    }

    public void setBody(String body) {
        Body = body;
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
