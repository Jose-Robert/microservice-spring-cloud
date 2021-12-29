FROM openjdk:11
VOLUME /tmp
ADD ./target/hr-worker.jar worker.jar
ENTRYPOINT ["java","-jar","/worker.jar"]