package com.example.helloworld;

public class Task2 {
    public static void main(String[] args) {
        int sum = 0; // Переменная для хранения суммы чётных чисел
        int count = 0; // Переменная для подсчёта количества чётных чисел
        int nch= 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
                count++;

            }
            // else {
               // nch++;

          //  }
        }
        System.out.println("Сумма всех чётных чисел от 1 до 100: " + sum);
        System.out.println("Количество чётных чисел от 1 до 100: " + count);
        System.out.println("Толмач: file:///C:/Users/user/Desktop/123456.jpg");
        //System.out.println("здесь что-то будет"+nch);
    }
}
