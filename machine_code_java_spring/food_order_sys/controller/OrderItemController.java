// @RestController 
// @RequestMapping("/api/order-items")
// public class OrderItemController{
//     //create 

//     // public class Orderitem{
//     // @Id 
//     // @GeneratedValue(strategy=GenerationType.IDENTITY)
//     // private Long id;
//     // @ManyToOne 
//     // @JoinColumn(name="orderId")
//     // private Order orders;

//     // @ManyToOne 
//     // @JoinColumn(name="itemId")
//     // private Fooditem food_included;
//     // private int quantity_buyed;






//     @PostMapping 
//     public ResponseEntity<?> createOrderItem(@RequestBody OrderItem order_detail){
//         // get order detail from order 
//         Optional<Order> order_opt=orderservice.findById(order_detail.orderId);
//         Optional<Fooditem> food_opt=foodservice.findById(food_service.foodId);
//         OrderItem order_item=new OrderItem();
//         order_item.setOrder(order_opt);
//         order_item.setFood(food_opt);
//         order_item.setQuantity(quantity_buyed);

//         OrderItem saving_item=orderservice.add(order_item);
//         return ResponseEntity.ok(saving_item);

//     }
//     @GetMapping 
//     pubic List<OrderItem> getAllOrderItems(){
//         return orderservice.findAll();
//     }

//     @GetMapping("/order/{orderId}")
//     public List<OrderItem> getItemsByOrder(@PathVaraible Long orderId){
//         return orderservice.findByOrderId(orderId);
//     }



    
    
// }