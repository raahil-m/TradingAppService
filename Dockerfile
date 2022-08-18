# FROM maven:3.6.3-openjdk-11 AS compile
# COPY . /usr/src/mymaven
# WORKDIR /usr/src/mymaven
# RUN mvn -Dmaven.test.skip=true clean package

FROM openjdk:11
# COPY --from=compile /usr/src/mymaven/target/TradingAppService-1.0-SNAPSHOT.jar app.jar
# COPY src/main/resources/application.properties application.properties
COPY target/demo-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app.jar"]
# ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/urandom -jar /app.jar" ]