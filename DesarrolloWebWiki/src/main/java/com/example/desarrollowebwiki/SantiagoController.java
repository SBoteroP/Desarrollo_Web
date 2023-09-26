package com.example.desarrollowebwiki;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SantiagoController {

    @GetMapping("/integrantes/santiago")
    public String santiagoPage() {
        // Use GET to load the HTML for the "/integrantes/santiago" page
        return "integrantes/santiago";
    }
}
