FROM openjdk:11
VOLUME /tmp
ADD ./target/hr-user.jar user.jar
ENTRYPOINT ["java","-jar","/user.jar"]