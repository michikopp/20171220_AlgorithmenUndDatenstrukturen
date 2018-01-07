package com.sabel.AlgorithmenUndDatenstrukturen;

import java.util.Scanner;

public class Quersumme {

    private int zahl, quersumme;

    public Quersumme() {
    }

    public Quersumme(int zahl) {
        this.zahl = zahl;
    }

    public int quersummeBerechnen(int zahl) {
        int summe = 0;
        while (0 != zahl) {
            // addiere die letzte ziffer der uebergebenen zahl zur summe
            summe = summe + (zahl % 10);
            // entferne die letzte ziffer der uebergebenen zahl
            zahl = zahl / 10;
        }
        return summe;
    }

    public static void main(String[] args) {
        Quersumme quersumme = new Quersumme();
        //System.out.println(quersumme.quersummeBerechnen(442));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte ganze Zahl eingeben: ");
        int eingabe = -1;
        while ((eingabe =scanner.nextInt()) != 0) {

            System.out.println("Querstumme von: " + eingabe + " = " + quersumme.quersummeBerechnen(eingabe) );
        }
        scanner.close();
    }

}
