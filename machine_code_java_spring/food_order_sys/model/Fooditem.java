// public class Fooditem{
//     private UUID itemid;
//     private String food_category;
//     private String food_name;
//     private float per_food_price;
//     private int food_quantity;
//     private int food_rating;
//     private String food_img;
//     private String[] food_cook_cabin;
//     private boolean add_cart_status;
//     private boolean remove_cart_status;


// }

// --- FoodItem.java ---
package com.example.model;

import jakarta.persistence.*;
import java.util.UUID;

@Entity
public class FoodItem {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID itemId;

    private String foodCategory;
    private String foodName;
    private float price;
    private int quantity;
    private float rating;
    private String imageUrl;
    
    @ElementCollection
    private List<String> cookCabins;

    private boolean inCart;

    // Getters, setters, constructors
}
