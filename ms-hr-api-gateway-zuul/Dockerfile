FROM openjdk:11
VOLUME /tmp
EXPOSE 8765
ADD ./target/hr-api-gateway-zuul.jar api-gateway-zuul.jar
ENTRYPOINT ["java","-jar","/api-gateway-zuul.jar"]