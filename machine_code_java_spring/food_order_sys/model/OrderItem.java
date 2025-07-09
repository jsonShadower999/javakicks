public class Orderitem{
    @Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @ManyToOne 
    @JoinColumn(name="orderId")
    private Order orders;

    @ManyToOne 
    @JoinColumn(name="itemId")
    private Fooditem food_included;
    private int quantity_buyed;


}
