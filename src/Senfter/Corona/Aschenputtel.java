package Senfter.Corona;
import java.io.*;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Aschenputtel {
    public static void main(String[]args)throws Exception {
    final PrintStream zahl=new PrintStream(new File("ZAHL.txt"));
    final PrintStream text=new PrintStream(new File("TEXT.txt"));
    String file = "Senfter/Corona/in.txt";
    Scanner s = new Scanner(file);
    while(s.hasNextLine()){
        process(s.nextLine(),zahl,text);
    }

    }

    public static boolean containsDigit(String s) {
        boolean containsDigit = false;

        if (s != null && !s.isEmpty()) {
            for (char c : s.toCharArray()) {
                if (containsDigit = Character.isDigit(c)) {
                    break;
                }
            }
        }

        return containsDigit;
    }

    public static void write(String in, PrintStream stream){
        System.setOut(stream);
        System.out.println(in);
    }

    public static void process(String in,PrintStream zahl,PrintStream text)throws Exception{
        Pattern p = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(in);
        boolean b = m.find();
        if(!b){
            if(containsDigit(in)){
                String numbers=in.replaceAll("[^0-9]", "");
                write(numbers,zahl);
            }
            else{
                write(in,text);
            }
        }
    }


}

