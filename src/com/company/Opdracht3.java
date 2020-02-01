package com.company;

import javax.print.MultiDocPrintService;
import java.util.Scanner;

public class Opdracht3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter;
        System.out.println("\nOpdracht 7.3");
        System.out.println("Geef me nu 10 doubles, dan bereken ik het gemiddelde en tel ik hoeveel cijfers hoger zijn:");
        double[] getallen = new double[10];
        for (int i = 0; i < 10; i++) {
            getallen[i] = scanner.nextDouble();
        }
        double optellen = 0;
        for (double waarde : getallen) {
            optellen += waarde;
        }
        double gemiddelde = optellen / 10;
        System.out.println("Het gemiddelde is: " + gemiddelde);
        counter = 0;
        for (double waarde : getallen) {
            if (waarde > gemiddelde) {
                counter++;
            }
        }
        System.out.println("Het aantal doubles boven het gemiddelde is: " + counter);
    }
}
