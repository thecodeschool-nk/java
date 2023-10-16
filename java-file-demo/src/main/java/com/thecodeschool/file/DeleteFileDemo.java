package com.thecodeschool.file;

import java.io.File;

public class DeleteFileDemo {
  public static void main(String[] args) { 
    File myObj = new File("output.txt");
    if (myObj.delete()) { 
      System.out.println("Deleted the file: " + myObj.getName());
    } else {
      System.out.println("Failed to delete the file.");
    } 
  } 
}