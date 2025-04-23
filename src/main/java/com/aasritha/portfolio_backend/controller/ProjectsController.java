package com.aasritha.portfolio_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class ProjectsController {

    @GetMapping("/api/projects")
    public List<Map<String,Object>> getProjects() {
        return List.of(
                Map.of(
                        "name",        "Resume Analyzer",
                        "imageUrl",    "/images/Resume.png",
                        "githubUrl",   "https://github.com/Sakhamuri-Aasritha/resume-analyzer-frontend",
                        "description", "Engineered a full-stack resume analysis system using Java, Spring Boot, and React.js to automate resume scoring, achieving\n" +
                                "90%+ accuracy and reducing manual review time by 70%."
                ),
                Map.of(
                        "name",        "Mobile Food Truck Ordering System",
                        "imageUrl",    "/images/food.jpg",
                        "githubUrl",   "https://github.com/Sakhamuri-Aasritha/Mobile-Food-Truck-Ordering-System",
                        "description", "Built a full-stack web application using Flask and MongoDB, reducing order placement load time by ~35%."
                ),
                Map.of(
                        "name",        "Live Image Segmentation",
                        "imageUrl",    "/images/image.png",
                        "githubUrl",   "https://github.com/Sakhamuri-Aasritha/IMAGE-SEGMENTATION-USING-MASK-RCNN",
                        "description", "Improved segmentation accuracy by 30% and processing speed by 40% using Mask R-CNN and TensorFlow for image\n" +
                                "recognition."
                ),
                Map.of(
                        "name",        "Credit Card Fraud Detection",
                        "imageUrl",    "/images/credit.png",
                        "githubUrl",   "https://github.com/Sakhamuri-Aasritha",
                        "description", "Achieved 98% accuracy in detecting fraudulent transactions using logistic regression on 280K+ real-world data records using Python, Scikit-learn, and Jupyter."
                )
        );
    }
}
