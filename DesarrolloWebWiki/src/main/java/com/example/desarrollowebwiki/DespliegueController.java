package com.example.desarrollowebwiki;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DespliegueController {

    @GetMapping("/main/despliegue")
    public String desplieguePage() {
        // Use GET to load the HTML for the "despliegue" page
        return "main/despliegue";
    }
}
