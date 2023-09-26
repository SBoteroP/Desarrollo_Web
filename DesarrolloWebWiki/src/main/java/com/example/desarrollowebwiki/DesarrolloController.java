package com.example.desarrollowebwiki;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DesarrolloController {

    @GetMapping("/main/desarrollo")
    public String desarrolloPage() {
        // Use GET to load the HTML for the "desarrollo" page
        return "main/desarrollo";
    }
}
