
// public class User{
//     @Id
//     @GeneratedValue(strategy=GenerationType.AUTO)
//     private UUID user_id;
//     private String user_name;
//     private String name;
//     private int age;
//     private String email;
//     private int phone;
//     @OneToMany()
//     private List<Order> order_list;
//     @OneToOne(cart)
//     private Cart cart_details;


    
// }

// --- User.java ---
package com.example.model;

import jakarta.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID userId;

    private String userName;
    private String fullName;
    private String email;
    private int age;
    private long phone;
    private String password;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Order> orders;

    @OneToOne(cascade = CascadeType.ALL)
    private Cart cart;

    // Getters, setters, constructors
}
