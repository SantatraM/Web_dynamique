cd TEST
jar -cf test_framework.war *
xcopy /y .\test_framework.war "C:\apache-tomcat-8.5.82\webapps"