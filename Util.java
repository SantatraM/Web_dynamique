package etu1787.framework.util;
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

}

