#docker run -d -p 8080:8080 -v /mnt/c/Users/Musa\ Shakib/Documents/Programs/Docker_Presentation/SimpleProject/build/libs/:/usr/local/tomcat/webapps simple_project
FROM tomcat:9.0.5-jre8

RUN rm -rf /usr/local/tomcat/webapps/*

ADD SimpleProject/build/libs/SimpleProject.war /usr/local/tomcat/webapps/ROOT.war

EXPOSE 8080

CMD ["catalina.sh", "run"]