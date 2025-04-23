FROM eclipse-temurin:21-jdk

WORKDIR /app
COPY . .
RUN chmod +x mvnw && ./mvnw clean package -DskipTests

EXPOSE 8080
CMD ["java","-jar","target/portfolio-backend-0.0.1-SNAPSHOT.jar"]
