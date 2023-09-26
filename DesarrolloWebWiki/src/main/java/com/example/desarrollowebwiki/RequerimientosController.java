package com.example.desarrollowebwiki;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RequerimientosController {

    @GetMapping("/main/requerimientos")
    public String requerimientosPage() {
        // Use GET to load the HTML for the "requerimientos" page
        return "main/requerimientos";
    }
}
