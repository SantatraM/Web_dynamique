package etu1787.framework.util;
import java.util.ArrayList;
import java.util.List;
import java.net.URI;
import java.io.*;

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


}

