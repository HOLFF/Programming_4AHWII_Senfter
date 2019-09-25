package Senfter;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Geben sie die Obergrenze ein:");
        int ober = s.nextInt();
        System.out.println("Geben sie die Untergrenze ein:");
        int unter = s.nextInt();
        s.close();
    grenz(ober,unter);
    }
    public static void grenz(int ober,int unter){
        int num= 0; int f1=0; int f2; int f3=1;
        while(f3 <=ober){
            if(f3>unter)num++;
            f2=f3;f3+=f1;f1=f2;
        }
        System.out.println("Die Anzahl der Senfter.Fibonacci-Zahlen zwischen "+unter+" und "+ober+" beträgt: "+num);
    }
}
