package com.aasritha.portfolio_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Map;

@RestController
public class ExperienceController {

    @GetMapping("/api/experience")
    public List<Map<String,Object>> getExperience() {
        return List.of(
                Map.of(
                        "role",        "Software Developer Intern",
                        "company",     "FocalOne Soft Inc",
                        "period",      "Jan 2025 – May 2025",
                        "location",    "Kansas, USA",
                        "url",         "http://focalonesoft.com/software-products-solutions.html",
                        "description","• Engineered scalable backend services and REST APIs using Java and Spring Boot, reducing processing time by 30%.\n" +
                                "• Designed responsive ReactJS frontends integrated with backend systems, improving UI performance by 40%.\n" +
                                "• Optimized SQL Server stored procedures and queries, increasing database performance by 25% and reducing CPU usage by 20%.\n" +
                                "• Automated CI/CD pipelines in Agile sprints using Jenkins and Docker, cutting deployment time by 50%.",
                        "tech",        List.of("Java","Spring Boot","ReactJS","DevOps","CI/CD","Jenkins","Docker","Kubernetes","JS/TS","NextJS")

                ),
                Map.of(
                        "role",        "Software Engineer Intern",
                        "company",     "Virtusa IT Services and IT Consulting",
                        "period",      "Jan 2023 – Apr 2023",
                        "location",    "India",
                        "url",         "https://www.virtusa.com",
                        "description","• Implemented RESTful APIs to support banking workflows, improving transaction reliability by 20% and reducing response failures by 15%.\n" +
                                "• Developed dynamic UI components and integrated frontend-backend pipelines, enhancing user task efficiency by 35% and reducing page latency by 25%.\n" +
                                "• Streamlined MySQL queries and optimized relational data handling, reducing DB load by 30%.\n" +
                                "• Participated in Agile ceremonies and TDD practices, increasing test coverage to 85% and reducing QA backlog by 50%.\n",
                        "tech",        List.of("Java","Spring Boot","ReactJS","MySQL","Jenkins","RESTful APIs")

                ),
                Map.of(
                        "role",        "AWS Cloud Intern",
                        "company",     "AICTE NEAT",
                        "period",      "Mar 2022 – May 2022",
                        "location",    "India",
                        "url",         "https://neat.aicte-india.org",
                        "description","• Deployed a cloud-based café website, improving uptime to 99.9% and reducing page load time by 35% across multiple regions.\n" +
                                "• Automated infrastructure deployment and monitoring, increasing deployment stability by 40% and reducing manual intervention by 60%.\n" +
                                "• Designed secure cloud environments, achieving 100% access control compliance and eliminating unauthorized access incidents.\n" +
                                "• Optimized architecture and resource usage, reducing cloud operating costs by 25% while maintaining high availability.",
                        "tech",        List.of("AWS EC2","S3","RDS","Terraform","CloudWatch","Security")

                )
                // …add more entries here…
        );
    }
}
