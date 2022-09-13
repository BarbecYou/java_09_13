package hu.petrik.gitbevezeto;

import java.util.Random;

public class Feladat15 {
    public static void main(String[] args) {
        int[] szamok = new int[25];
        Random rnd = new Random();

        for (int i = 0; i < 25; i++){
            szamok[i] = rnd.nextInt(100);
        }

        for (int i = 0; i < 25; i++){
            if (i % 2 == 1){
                System.out.println(szamok[i] * szamok[i]);
            }
        }
    }
}
