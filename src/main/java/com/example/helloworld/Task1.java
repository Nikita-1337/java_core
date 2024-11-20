package com.example.helloworld;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        // int numberN = 5;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи число");
        int numberN = scanner.nextInt();
        if (numberN < 1) {
            System.out.println("Числа для вывода отсутствуют");

        } else {
            int i = 1;
            while (i <= numberN) {
                System.out.println(i);
                i++;
            }
        }
    }
}
