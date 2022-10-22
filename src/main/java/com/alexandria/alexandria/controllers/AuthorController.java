package com.alexandria.alexandria.controllers;

import com.alexandria.alexandria.services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class AuthorController {
    @Autowired
    AuthorService authorService;

    @GetMapping("getAuthors")
    public String findAll(Model model){
        model.addAttribute("authors", authorService.getAuthors());
        return "all-authors";
    }
}
