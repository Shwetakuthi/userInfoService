#Fetching java version
FROM openjdk:8
WORKDIR /app
COPY ./target/userInfoService-0.0.1-SNAPSHOT.jar /app
EXPOSE 8080
CMD ["java", "-jar", "userInfoService-0.0.1-SNAPSHOT.jar"]