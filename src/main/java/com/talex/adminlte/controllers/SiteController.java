package com.talex.adminlte.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SiteController {
    @GetMapping("/")
    public String getDashboard() {
        return "dashboard";
    }   
}
