package rs.viveksingh.auth2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/message")
    public String welcomeMessage(){
        return "Phirse agaya chutiya";
    }

}