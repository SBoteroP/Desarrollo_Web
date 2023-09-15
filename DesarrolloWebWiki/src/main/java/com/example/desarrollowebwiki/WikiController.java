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
        // Usa GET para traer el html de la página inicial
        return "main/index";
    }

    @PostMapping()
    public String submitContactForm(@RequestParam String name, @RequestParam String email) {
        // Utiliza el POST de Sping para hacer que la página se contacte con JPA (mySQL)
        Contacto entry = new Contacto();
        entry.setNombre(name);
        entry.setEmail(email);

        // Llama al repositorio para usar el método .save
        repoContacto.save(entry);
        return "main/index";
    }
}









