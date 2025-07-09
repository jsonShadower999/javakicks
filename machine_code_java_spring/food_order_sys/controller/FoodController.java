
api to add fooditem , upodate food item , delete food item 

public class FoodController{
    @Autowired
    private FoodService foodsrv ;
    public FoodController(private FoodService foodsrv){
        this.foodsrv=foodsrv;

    }
    @GetMapping("/getcompletefooditemmenu")
    public ResposeEntity<List<Fooditem>> getAllMenu(){
        List<Fooditem> food_list=foodsrv.findAllFoodItems();
        if(food_list){
            ResponseEntity.ok("food list is available");
        }
        else{
            ResposeEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("server down");
        }

    }
    //add a new food item to a foodlist 
    @PostMapping("/createItem")
    public Optional<Item> createItem(@RequestBody Item new_food_item){
        Item new_item=new Item(new_food_item);
        itemservice.addItem(new_item);
        return Optional.of(new_item);
        

    }
    //modify the price of food item 
    @PutMapping("/modifyprice")
    public boolean updatePriceItem(@RequestParam float new_price ,@RequestParam String foodName){
        Item requested_item=itemservice.getItemByfoodName(foodName);
        if(request_item){
            requested_item.setPrice(new_price);
            return true;
        }
        else{
            return false;
        }
    }
    