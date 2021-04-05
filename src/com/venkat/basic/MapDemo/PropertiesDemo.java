package com.venkat.basic.MapDemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo
{
    public static void main(String[] args) throws IOException {
        Properties p = new Properties();

        FileInputStream fis = new FileInputStream("/Users/venkatachada/Downloads/BasicJava/src/com/venkat/basic/MapDemo/app.properties");
        p.load(fis);

        System.out.println(p.getProperty("application.name"));
    }
}
