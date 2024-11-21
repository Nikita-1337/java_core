package com.example.helloworld;

import java.util.Scanner; // строка нужна для подключения сканнера

public class DZz9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);// Сканнер. Он нужен для считывания вводимых символов с клавиатуры
            System.out.println("Введи любое число от 1 до 3");
            int a = s.nextInt();
            if(a==1) {
            System.out.println("Вы ввели 1");
            }
            else if(a==2) {
                 System.out.println("Вы ввели 2");
             }
             else if(a==3) {
                 System.out.println("Вы ввели 3");
             } else {
                 System.out.println("____\uD83D\uDC38\uD83D\uDC38\uD83D\uDC38\uD83D\uDC38____\uD83D\uDC38\uD83D\uDC38\uD83D\uDC38\n" +
                         "___\uD83D\uDC38\uD83D\uDC38\uD83D\uDC38\uD83D\uDC38\uD83D\uDC38__\uD83D\uDC38\uD83D\uDC38\uD83D\uDC38\uD83D\uDC38\n" +
                         "__\uD83D\uDC38\uD83D\uDC38\uD83D\uDC38\uD83D\uDC38\uD83D\uDC38\uD83D\uDC38\uD83D\uDC38\uD83D\uDC38\uD83D\uDC38\uD83D\uDC38\uD83D\uDC38\n" +
                         "\uD83D\uDC38\uD83D\uDC38\uD83D\uDC38\uD83D\uDC38\uD83D\uDC38\uD83D\uDC38\uD83D\uDC38\uD83D\uDC38\uD83D\uDC38\uD83D\uDC38\uD83D\uDC38\uD83D\uDC38\uD83D\uDC38\n" +
                         "\uD83D\uDC38\uD83D\uDC38⚪\uFE0F⚫\uFE0F⚫\uFE0F⚪\uFE0F\uD83D\uDC38\uD83D\uDC38\uD83D\uDC38⚪\uFE0F⚫\uFE0F⚫\uFE0F⚪\uFE0F\n" +
                         "\uD83D\uDC38⚪\uFE0F⚫\uFE0F⚫\uFE0F⚪\uFE0F⚫\uFE0F⚪\uFE0F\uD83D\uDC38⚪\uFE0F⚫\uFE0F⚫\uFE0F⚪\uFE0F⚫\uFE0F⚪\uFE0F\n" +
                         "\uD83D\uDC38⚪\uFE0F⚫\uFE0F⚪\uFE0F⚫\uFE0F⚫\uFE0F⚪\uFE0F\uD83D\uDC38⚪\uFE0F⚫\uFE0F⚪\uFE0F⚫\uFE0F⚫\uFE0F⚪\uFE0F\n" +
                         "\uD83D\uDC38\uD83D\uDC38⚪\uFE0F⚫\uFE0F⚪\uFE0F⚪\uFE0F\uD83D\uDC38\uD83D\uDC38\uD83D\uDC38⚪\uFE0F⚫\uFE0F⚪\uFE0F⚪\uFE0F\n" +
                         "\uD83D\uDC38\uD83D\uDC38\uD83D\uDC38\uD83D\uDC38\uD83D\uDC38\uD83D\uDC38\uD83D\uDC38\uD83D\uDC38\uD83D\uDC38\uD83D\uDC38\uD83D\uDC38\uD83D\uDC38\uD83D\uDC38\n" +
                         "\uD83D\uDD34\uD83D\uDD34\uD83D\uDC38\uD83D\uDC38\uD83D\uDC38\uD83D\uDC38\uD83D\uDC38\uD83D\uDC38\uD83D\uDC38\uD83D\uDC38\uD83D\uDC38\uD83D\uDC38\uD83D\uDC38\n" +
                         "\uD83D\uDC38\uD83D\uDD34\uD83D\uDD34\uD83D\uDC38\uD83D\uDC38\uD83D\uDC38\uD83D\uDC38\uD83D\uDC38\uD83D\uDC38\uD83D\uDC38\uD83D\uDC38\uD83D\uDC38\n" +
                         "\uD83D\uDC38\uD83D\uDC38\uD83D\uDD34\uD83D\uDD34\uD83D\uDD34\uD83D\uDD34\uD83D\uDD34\uD83D\uDD34\uD83D\uDD34\uD83D\uDD34\uD83D\uDD34\uD83D\uDD34\uD83D\uDD34\n" +
                         "\uD83D\uDC38\uD83D\uDC38\uD83D\uDC38\uD83D\uDD34\uD83D\uDD34\uD83D\uDD34\uD83D\uDD34\uD83D\uDD34\uD83D\uDD34\uD83D\uDD34\uD83D\uDD34\uD83D\uDD34\uD83D\uDD34\n" +
                         "\uD83D\uDC38\uD83D\uDC38\uD83D\uDC38\uD83D\uDC38\uD83D\uDC38\uD83D\uDC38\uD83D\uDC38\uD83D\uDC38\uD83D\uDC38\uD83D\uDC38\uD83D\uDC38\n" +
                         "\uD83D\uDC38\uD83D\uDC38\uD83D\uDC38\uD83D\uDC38\uD83D\uDC38\uD83D\uDC38\uD83D\uDC38\uD83D\uDC38\uD83D\uDC38\uD83D\uDC38\n" +
                         "\uD83D\uDC38\uD83D\uDC38\uD83D\uDC38\uD83D\uDC38\uD83D\uDC38\uD83D\uDC38\uD83D\uDC38\uD83D\uDC38\uD83D\uDC38");
             }
        System.out.println("Блок схема:file:///C:/Users/user/Desktop/%D1%8B%D1%8B/Sxema.jpg");
    }
}

