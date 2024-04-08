package com.example.demowebapp;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v2")
public class Controller {

    @GetMapping(path = "/ciao/{provincia}")
    public User controller(
            @RequestParam String nome,
            @PathVariable String provincia) {
        return new User(nome, provincia);
    }
}
