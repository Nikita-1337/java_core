package com.example.helloworld;

//Вывести все четные числа от 1 до 100 на экран используя цикл for
public class TaskFor {
    public static void main(String[] args) {
        int N = 100; // Переменная в котрой мы задали число N
        metod(N);
        System.out.println(metod(N));
    }

    public static String metod(int N) {
        int c = 2; // Переменная, которая нужна для создания условной еденицы. Нужна для работы цикла
        for (int с = 2; с <= 100; с += 2) {
            System.out.println(c);
            c++;
        }
        return "привет";
    }

}


