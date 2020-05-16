package Senfter.Revision;

import java.util.Arrays;

public class Binary_Search {
    public static void main(String[] args) {
        int[] rans = befüllen(1000);
        pos(rans, 500);
        //ausgabe(rans);
    }

    public static void pos(int[] arr, int toS) {
        int pos = arr.length / 2;
        int schrittweite = pos / 2;
        for (int i = 0; i < (int) (Math.log(arr.length) / Math.log(2)) + 1; i++) {
            if (arr[pos] != toS) {
                if (arr[pos] > toS) pos -= schrittweite;
                else if (arr[pos] < toS) pos += schrittweite;
                schrittweite = schrittweite / 2;
                if (schrittweite == 0) schrittweite = 1;
            }
        }
        if (arr[pos] == toS) {
            System.out.println("Zahl auf Position: " + pos);
            System.out.println("Gesuchte Zahl: " + toS + "   Zahl auf gefundener Position["+pos+"]: " + arr[pos]);
        } else System.out.println("Zahl nicht vorhanden");
    }

    public static int[] befüllen(int laenge) {
        int[] nums = new int[laenge];
        for (int i = 0; i < laenge; i++) {
            int random = (int) (Math.random() * laenge + 1);
            nums[i] = random;
        }

        Arrays.sort(nums);
        return nums;
    }

    public static void ausgabe(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + ": " + arr[i]);
        }
    }
}


