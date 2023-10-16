package com.thecodeschool.file;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderDemo {
 
    public static void main(String[] args) {
        try {
            FileInputStream inputStream = new FileInputStream("output.txt");
            InputStreamReader reader = new InputStreamReader(inputStream);
            int character;
 
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            reader.close();
 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
 
}