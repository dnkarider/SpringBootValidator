package com.example.Example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AuthorizationController {
    AuthorizationService service = new AuthorizationService();

    @GetMapping("/authorize")
    public String getAuthorities(@RequestParam("user") String user, @RequestParam("password") String password) {
        String result = "";
        List<Authorities> list = service.getAuthorities(user, password);
        for (Authorities roots : list) {
            if (roots == Authorities.WRITE) {
                result += Authorities.WRITE + "\n";
            }
            if (roots == Authorities.READ) {
                result += Authorities.READ + "\n";
            }
            if (roots == Authorities.DELETE) {
                result += Authorities.DELETE + "\n";
            }
        }
        return result;
    }
}
