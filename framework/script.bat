javac --release 8 -d . *.java
jar cvfm framework.jar MANIFEST.MF etu1787/framework/*.class etu1787/framework/annotation/*.class etu1787/framework/servlet/*.class etu1787/framework/util/*.class

xcopy /y framework.jar ..\TEST\WEB-INF\lib
xcopy /y framework.jar "D:\"

cd ..
cd TEST\WEB-INF\classes\
javac --release 8 -d . *.java