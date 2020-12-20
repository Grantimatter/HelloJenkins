FROM tomcat:9.0-alpine

#LABEL maintainer=”deepak@softwareyoga.com”

COPY target/HelloJenkins.war /usr/local/tomcat/webapps/

EXPOSE 8085

CMD [“catalina.sh”, “run”]