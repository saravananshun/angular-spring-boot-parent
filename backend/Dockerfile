FROM openjdk:8-jdk-alpine

LABEL maintainer="saravanan.shun@gmail.com"

VOLUME /apps

RUN mvn clean install -U

EXPOSE 8080
# The application's jar file
ARG JAR_FILE=target/angularspringboot.jar

# Add the application's jar to the container
ADD ${JAR_FILE} app.jar

# Run the jar file
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]