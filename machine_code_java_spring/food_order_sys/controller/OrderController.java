// //   @Id
//     @GeneratedValue(strategy = GenerationType.AUTO)
//     private UUID orderId;

//     private LocalDateTime orderDate;
//     private String status;
//     private float totalPrice;

//     @ManyToMany(cascade = CascadeType.ALL)
//     private List<FoodItem> foodItems;

//     @ManyToOne
//     private User user;

public class OrderController{
    @Autowired 
    private OrderService orderservice;

    public OrderController(private OrderService orderservice){
        this.orderservice=orderservice;

    }
    @PostMapping("/createOrder")
    public ResposeEntity<String> createOrder(@RequestParam User user_active , @RequestParam List<FoodItem> food_list){
        Order new_order=new Order(user=user_active,foodItems=food_list,)
    }
}