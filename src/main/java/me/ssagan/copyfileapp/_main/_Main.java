package me.ssagan.copyfileapp._main;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class _Main {
    public static void main(String[] args) {
        String str = "";
        try (FileReader reader = new FileReader("file1.txt");
             FileWriter writer = new FileWriter("file2.txt")) {
            int inChar = reader.read();
            while (inChar != -1) {
                str = str + (char) inChar;
                inChar = reader.read();
            }
            writer.write(str);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
