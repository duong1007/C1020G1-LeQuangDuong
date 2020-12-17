package text_file.bai_tap;

import java.io.*;

public class ReadFile {
    public static void main(String[] args) {
        try(FileReader reader = new FileReader("list.csv");
            BufferedReader bufferedReader = new BufferedReader(reader)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line.split(",")[5]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
