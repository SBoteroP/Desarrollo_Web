package com.example.desarrollowebwiki;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JuanbaController {

    @GetMapping("/integrantes/juanba")
    public String juanbaPage() {
        // Use GET to load the HTML for the "/integrantes/juanba" page
        return "integrantes/juanba";
    }
}
