package com.example.desarrollowebwiki;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JulianController {

    @GetMapping("/integrantes/julian")
    public String julianPage() {
        // Use GET to load the HTML for the "/integrantes/julian" page
        return "integrantes/julian";
    }
}
