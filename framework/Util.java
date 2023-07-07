package etu1787.framework.util;
import java.util.ArrayList;
import java.util.List;
import java.net.URI;
import java.io.*;
import java.util.*;
import java.lang.reflect.Type;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Util {

    public Util()
    {}

    public static String getUrl(String url ){
        String[] parts = url.split("[?]");
        String path = parts[0];
        String[] pathParts = path.split("/");
        return pathParts[pathParts.length - 1];
    }   

    public ArrayList<File> getFiles(String path){
        ArrayList<File> files = new ArrayList<File>();
        File [] f = new File(path).listFiles();
        for(int i=0;i<f.length;i++){
            if(f[i].isDirectory()){
                files.add(f[i]);
                ArrayList<File> subfiles = getFiles(f[i].getPath());
                files.addAll(subfiles);
            }
        }
        return files;
    }  

    public Class[] getClasses(String packageName) throws ClassNotFoundException{
        ArrayList<Class> classes = new ArrayList<Class>();
        classes.add(Class.forName(packageName));
        return classes.toArray(new Class[classes.size()]);
    } 

    public HashMap<String,Type> getAttribute(Class<?> clazz){
        HashMap<String,Type> attribut = new HashMap<String,Type>();
        Field [] fields = clazz.getDeclaredFields();
        for(Field field: fields){
            String name = field.getName();
            Type type = field.getType();
            attribut.put(name,type);
        }
        return attribut;
    }

    public static Object parseType(String input, Class type) {
        Object answer = null;
        if (type == int.class || type == Integer.class) {
            answer = Integer.parseInt(input);
        } else if (type == double.class || type == Double.class) {
            answer = Double.parseDouble(input);
        } else if (type == float.class || type == Float.class) {
            answer = Float.parseFloat(input);
        } else if (type == java.sql.Date.class) {
            answer = java.sql.Date.valueOf(input);
        } else if (type == LocalDate.class) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            answer = LocalDate.parse(input, formatter);
        } else if (type == java.sql.Time.class) {
            answer = java.sql.Time.valueOf(input);
        } else if (type == boolean.class || type == Boolean.class) {
            answer = Boolean.parseBoolean(input);
        } else {
            answer = input;
        }
        return answer;
    }

}

