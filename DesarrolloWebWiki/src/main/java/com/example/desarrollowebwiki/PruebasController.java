package com.example.desarrollowebwiki;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PruebasController {

    @GetMapping("/pruebas")
    public String pruebasPage() {
        // Use GET to load the HTML for the "/pruebas" page
        return "pruebas"; // Assuming your HTML file is in "pruebas/index.html"
    }
}
