@RestController 
@RequestMapping("api/userhandler")
public class UserController{
    @Autowired 
    private UserService userservice;
    public UserController(userservice UserService){
        this.userservice=userservice;
    }
    @GetMapping("/getuserdetail/{userName}")
    public Optional<User> getUserDetails(@PathVariable String userName ){
        User user_detail=userservice.getuserByuserName(userName);
        return Optional.ofNullable(user_detail);
    }
    @PostMapping("/createuser")
    public Optional<User> createUser(@RequestBody User new_user){
        User new_user=new User(new_user);
        userservice.addUser(new_user);
        return Optional.ofNullable(new_user);

    }
    //  String username;
    // Location currentLoc;
    // VehicleType chosenVehicleType;
    // String phone_cnt;
    // String email_cnt;
    // PaymentMode paymode;
    // PaymentStatus paystatus;
    @PutMapping("/updateuserdetail/{username}")
    public boolean updateUser(@PathVariable String userName , @RequestParam  String currentLoc , @String phone_cnt){
        User requested_user=UserService.getUserByuserName(userName);
        if(requested_user){
            requested_user.setcurrentLoc(currentLoc);
            requested_user.setphone_cnt(phone_cnt);
            return true;
        }
    }
    @GetMapping("/userlogin")
    public boolean logincheck(@RequestParam String userName , @RequestParam String password){
        User requested_user=userservice.getuserByuserName(userName);
        if(password.equals(requested_user.getPassword())){
            return true;
        }
        else{
            return false;
        }
    }
    

    
}