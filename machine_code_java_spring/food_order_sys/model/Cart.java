// public class Cart{
//     private List<FoodItem> order_list;
//     private float total_cart_cost;



// }

// --- Cart.java ---
package com.example.model;

import jakarta.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID cartId;

    @OneToMany(cascade = CascadeType.ALL)
    private List<FoodItem> items;

    private float totalCost;

    @OneToOne(mappedBy = "cart")
    private User user;

    // Getters, setters, constructors
}
