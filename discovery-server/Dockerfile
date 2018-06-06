FROM java:8
WORKDIR /
ADD ./target/service-registry-1.0.0-SNAPSHOT.jar  .
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/service-registry-1.0.0-SNAPSHOT.jar"]