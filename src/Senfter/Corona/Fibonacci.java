package Senfter.Corona;

public class Fibonacci {
    public static void main(String[]args){
        System.out.println(search(500));
    }

    public static int search(int number){
        int num1=0; int temp; int num2=1;
        while(num2 <=number){
            temp=num2;num2+=num1;num1=temp;
        }
        return num2;
    }
}

/*
Umso größer die eingegebene Zahl ist umso höher ist die ABweichung der nächsthöheren Fibonacci Zahl im Durchschnitt
Nur Plus und minus mit Zahlen dadurch hohe effizienz
 */
