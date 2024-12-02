package com.example.helloworld;

import java.util.Scanner;

public class Massive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите размер массива");
        int ch = sc.nextInt();

        int[] mas = new int[ch];

        System.out.println("Введите элементы массива");
        int i = 0;
        while (i < mas.length) {
            System.out.print(" Элемент " + (i + 1) + ": ");
            mas[i] = sc.nextInt();
            i++;
        }

        System.out.println("Вы создали массив");
        i = 0;
        while (i < mas.length) {
            System.out.println(mas[i] + " ");
            i++;
        }

        // Поиск минимального и максимального значений
        int min = mas[0];
        int max = mas[0];
        i = 1;
        while (i < mas.length) {
            if (mas[i] < min) {
                min = mas[i];
            }
            if (mas[i] > max) {
                max = mas[i];
            }
            i++;
        }

        // Вывод минимального и максимального значения
        System.out.println("Минимальное значение массива: " + min);
        System.out.println("Максимальное значение массива: " + max);
    }
}
