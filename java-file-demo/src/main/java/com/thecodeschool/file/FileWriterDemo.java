package com.thecodeschool.file;// Creating a text File using FileWriter

import java.io.FileWriter;
import java.io.IOException;

class FileWriterDemo {
    public static void main(String[] args) throws IOException {
        String str = "File Handling in Java using FileWriter and FileReader";

        FileWriter fileWriter = new FileWriter("output.txt");

        for (int i = 0; i < str.length(); i++) {
            fileWriter.write(str.charAt(i));
        }

        fileWriter.write("\nThis is another line.");
        System.out.println("Writing successful");

        fileWriter.close();
    }
}
