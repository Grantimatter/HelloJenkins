FROM tomcat:9.0-jre8

#LABEL maintainer=”deepak@softwareyoga.com”

COPY ./target/HelloJenkins.war $CATALINE_HOME/webapps/

EXPOSE 8085