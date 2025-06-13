import jakarta.persistence.*;
import java.util.UUID;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Fix: Correct annotation
    private Long id; // Changed to Long, because GenerationType.IDENTITY typically works with numeric IDs

    private String username;
    private String userAddress;
    private String contactDetails;

    // Getters and Setters (add using Lombok if preferred)
}



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getusers")
    public List<User> getUserList() {
        return userService.getAllUsers();
    }
}


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}


import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
  //findall can be used 
}
------------------------------------

@PostMapping("/createuser")
public void createUser(@RequestBody User user){
    System.out.print(user.getUsername());
    userService.saveuser(user);


}

//in service  create one more method 
public void saveuser(User user){
    userrepo.save(user);
}

----use requestparam
----in form submit ~!!!1

@PostMapping("/createuser")
public void createUser(@RequestParam String username,
                       @RequestParam String userAddress,
                       @RequestParam String contactDetails) {
    User user = new User();
    user.setUsername(username);
    user.setUserAddress(userAddress);
    user.setContactDetails(contactDetails);

    userService.saveUser(user);
}

----get user by id 
//controller method 
@GetMapping("/getuser/{userid}")
public User getUserById(@pathVariable UUID userid){
    User u=userservice.getuserbyid(id);
    if(u){
        return u;
    }
    else{
        User u= new User("notfound");
        return u;
    }
}

//service func 
public User getUserById(UUID id ){
    User queried_user=userRepository.findById(id);
    if(queried_user){
        return queried_user;
    }
    else{
        return null;
    }
}

//--- get user by username n email 

//  i need to make custom query 
import java.util.Optional;
@Repository 
public interface UserRepository extends JpaRepository<User,Long>{
    Optional<User> findByUsernameAndUserEmail(String username, String userEmail);
}