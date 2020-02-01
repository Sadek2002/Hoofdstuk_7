package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nOpdracht 7.1\n");
        System.out.println("Hier komen 100 worpen met een dobbelsteen");
        // maak een int-array voor 100 ints
        int[] dobbelsteenworpen = new int[100];
        // vul deze alle 100 met willekeurige getallen van 1 t/m 6 (gebruik Math.random)
        for (int i = 0; i < 100; i++) {
            int random = (int) (Math.random() * 6 + 1);
            dobbelsteenworpen[i] = random;
        }
        // print vervolgens alle 100 ints op het scherm.
        int counter = 1;
        for (int worp : dobbelsteenworpen) {
            System.out.print(worp + " ");
            if (counter % 10 == 0) {
                System.out.println();
            }
            counter++;
        }
    }
}
