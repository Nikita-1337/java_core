package com.example.helloworld;

public class TaskWhile {
    public static void main(String[] args) {
       // int N = 17; // Переменная в котрой мы задали число N
        int N = 0; // Вторая переменная. Работает только в случае, когда первая N переменная отключена
        metod(N);

    }

    public static void metod(int N) {
        if (N > 1) {  //Условие,что если N больше единицы,то запускается цикл while
            int c = 1; // Переменная, которая нужна для создания условной еденицы. Нужна для работы цикла
            while (c <= N) {
                System.out.println(c);
                c++;
            }
        }else{
            System.out.println("████████▀▀▀██████████████████\n" +
                    "█████▀░▄█▀▀▀▀▀▀▀▀████████████\n" +
                    "███░██▀░░░░░░░░░░░░██████████\n" +
                    "████▀▀░░░░░░░░░░░░░░▀████████\n" +
                    "███▀░░░░░░░░░░░░░░░░░████████\n" +
                    "██░░░░░░░░░░░░░░░░░░░░███████\n" +
                    "██░░░░░░░░▄▄▄▄▄▄░▄█▀▀▀███████\n" +
                    "███░░░░░▄█▀░░░░▀█░░░░▄░░█████\n" +
                    "███▄░░░░█░░░▄░░░░█░░░▀▀░█████\n" +
                    "████▄░█░█░░▀▀░░░░█▀▀▀█▄██████\n" +
                    "█████▄█▀██▄░░░▄▄▀░░░░░▄██████\n" +
                    "███████░▀░░▀▀█▄▄▄▄▄▄▄▀▀░▀▀███\n" +
                    "██████▀▀░░▄█▀░░░░░░░░░░░░░▀██\n" +
                    "██████▀█░▄▀░░░░░░░░░░░░░░░░▀█\n" +
                    "███████▄██░░░░░░░░░░░░░░░░▄██\n" +
                    "██████████░██▄▄▄▄▄▄▄▄▄▄▀█████\n" +
                    "█████████▀█░░░░░░░░░░░▄██████\n" +
                    "█████████▄░▀█▄░░░░░░░▄███████\n" +
                    "██████████▄▄▄░▀▀▀▀▀▀▀░▀▄▀████\n" +
                    "█████████████████████████████");
        }
    }
}
