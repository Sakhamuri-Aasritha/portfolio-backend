package com.aasritha.portfolio_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class SkillsController {

    @GetMapping("/api/skills")
    public List<Map<String, Object>> getSkills() {
        return List.of(
                Map.of(
                        "category", "Languages",
                        "items", List.of("Java", "Python", "C", "C++", "Shell Scripting")
                ),
                Map.of(
                        "category", "Backend",
                        "items", List.of("Spring Boot", "REST APIs", "Hibernate", "JUnit", "Microservices")
                ),
                Map.of(
                        "category", "Frontend",
                        "items", List.of("ReactJS", "HTML5", "CSS3", "JavaScript", "Bootstrap")
                ),
                Map.of(
                        "category", "Databases",
                        "items", List.of("MongoDB", "MySQL", "SQL Server")
                ),
                Map.of(
                        "category", "Cloud & DevOps",
                        "items", List.of("AWS (EC2, S3, RDS, VPC)", "Docker", "Kubernetes", "Jenkins", "CI/CD")
                ),
                Map.of(
                        "category", "Tools & Methodologies",
                        "items", List.of("Git", "Jira", "Agile (Scrum)", "TDD", "OOP", "Design Patterns")
                )
        );
    }
}
