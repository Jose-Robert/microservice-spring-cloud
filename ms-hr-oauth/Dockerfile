FROM openjdk:11
VOLUME /tmp
ADD ./target/hr-oauth.jar oauth.jar
ENTRYPOINT ["java","-jar","/oauth.jar"]