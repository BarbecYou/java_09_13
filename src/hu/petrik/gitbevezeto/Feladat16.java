package hu.petrik.gitbevezeto;

import java.util.Scanner;

public class Feladat16 {
    public static void main(String[] args) {
        int[] szamok = new int[5];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < szamok.length; i++){
            System.out.print("Adjon meg egy számot: ");
            szamok[i] = sc.nextInt();
        }

        System.out.println("megadás sorrendje: ");
        for (int szam :
             szamok) {
            System.out.print(szam);
        }
        System.out.println();
        System.out.println("fordított sorrend");
        for (int i = 4; i >= 0; i--){
            System.out.print(szamok[i]);
        }
        System.out.println();
        System.out.println("minden második elem");
        for (int i = 1; i < 5; i+=2){
            System.out.print(szamok[i]);
        }
        System.out.println();
        System.out.println("adjon meg egy számot 1 és 5 között");
        int bekertIndex = sc.nextInt();
        for (int i = 0; i < 5; i++){
            if (i == bekertIndex - 1){
                System.out.println(szamok[i]);
            }
        }
    }
}
