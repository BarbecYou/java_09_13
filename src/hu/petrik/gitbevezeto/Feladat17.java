package hu.petrik.gitbevezeto;

import java.util.Random;

public class Feladat17 {
    public static void main(String[] args) {
        int[] szamTomb1 = new int[10];
        int[] szamTomb2 = new int[10];
        int[] eredmenyTomb = new int[10];
        Random rnd = new Random();

        for (int i = 0; i < 10; i++){
            szamTomb1[i] = rnd.nextInt(100);
            szamTomb2[i] = rnd.nextInt(100);
            eredmenyTomb[i] = szamTomb1[i] + szamTomb2[i];
        }

        for (int i = 0; i < 10; i++){
            System.out.printf("első tömb eleme: %d\n", szamTomb1[i]);
            System.out.printf("második tömb eleme: %d\n", szamTomb2[i]);
            System.out.printf("a két elem összege: %d\n", eredmenyTomb[i]);
        }
    }
}
