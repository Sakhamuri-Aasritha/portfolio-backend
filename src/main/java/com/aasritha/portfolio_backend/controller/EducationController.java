package com.aasritha.portfolio_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class EducationController {

    @GetMapping("/api/education")
    public List<Map<String,Object>> getEducation() {
        return List.of(
                Map.of(
                        "degree",      "M.Sc., Computer Science",
                        "institution", "University of Central Missouri, Warrensburg, MO",
                        "period",      "Aug 2023 – May 2025",
                        "cgpa",        "3.4",
                        "courses", List.of(
                                "Advanced Database Systems",
                                "Operating Systems",
                                "Advanced Algorithms",
                                "Application Programming in C# and .NET",
                                "Programming Foundations in Data Science and AI",
                                "Compiler Design and Construction"
                        )
                ),
                Map.of(
                        "degree",      "B.Tech., Information Technology",
                        "institution", "Vasireddy Venkatadri Institute of Technology, AP, India",
                        "period",      "Jul 2019 – May 2023",
                        "cgpa",        "8.75/10",
                        "courses", List.of(
                                "Advanced Java Programming",
                                "Data Structures",
                                "Python Programming",
                                "Software Engineering",
                                "Unix and Shell Programming",
                                "Design and Analysis of Algorithms",
                                "Artificial Intelligence",
                                "Cloud Computing",
                                "Web Technologies",
                                "DevOps"
                        )
                )
        );
    }
}
