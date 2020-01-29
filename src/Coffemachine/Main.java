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
        String[] Namemachine = {"Вода", "Чай", "Сок", "Кофе", "Капучино", "Американо", "Латтер", "Фрэш"};

        for(int i = 0; i < 8; i++){
        if(Pricemachine[i] <= mymoney){
            System.out.println("Вы можете купить " + Namemachine[i]);
        }

        }
        String x = scanner.nextLine();



    }
}
