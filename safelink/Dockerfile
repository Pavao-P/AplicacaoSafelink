FROM openjdk:17-jdk-slim
RUN useradd -ms /bin/bash safelinkuser
WORKDIR /home/safelinkuser/app
COPY out/artifacts/safelink_jar/safelink.jar app.jar
RUN chown -R safelinkuser:safelinkuser /home/safelinkuser/app
USER safelinkuser
ENV PORT=8080
EXPOSE 8080
CMD ["java", "-jar", "app.jar"]