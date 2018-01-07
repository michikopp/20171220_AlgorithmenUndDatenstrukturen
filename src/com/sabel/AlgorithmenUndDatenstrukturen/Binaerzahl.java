package com.sabel.AlgorithmenUndDatenstrukturen;

import java.util.Scanner;

public class Binaerzahl {
    public String dezimalInBinaer(int zahl) {
        int schleifenDurchlaeufe = 0;
        String binaerzahl = "";
        String erg = "";
        int c = 1;
        while (zahl > 0) {
            erg = erg + (zahl % 2)*c;
            c = c * 10;
            zahl = zahl / 2;
            schleifenDurchlaeufe++;
        }
        System.out.println("Schleifendurchlaeufe: "+ schleifenDurchlaeufe);
        return erg;
    }

    public static void main(String[] args) {
        Binaerzahl binaerzahl = new Binaerzahl();
        Scanner scanner = new Scanner(System.in);

        int eingabe = -1;
        while ((eingabe =scanner.nextInt()) != 0) {

            System.out.println(binaerzahl.dezimalInBinaer(eingabe));
        }
        scanner.close();
    }
}
