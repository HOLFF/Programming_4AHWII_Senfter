package Senfter.Corona;

public class Primyahl {
    public static void main(String[] args){
        int count =0;
        boolean[] ausgabe=prim(1000);
        for (int i = 2;i<1000;i++){
            if (ausgabe[i] == true) {
                System.out.println(i);
                count++;
            }

        }
        System.out.println(count);

    }
    static boolean[] prim(int bereich){
        boolean[] bA=new boolean[bereich];
        for(int i=0;i<bereich;i++)bA[i]=true;
        for (int i = 2;i<Math.sqrt(bereich);i++){
            if(bA[i]==true){
                int g = i;
                while(g<bereich){
                    g+=i;
                    try {
                        bA[g]=false;
                    }catch (Exception e){}

                }
            }
        }
        return bA;
    }
}

/*
der Aufwand steigt exponentiell mit dem Zahlenbereich
 */