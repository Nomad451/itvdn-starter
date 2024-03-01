package loops_006.homework;

import java.util.Scanner;

public class Delivery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = 1;

        do {
            temp *= num--;
        } while (num > 0);

        System.out.println("Количество возможных вариантов доставки товара - " + temp);
    }
}
