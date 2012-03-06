package fr.ippon.tatami.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Welcome page.
 *
 * @author Julien Dubois
 */
@Controller
public class WelcomeController {

    @RequestMapping("/welcome")
    public String welcome() {
        return "welcome";
    }
}