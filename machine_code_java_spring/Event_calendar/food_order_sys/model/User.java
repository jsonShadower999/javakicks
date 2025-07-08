
public class User{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private UUID user_id;
    private String user_name;
    private String name;
    private int age;
    private String email;
    private int phone;
    @OneToMany()
    private List<Order> order_list;
    @OneToOne(cart)
    private Cart cart_details;
    

    
}