package com.thecodeschool.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class FileReaderDemo2 {
    public static void main(String[] args) {
        try {
            File myObj = new File("output.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
