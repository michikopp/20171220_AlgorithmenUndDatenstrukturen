package com.sabel.AlgorithmenUndDatenstrukturen;

import java.util.Scanner;

public class Euklid {

    public int gemeinsamerTeiler(int zahl1, int zahl2) {
        while (zahl2 != 0) {
            if (zahl1 > zahl2) {
                zahl1 = zahl1 - zahl2;
            } else {
                zahl2 = zahl2 - zahl1;
            }
        }
        return zahl1;
    }

    public static void main(String[] args) {
        Euklid euklid = new Euklid();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte zwei ganze Zahlen mit Zeilenumbrug getrennt eingeben:");
        System.out.println("Gemeinsamer Teiler: " + euklid.gemeinsamerTeiler(scanner.nextInt(), scanner.nextInt()));
        scanner.close();
    }
}
