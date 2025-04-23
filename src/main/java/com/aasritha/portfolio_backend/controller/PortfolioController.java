package com.aasritha.portfolio_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class PortfolioController {

    @GetMapping("/api/summary")
    public Map<String, String> getSummary() {
        return Map.of(
                "greeting",     "Hi, I'm",
                "name",         "Aasritha Sakhamuri",
                "role",         "Software Engineer",
                "resumeLink",   "/resume.pdf",
                "contactEmail", "mailto:aasrithas068@gmail.com",
                "linkedinUrl",  "https://linkedin.com/in/aasritha-sakhamuri",
                "githubUrl",    "https://github.com/Sakhamuri-Aasritha"
        );
    }
}
