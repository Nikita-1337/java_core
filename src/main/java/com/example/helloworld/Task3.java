package com.example.helloworld;

public class Task3 {public static void main(String[] args) {
    int sum = 0; // Переменная для хранения суммы нечётных чисел
    int count = 0; // Переменная для подсчёта количества нечётных чисел
    for (int i = 1; i <= 111; i++) {
        if (i % 2 != 0) {
            sum += i;
            count++;

        } else  {

        }
    }
    System.out.println("Сумма всех нечётных чисел от 1 до 111: " + sum);
    System.out.println("Количество нечётных чисел от 1 до 111: " + count);
}
}
