package com.example.helloworld;
import java.util.Scanner;

public class Massive4 {
    public static void main(String[] args) {
        int[][] matr = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        String[][] str = new String[2][2];
        int sum = 0;
        Scanner scan = new Scanner(System.in);

        str[1][1] = "Дан двумерный массив";
        System.out.println(str[1][1]);


        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr[i].length; j++) {
                System.out.print(matr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Сосчитать его сумму?");
        System.out.println("Да/нет?");

        // Ввод ответа пользователя
        String vvod = scan.nextLine().trim().toLowerCase();

        if (vvod.equals("да")) {

            for (int i = 0; i < matr.length; i++) {
                for (int j = 0; j < matr[i].length; j++) {
                    sum += matr[i][j];
                }
            }
            System.out.println("Сумма всех чисел в массиве = " + sum);
        } else if (vvod.equals("нет")) {

            System.out.println("Галя, у нас отмена!");
        } else {

            System.out.println("░░░░░░░░░░░▄▄▀▀▀▀▀▀▀▀▄▄\n" +
                    "░░░░░░░░▄▀▀░░░░░░░░░░░░▀▄▄\n" +
                    "░░░░░░▄▀░░░░░░░░░░░░░░░░░░▀▄\n" +
                    "░░░░░▌░░░░░░░░░░░░░▀▄░░░░░░░▀▀▄\n" +
                    "░░░░▌░░░░░░░░░░░░░░░░▀▌░░░░░░░░▌\n" +
                    "░░░▐░░░░░░░░░░░░▒░░░░░▌░░░░░░░░▐\n" +
                    "░░░▌▐░░░░▐░░░░▐▒▒░░░░░▌░░░░░░░░░▌\n" +
                    "░░▐░▌░░░░▌░░▐░▌▒▒▒░░░▐░░░░░▒░▌▐░▐\n" +
                    "░░▐░▌▒░░░▌▄▄▀▀▌▌▒▒░▒░▐▀▌▀▌▄▒░▐▒▌░▌\n" +
                    "░░░▌▌░▒░░▐▀▄▌▌▐▐▒▒▒▒▐▐▐▒▐▒▌▌░▐▒▌▄▐\n" +
                    "░▄▀▄▐▒▒▒░▌▌▄▀▄▐░▌▌▒▐░▌▄▀▄░▐▒░▐▒▌░▀▄\n" +
                    "▀▄▀▒▒▌▒▒▄▀░▌█▐░░▐▐▀░░░▌█▐░▀▄▐▒▌▌░░░▀\n" +
                    "░▀▀▄▄▐▒▀▄▀░▀▄▀░░░░░░░░▀▄▀▄▀▒▌░▐\n" +
                    "░░░░▀▐▀▄▒▀▄░░░░░░░░▐░░░░░░▀▌▐\n" +
                    "░░░░░░▌▒▌▐▒▀░░░░░░░░░░░░░░▐▒▐\n" +
                    "░░░░░░▐░▐▒▌░░░░▄▄▀▀▀▀▄░░░░▌▒▐\n" +
                    "░░░░░░░▌▐▒▐▄░░░▐▒▒▒▒▒▌░░▄▀▒░▐\n" +
                    "░░░░░░▐░░▌▐▐▀▄░░▀▄▄▄▀░▄▀▐▒░░▐\n" +
                    "░░░░░░▌▌░▌▐░▌▒▀▄▄░░░░▄▌▐░▌▒░▐\n" +
                    "░░░░░▐▒▐░▐▐░▌▒▒▒▒▀▀▄▀▌▐░░▌▒░▌\n" +
                    "░░░░░▌▒▒▌▐▒▌▒▒▒▒▒▒▒▒▐▀▄▌░▐▒▒▌");
        }

        scan.close();
    }
}