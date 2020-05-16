package Senfter.Working_with_Files;

import java.io.File;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Scanner;

import static java.nio.file.Files.delete;

public class File_Manipulation {
    public static void main(String[] args) throws Exception{
        File testfile = new File("src/Senfter/Working_with_Files/testfile.txt");
        testfile.createNewFile();
        System.out.println("File exists: "+testfile.exists());
        FileWriter fileWriter = new FileWriter("src/Senfter/Working_with_Files/testfile.txt");
        fileWriter.write("HELO DIS A TESTFILE");
        fileWriter.close();
        Scanner scanner = new Scanner(testfile);
        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            System.out.println(line);
        }
        System.out.println(testfile.getName());
        System.out.println(testfile.getAbsolutePath());
        BasicFileAttributes attr = Files.readAttributes(testfile.toPath(), BasicFileAttributes.class);
        System.out.println("creationTime: " + attr.creationTime());
        System.out.println("lastAccessTime: " + attr.lastAccessTime());
        System.out.println("lastModifiedTime: " + attr.lastModifiedTime());
        Path targetFile = Paths.get("C:\\Users\\leerh\\IdeaProjects\\Programming_4AHWII_Senfter\\src\\Working_with_Files\\testfile.txt");
        Files.copy(testfile.toPath(),targetFile);
    }
}
