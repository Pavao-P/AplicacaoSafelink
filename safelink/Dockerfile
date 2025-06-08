FROM openjdk:17-jdk-slim
ENV SPRING_PROFILES_ACTIVE=prod
RUN useradd -m springuser
WORKDIR /app
COPY target/*.jar app.jar
RUN chown -R springuser:springuser /app
USER springuser
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
