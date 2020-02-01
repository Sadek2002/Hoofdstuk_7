package com.company;

import java.util.Scanner;

public class Opdracht2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nOpdracht 7.2\n");
        System.out.print("Geef me 9 integers:");
        int[] userinput = new int[9];
        for (int i = 0; i < 9 ; i++) {
            userinput[i] = scanner.nextInt();
        }
        System.out.println("Daar komen ze, in omgekeerde volgorde: ");
        for (int i = 8; i >= 0; i--) {
            System.out.print(userinput[i] + " ");
        }
    }
}


