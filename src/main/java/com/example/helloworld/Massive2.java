package com.example.helloworld;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Massive2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int chislo = 0;

        while (true) {
            try {
                System.out.print("Задайте размер массива: ");
                chislo = scan.nextInt();
                if (chislo <= 0) {
                    System.out.println("Размер массива должен быть положительным числом.");
                } else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Ай! Введи пожалуйста число.");
                scan.next();
            }
        }

        int[] massive = new int[chislo];

        // Ввод элементов массива
        System.out.println("Элементы массива:");
        for (int i = 0; i < massive.length; i++) {
            while (true) {
                try {
                    System.out.print("Элемент " + (i + 1) + ": ");
                    massive[i] = scan.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Ай! Элемент массива может быть только числом.");
                    scan.next();
                }
            }
        }


        System.out.println("Массив:");
        for (int i = 0; i < massive.length; i++) {
            System.out.println("Элемент " + (i + 1) + ": " + massive[i]);
        }
        int min = massive[0];
        int max = massive[0];
        for (int i = 1; i < massive.length; i++) {
            if (massive[i] < min) {
                min = massive[i];
            }
            if (massive[i] > max) {
                max = massive[i];
            }
        }

        System.out.println("Минимальное значение массива: " + min);
        System.out.println("Максимальное значение массива: " + max);

        scan.close();
    }
}