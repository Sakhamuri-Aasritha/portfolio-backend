package com.aasritha.portfolio_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class AboutController {

    @GetMapping("/api/about")
    public Map<String, String> getAbout() {
        return Map.of(
                "heading", "About Me",
                "content",
                "I’m Aasritha Sakhamuri, a passionate Computer Science graduate student at UCM. " +
                        "I love building end-to-end applications with Java, Spring Boot, React, and AWS. " +
                        "When I’m not coding, I enjoy hiking, painting, and exploring new UX designs."
        );
    }
}
