@RestController 
@RequestMappin("/api/fodsrv")
public class UserController{
    @Autowired 
    private UserService userservice;
    public UserController(UserService userservice){
        this.userservice=userservice;
    }
    @GetMapping("/getuser/{username}")
    public User getUser(@PathVariable String username){
        User user_requested=userservice.getByUsername(username);
        System.out.println(user_requested);
        if(user_requested!=null){
            return user_requested;
        }
        else{
            User u_new=new User(null);
            return u_new;

        }

    }
    @GetMapping("/getAllUsers")
    public List<User> getAllUser(){
        List<User> user_list=userservice.findAll();
        return user_list;
    }
    @PostMapping("/createuser")
    public User createuser(@RequestBody User user_details){
        User new_user=new User(user_details);
        userservice.addUser(new_user);
        return new_user;
    }
    @PutMapping("/updateuser/{username}")
    public ResponseEntity<User> updateUser(@PathVariable String username,@RequestBody User user_new_obj){
        boolean update_stats=userservice.getUserByUsername(username,user_new_obj);
        if(update_stats){
            return ResponseEntity.ok("success")
        }
        else{
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("some thing went wrong");

        }
    }
    //password matching 
    @GetMapping("/checkpassword/{username}/{passkey_given}")
    public boolean checkpasscodematch(@PathVariable String userName, @PathVariable String passkey_given){
        String user_pass_stored=userservice.getPassword(userName);
        if(user_pass_stored==passkey_given){
            return true;
        }
        else{
            return false;
        }

    }

}

