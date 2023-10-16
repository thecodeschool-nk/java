package com.thecodeschool.file;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class FileReaderDemo1 {
    public static void main(String[] args) throws IOException {
        int ch;
        FileReader fr = null;
        try {
            fr = new FileReader("output.txt");
        } catch (FileNotFoundException fe) {
            System.out.println("File not found");
        }

        while ((ch = fr.read()) != -1) {
            System.out.print((char) ch);
        }

        fr.close();
    }
}
