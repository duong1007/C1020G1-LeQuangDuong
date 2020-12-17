package text_file.bai_tap;

import java.io.*;
import java.util.Scanner;

public class CopyFile {
    public static String Copy(File reader, File copy) {
        String str = "";
        int count = 0;
        try {
            FileReader fileReader = new FileReader(reader);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            if (!copy.exists()) {
                FileWriter fileWriter = new FileWriter(copy);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    bufferedWriter.write(line);
                    count += line.length() - 1;
                }
                bufferedWriter.flush();
                bufferedWriter.close();
                str = count + " Character";
            }
            else {
                str = " exists";
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return copy.getName() + " have" + str;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("File input :");
        String nameRead = scanner.nextLine();
        System.out.println("File copy :");
        String nameCopy = scanner.nextLine();
        try {
            File inFile = new File(nameRead);
            File outFile = new File(nameCopy);

            System.out.println("File " + Copy(inFile,outFile));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
