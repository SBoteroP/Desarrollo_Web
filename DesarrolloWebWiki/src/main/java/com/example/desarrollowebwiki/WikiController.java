package com.example.desarrollowebwiki;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class WikiController {

    @Autowired
    private RepoContacto repoContacto;

    @GetMapping
    public String load() {
        // Handle GET requests to display the main/index page
        return "main/index";
    }

    @PostMapping()
    public String submitContactForm(@RequestParam String name, @RequestParam String email) {
        // Handle POST requests for form submission
        Contacto entry = new Contacto();
        entry.setNombre(name);
        entry.setEmail(email);

        // Use the repository to save the Contacto entity
        repoContacto.save(entry);
        return "main/index";
    }
}









