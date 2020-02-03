package Coffemachine;

import javax.naming.Name;

import java.util.Scanner;

import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Включается Кофе-машина");
        System.out.println("Пожалуйста подождите...");
        for (int i = 3; i > 0; i--) {
            System.out.println(i + " секунды до включения");
            sleep(1000);
        }

        System.out.println("Кофе-машина готова к работе!");
        sleep(2000);


        int mymoney = 200;
        int[] Pricemachine = {10, 20, 25, 35, 40, 20, 60, 80};
        String[] Namemachine = {"Вода", "Чай", "Сок", "Кофе", "Капучино", "Американо", "Латте", "Фрэш"};

        for (int i = 0; i < 8; i++) {
            if (Pricemachine[i] <= mymoney) {
                System.out.println("Вы можете купить " + Namemachine[i]);
            }

        }
        System.out.println("Выберите покупку от 1 до 8");
        int x = scanner.nextInt();

//        if (x == 1) {
//            sleep(3000);
//            System.out.println("Вы купили Воду");
//        } else if (x == 2) {
//            sleep(3000);
//            System.out.println("Вы купили Чай");
//        } else if (x == 3) {
//            sleep(3000);
//            System.out.println("Вы купили Сок");
//        } else if (x == 4) {
//            sleep(3000);
//            System.out.println("Вы купили Кофе");
//        } else if (x == 5) {
//            sleep(3000);
//            System.out.println("Вы купили Капучино");
//        } else if (x == 6) {
//            sleep(3000);
//            System.out.println("Вы купили Американо");
//        } else if (x == 7) {
//            sleep(3000);
//            System.out.println("Вы купили Латтэ");
//        } else if (x == 8) {
//            sleep(3000);
//            System.out.println("Вы купили Американо");
//        } else {
//            System.out.println("Вы непонятно что купили =(");
//        }


    }
}
