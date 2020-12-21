package binary_file.bai_tap.copyfile;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class CopyFileBinary {

//    public static void copyFile(String source,String target) {
//        try {
//            byte[] allBytes = Files.readAllBytes(Paths.get(source));
//            Files.write(Paths.get(target), allBytes);
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }
//    }

    private static final int BUFFER_SIZE = 4096;

    public static boolean copyFile(String source, String target) {
        try {
            File fileSource = new File(source);
            File fileTarget = new File(target);

            if (!fileSource.exists() || fileTarget.exists()) {
                return false;
            }

            FileInputStream fileInputStream = new FileInputStream(source);
            InputStream inputStream = new BufferedInputStream(fileInputStream);
            FileOutputStream fileOutputStream = new FileOutputStream(target);
            OutputStream outputStream = new BufferedOutputStream(fileOutputStream);

            byte[] buffer = new byte[BUFFER_SIZE];

            while (inputStream.read(buffer) != -1) {
                outputStream.write(buffer);
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter source file :");
        String inputFile = scanner.next();
        System.out.println("Enter target file :");
        String outputFile = scanner.next();
        if (copyFile(inputFile,outputFile)) {
            System.out.println("Copy done");
        } else {
            System.err.println("File source not found or File target exist");
        }
    }
}
