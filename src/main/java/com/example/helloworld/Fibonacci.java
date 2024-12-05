package com.example.helloworld;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 17;


        System.out.println("Фибоначчи:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibRec(i) + " ");
        }

        System.out.println();
        // Метод вывода чисел от 1 до n
        System.out.print("Числа от 1 до " + n + ": ");
        metod(1, n);  // Вызов метода с параметрами 1 и n
    }

    // Вычисление числа фибоначчи
    public static int fibRec(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibRec(n - 1) + fibRec(n - 2);  // Рекурсивное вычисление суммы двух предыдущих чисел Фибоначчи
        }
    }

    //  рекурсивного вывода чисел от s до f
    public static void metod(int s, int f) {
        // s - старт, f - финиш
        if (s > f) {
            return;
        }
        System.out.print(s + " ");
        metod(s + 1, f);
    }
}