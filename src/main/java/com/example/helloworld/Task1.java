package com.example.helloworld;

public class Task1 {
    public static void main(String[] args) {
        int numberN = 5;
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
