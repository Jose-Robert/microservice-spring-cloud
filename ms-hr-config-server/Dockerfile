FROM openjdk:11
VOLUME /tmp
EXPOSE 8888
ADD ./target/hr-config-server.jar config-server.jar
ENTRYPOINT ["java","-jar","/config-server.jar"]