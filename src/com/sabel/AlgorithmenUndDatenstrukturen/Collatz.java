package com.sabel.AlgorithmenUndDatenstrukturen;

import java.util.Scanner;

public class Collatz {

    public int algorithmus(int x) {
        int z = 0;
        while (x != 1) {
            if ((x % 2) == 0) {
                x = x / 2;
            } else {
                x = x *3;
                x++;
            }
            z++;
        }
        return z;
    }

    public static void main(String[] args) {
        Collatz collatz = new Collatz();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte eine ganze Zahl eingeben: ");
        System.out.println(collatz.algorithmus(scanner.nextInt()));
        scanner.close();
    }
}
