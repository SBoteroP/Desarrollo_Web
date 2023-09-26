package com.example.desarrollowebwiki;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RootController {

    @GetMapping("/")
    public String redirectToMainIndex() {
        // Redirects the root URL ("/") to "/main/index"
        return "redirect:/main/index";
    }
}