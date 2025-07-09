// api to add a fooditem to a cart , delete from cart 
@RestController
@RequestMapping("/api/cartcontroller")

    // @OneToMany(cascade = CascadeType.ALL)
    // private List<FoodItem> items;

    // private float totalCost;

    // @OneToOne(mappedBy = "cart")
    // private User user;
public class CartController{
    @Autowired
    private CartService cartservice;
    public CartController(private CartService cartservice){
        this.cartservice=cartservice;

    }
    @GetMapping("/getcartdetail/{username}")
    public List<FoodItem> getCartDetails(@PathVariable String userName){
        List<FoodItem> food_list=cartservice.getAlldetailByUser(userName);
        return food_list;


    }
    @PostMapping("/addtocart")
    public boolean addItemToCart(@RequestParam FoodItem new_item){
        List<FoodItem> list_food=cartservice.getFood_list();
        Item new_item=new Item(new_item);
        list_food.add(new_item);
        return true;
    }
    @PutMapping("/removefromcart")
    public FoodItem delete_FoodItem(@RequestParam String username , @RequestParam String foodName){
        List<FoodItem> fooditem_curent=getCartDetails(username);
        FoodItem food_obj=food_service.getfoodByfoodName(foodName);
        if(fooditem_curent.contains(food_obj)){
            fooditem_current.remove(food_obj);
        }
        return food_obj;

    
    }
}   