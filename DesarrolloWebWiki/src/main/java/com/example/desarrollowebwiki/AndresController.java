package com.example.desarrollowebwiki;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AndresController {

    @GetMapping("/integrantes/andres")
    public String andresPage() {
        // Use GET to load the HTML for the "/integrantes/andres" page
        return "integrantes/andres";
    }
}
