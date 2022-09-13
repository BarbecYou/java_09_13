package hu.petrik.gitbevezeto;

import java.util.Scanner;

public class Feladat14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Adjon meg egy stringet: ");
        String megadottString = sc.nextLine();
        System.out.print("Válasszon egy opciót: ");
        String valasztottOpcio = sc.nextLine();

        switch (valasztottOpcio) {
            case "a":
                System.out.println(megadottString.toUpperCase());
                break;
            case "b":
                System.out.println(megadottString.toLowerCase());
                break;
            case "c":
                System.out.println(megadottString.length());
                break;
            case "d":
                System.out.print("Adjon meg egy másik stringet: ");
                String string2 = sc.nextLine();
                System.out.println(megadottString.equals(string2) ? "A két string egyenlő" : "A két string nem egyenlő");
                break;
            case "e":
                System.out.print("Intervallum kezdete (hanyadik index): ");
                int kezdet = sc.nextInt();
                System.out.print("Intervallum vége (hanyadik index): ");
                int veg = sc.nextInt();
                System.out.println(megadottString.substring(kezdet, veg + 1));
                break;
            case "f":
                System.out.println("Kilépés...");
                break;
            default:
                break;
        }
    }
}
