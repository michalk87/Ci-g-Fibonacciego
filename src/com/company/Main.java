package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę Ciągu Fbionacciego:");

        int liczbaFibonacciego = scanner.nextInt();

        int[] tab = new int[liczbaFibonacciego];

        tab[0] = 1;
        tab[1] = 1;

        for (int i = 2; i < liczbaFibonacciego; i++) {

            tab[i] = tab[i - 2] + tab[i - 1];
        }


        System.out.println(liczbaFibonacciego + " liczba ciągu Fibonacciego to: " + tab[tab.length - 1]);
        System.out.println(" ");
        System.out.println("Ciąg Fibonacciego liczby " + liczbaFibonacciego + " to: ");

        for (int fibonacci : tab) {

            System.out.println(fibonacci);

        }

    }
}
