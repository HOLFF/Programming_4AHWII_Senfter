package Senfter.Revision;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int amount=0;
        Scanner scanner = new Scanner(System.in);
        for(boolean w = false; w == false;){
            try {
                System.out.print("Wie viele Zufallszahlen sollen generiert werden?");
                amount = scanner.nextInt();
                w=true;
            } catch (InputMismatchException e){
                System.out.println("Try again:");
                scanner.nextLine();
                w=false;
            }
        }
        if(amount >= 3) {
            int[] data = new int[amount];
            fillArrayWithRandomDigits(data);
            int maximum = Integer.MIN_VALUE;
            for (int i = 0; i < data.length; i++) {
                if (data[i] > maximum); {
                    maximum=data[i];
                }
            }
            printArray(data);
            System.out.printf("Das Maximum ist %d", maximum);
        }
        else {
            System.out.println("Beim nächsten Mal einen Wert größer als 2 eingeben.");
        }
    }

    private static void fillArrayWithRandomDigits(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * Integer.MAX_VALUE);
        }
    }

    private static void printArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.printf("%s ", arr[i]);
        }         System.out.println("");
    }
} 