package com.example.desarrollowebwiki;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ArquitecturaController {

    @GetMapping("/arquitectura")
    public String arquitecturaPage() {
        // Use GET to load the HTML for the "/arquitectura" page
        return "arquitectura"; // Assuming your HTML file is in "arquitectura/index.html"
    }
}
