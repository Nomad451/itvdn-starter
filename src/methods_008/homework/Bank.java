package methods_008.homework;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        // Вызываем метод с некоторыми значениями
        payment(100);
        payment(2000);
    }

    // Создаем метод payment, который в качестве аргумента принимает сумму платежа money
    public static void payment(double money) {
        double credit = 1000;     // Кредит
        double debts = 0;         // Долг
        double overPayment = 0;   // Переплата

        // Создаем условие, если ваши деньги больше кредита, то выводит сообщение:
        // Переплата составила ... руб
        if (money > credit) {
            overPayment = money - credit;
            System.out.println("Переплата составила " + overPayment + " руб");
            System.out.println("Кредит погашен");
        // Если деньги, которые вы вносите, будут равны кредиту, то выводим сообщение:
        // Кредит погашен
        } else if (money == credit) {
            System.out.println("Кредит погашен");
        } else {
            // Если сумма денег была внесена меньше, чем долг, то выводим сообщение:
            // Задолженность составляет ... руб
            debts = credit - money;
            System.out.println("Задолженность составляет " + debts + " руб");
        }
    }

}
