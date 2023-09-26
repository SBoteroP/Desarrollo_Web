package com.example.desarrollowebwiki;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PresentacionController {

    @GetMapping("/main/presentacion")
    public String presentacionPage() {
        // Use GET to load the HTML for the "presentacion" page
        return "main/presentacion";
    }
}
