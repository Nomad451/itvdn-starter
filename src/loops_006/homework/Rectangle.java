package loops_006.homework;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        for(int i = 0; i < num1; i ++)
        {
            for(int x = 0; x < num2; x++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
