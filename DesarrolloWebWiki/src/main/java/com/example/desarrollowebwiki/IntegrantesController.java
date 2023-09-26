package com.example.desarrollowebwiki;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IntegrantesController {

    @GetMapping("/listaIntegrantes")
    public String integrantesPage() {
        // Use GET to load the HTML for the "/integrantes" page
        return "listaIntegrantes"; // Assuming your HTML file is in "integrantes/index.html"
    }
}
