# Pull base image.
FROM kaitest/alpine-jdk8:0.0.1

COPY ./build/libs/spring-boot-init-0.0.1-SNAPSHOT.jar /usr/src/myapp/spring-boot-init-0.0.1-SNAPSHOT.jar
WORKDIR /usr/src/myapp

EXPOSE 8080

CMD ["java","-jar","spring-boot-init-0.0.1-SNAPSHOT.jar"]