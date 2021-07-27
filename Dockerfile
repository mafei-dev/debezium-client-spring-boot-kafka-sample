FROM openjdk:11-jre as debezium-client-spring-boot-kafka-sample
COPY /target/debezium-client-spring-boot-kafka-sample-0.0.1-SNAPSHOT.jar /app/debezium-client-spring-boot-kafka-sample-0.0.1-SNAPSHOT.jar
WORKDIR /app
RUN ["ls","-la"]
CMD ["java", "-jar", "debezium-client-spring-boot-kafka-sample-0.0.1-SNAPSHOT.jar"]