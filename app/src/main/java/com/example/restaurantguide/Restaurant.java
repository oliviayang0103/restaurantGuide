package com.example.restaurantguide;

import java.util.ArrayList;

public class Restaurant {
    private String name;
    //from $ to $$$
    private String priceRange;
    private String location;
    private String cuisine;
    private String rating;
    private String bestDish;
    //    //to display a photo of the most popular dish from each restaurant
    private int photo;

    public Restaurant(String name, String priceRange, String location, String cuisine, String rating, String bestDish, int photo){
        this.name = name;
        this.priceRange = priceRange;
        this.location = location;
        this.cuisine = cuisine;
        this.rating = rating;
        this.bestDish = bestDish;
        this.photo = photo;

    }

    public String getName(){
        return name;
    }
    public void setRestaurant(String name) {
        this.name = name;
    }
    public String getPriceRange(){
        return priceRange;
    }
    public String getLocation(){
        return location;
    }
    public String getCuisine(){
        return cuisine;
    }
    public String getRating(){
        return rating;
    }
    public int getPhoto(){
        return photo;
    }

    public static ArrayList<Restaurant> getRestaurants(){
        ArrayList<Restaurant> restaurants = new ArrayList<>();
        restaurants.add(new Restaurant("Sydney's Wings and Things", "$", "Bankstown", "Bbq, Middle Eastern", "8", "Wings", 1));
        restaurants.add(new Restaurant("An Restaurant","$$", "Bankstown", "Vietnamese", "9.5", "Pho Tai", 2));
        restaurants.add(new Restaurant("Vinh Phat", "$$", "Cabramatta", "Chinese, Seafood, Yum Cha", "9", "Har Gow, Siu Mai", 3));
        restaurants.add(new Restaurant("Yayoi", "$$", "The Galeries, CBD", "Japanese", "8.5", "Wagyu Sukiyaki", 4));
        restaurants.add(new Restaurant("Yang Guo Fu", "$$", "Hurstville", "Chinese", "8.5", "Malatang", 5));
        restaurants.add(new Restaurant("Mr Hotdog", "$", "Strathfield", "Fast Food, Korean", "7.5", "Jumbo Hotdog with Cheese", 6));
        restaurants.add(new Restaurant("Sokyo", "$$$", "Pyrmont", "Japanese", "9.5", "Maguro Tataki", 7));
        restaurants.add(new Restaurant("Ramen Zundo", "$$", "World Square", "Japanese, Ramen","8", "Tsukemen", 8));
        restaurants.add(new Restaurant("Adam's kebabs", "$$", "Hurstville", "Turkish", "8.5", "Halal Snack Pack", 9));
        restaurants.add(new Restaurant ("Hong Kong Bing Sutt", "$$", "Burwood", "Chinese", "8", "Spam egg sandwhich", 10));
        return restaurants;
    }
}
