package io.github.webcane.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by cane
 */
@Controller
public class HomeController {

    @RequestMapping("/home")
    public String home() {
        return "index";
        //return "forward:/index.html";
    }
}
