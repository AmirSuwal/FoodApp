package com.example.amir.foodapp.drinks;

/**
 * Created by Amir on 12/15/2017.
 */

public class Drink_Model {
    Integer Image;
    String Title;
    Integer Price;
    String Details;
    Integer Id;


    public Drink_Model(Integer image, String title,  String details,Integer price, Integer id) {
        Image = image;
        Title = title;
        Details = details;
        Price = price;
        Id = id;
    }






    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }
    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public String getDetails() {
        return Details;
    }

    public void setDetails(String details) {
        Details = details;
    }


}
