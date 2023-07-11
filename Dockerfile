#cmd : docker build -t skill-service .
FROM openjdk:17-jdk-slim

ENV HOS=192.168.29.141
ENV IPDB=172.17.0.2
ENV CNF=173.17.0.5

# Set the working directory to /app
WORKDIR /app

# Copy the Eureka server JAR file to the container
COPY target/skill-service.jar /app

# Expose the default Eureka server port
EXPOSE 9091

# Start the Eureka server
CMD ["java", "-jar", "skill-service.jar"]