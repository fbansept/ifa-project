package org.ifa.fbansept.zikos.controller;

import org.ifa.fbansept.zikos.model.Utilisateur;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@CrossOrigin
public class HelloController {

    @GetMapping("/coucou/{id}")
    public String hello(Model model, @PathVariable int id) {

        String message = "Hello Spring Boot + JSP " + id;

        model.addAttribute("message", message);

        return "helloWorld";
    }

    @PostMapping("/submit-utilisateur")
    public String hello(@ModelAttribute("utilisateur") Utilisateur utilisateur) {

        return "helloWorld";
    }
}
