FROM tomcat:9.0-jre8

#LABEL maintainer=”deepak@softwareyoga.com”

COPY ./target/*.war $CATALINA_HOME/webapps

EXPOSE 8085