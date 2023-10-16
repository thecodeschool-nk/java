package com.thecodeschool.properties;

import java.util.*;
import java.io.*;  
public class PropertiesDemo {
public static void main(String[] args)throws Exception{  
    FileReader reader=new FileReader("db.properties");  
      
    Properties p=new Properties();  
    p.load(reader);
    System.out.println(p.getProperty("url"));
    System.out.println(p.getProperty("username"));
    System.out.println(p.getProperty("password"));
}  
}  