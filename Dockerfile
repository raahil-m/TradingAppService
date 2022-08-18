FROM maven:3.6.3-openjdk-11 AS compile
COPY . /usr/src/mymaven
WORKDIR /usr/src/mymaven
RUN mvn -Dmaven.test.skip=true clean package

FROM openjdk:11
COPY --from=compile /usr/src/mymaven/target/TradingAppService-1.0-SNAPSHOT.jar app.jar
COPY src/main/resources/application.properties application.properties
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/urandom -jar /app.jar" ]