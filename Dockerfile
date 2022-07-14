FROM openjdk:8-jdk-alpine
VOLUME /tmp
MAINTAINER Dimas Maryanto <software.dimas_m@icloud.com>

ADD  ./startup.sh  /tmp
ADD ./target/springboot-consul-k8s-example-consumer-v1.0.4-release.jar /tmp/springboot-consul-k8s-example-consumer-v1.0.4-release.jar


ENTRYPOINT ["sh", "/tmp/startup.sh", "/tmp/springboot-consul-k8s-example-consumer-v1.0.4-release"]