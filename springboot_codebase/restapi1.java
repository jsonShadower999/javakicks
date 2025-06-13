// TEST YOUR SERVER , HELLO WORLD API
@Controller
@RequestMapping("myweb")
public class MyWebController{
    @GetMapping("/testserver")
    public String testthewebserver(){
        return "hello world"

    }
}


//api to return current time
import java.time.LocalDateTime;
@Controller
@RequestMapping("myweb")
public class TimeExtractor{
    @GetMapping("/testtime")
    public String testtimeextractor(){
        return LocalDateTime.now()

    }
}

// you have config mapping and properties defined under the application.properties file 
// extract it in api 

application.properties 
spring.application.name=extract-api-dev 
server.port=8081
spring.application.userkey="archived-user-297"

@RestController
public class ConfigController{
    @Value("${spring.application.userkey}")
    private String userkey;

    @GetMapping("/extractuserkey")
    public String getUserKey(){
        return userkey;
    }
}

