// public class Order{
//     private UUID ord_id;
//     private LocalDateTime ord_date;
//     private String ord_status;
//     private List<Fooditem> food_list;
//     private float total_price;
    

    
//     // private User ord_owner;
    
// }


// --- Order.java ---
package com.example.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "orders") // Because "order" is a reserved SQL keyword
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID orderId;

    private LocalDateTime orderDate;
    private String status;
    private float totalPrice;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<FoodItem> foodItems;

    @ManyToOne
    private User user;

    // Getters, setters, constructors
}
