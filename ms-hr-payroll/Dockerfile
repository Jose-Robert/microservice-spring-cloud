FROM openjdk:11
VOLUME /tmp
ADD ./target/hr-payroll.jar payroll.jar
ENTRYPOINT ["java","-jar","/payroll.jar"]