package com.example.helloworld;
import java.util.Scanner;

public class TaskBreakContinue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        metod(sc);
        sc.close();  // Закрытие сканера
    }

    public static void metod(Scanner sc) {

        System.out.print("Введите число от 1 до 7: ");
        int num = sc.nextInt();
        switch (num) {
            case 1:
                System.out.println("Один - это понедельник");
                break;
            case 2:
                System.out.println("Два - это вторник");
                break;
            case 3:
                System.out.println("Три - это среда");
                break;
            case 4:
                System.out.println("Четыре - это четверг");
                break;
            case 5:
                System.out.println("Пятница))");
                break;
            case 6:
                System.out.println("Шесть - это суббота");
                break;
            case 7:
                System.out.println("Семь-это восресенье");
                break;
            default:
                System.out.println("Давай-ка еще разок");
        }
        System.out.println("Хочешь попробовать еще? да/нет?");
        String resp = sc.next();
        if (resp.equalsIgnoreCase("да")) {
            metod(sc);
        } else if (resp.equalsIgnoreCase("нет")) {
            System.out.println("Оки доки");
        } else {
            try {
                System.out.println("________________________________________\n" +
                        "______________888888888888____________________\n" +
                        "_____________8888888888888888888__________________\n" +
                        "__________18888888888888888888888888______________\n" +
                        "________88888888888888888888888888888__8__________\n" +
                        "_______888888888888-9999999-888888888888_________\n" +
                        "_______88888888888888888888888888______888________\n" +
                        "______88888888888888888888888888888888___86_______ ");
                Thread.sleep(300);
                System.out.println("888____88888888865888888_8_____ \n" +
                        "_____8_8888888_8888881__88888___________88________\n" +
                        "_____88________8888888888888_____________8________\n" +
                        "______888____8888__888:8886_______________8_______\n" +
                        "________8:_8888__________88_______________88______\n" +
                        "_____8__58_88____________8888____________888888___\n" +
                        "______8__888_____________:8_888_______688888888___");
                Thread.sleep(300);
                System.out.println("8__888_____________:8_888_______6888889999999888___\n" +
                        "__________88____________88____:8888888888888888___\n" +
                        "___________8__________:888______8888888____88_____\n" +
                        "____________8________888888______8888____________\n" +
                        "____________888888888888888___18888888___________");

            } catch (InterruptedException e) {
                // Если поток был прерван, обрабатываем исключение
                System.out.println("Ошибка: поток был прерван.");
            }
        }
    }
}