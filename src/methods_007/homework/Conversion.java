package methods_007.homework;

import java.util.Scanner;

public class Conversion {

    // Создаем константы и заносим текущий курс валют на 11-16 строки

    public static final double RUB_to_USD = 0.010949;
    public static final double RUB_to_EUR = 0.010129;
    public static final double USD_to_RUB = 91.33;
    public static final double USD_to_EUR = 0.925155;
    public static final double EUR_to_RUB = 98.72;
    public static final double EUR_to_USD = 1.08;

    public static void main(String[] args) {

        // Ввод с клавиатуры

        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите валюту, которую хотите поменять, рубли/ доллары/ евро" + "\n" + "r / d / e");
        String currency = sc.next();
        System.out.println("Во что вы хотите конвертировать? рубли/ доллары/ евро" + "\n" + "r / d / e");
        String convCurrency = sc.next();
        System.out.println("Введите сумму:");
        double money = sc.nextDouble();

        // Проверка на отрицательные числа

        if (money < 0) {
            System.out.println("Отрицательные числа вводить нельзя");
            return;
        }

        // Проверяем, что пользователь хочет обменять и в зависимости от валюты выполняем конвертацию

        if (currency.equals("r") && convCurrency.equals("d")) {
            System.out.println("Конвертация рубли в доллары : " + convRUBToUSD(money) + " $");
        } else if (currency.equals("r") && convCurrency.equals("e")) {
            System.out.println("Конвертация рубли в евро : " + convRUBToEUR(money) + " €");
        } else if (currency.equals("d") && convCurrency.equals("r")) {
            System.out.println("Конвертация доллары в рубли : " + convUSDtoRUB(money) + " RUB");
        } else if (currency.equals("d") && convCurrency.equals("e")) {
            System.out.println("Конвертация доллары в евро : " + convUSDtoEUR(money) + " €");
        } else if (currency.equals("e") && convCurrency.equals("r")) {
            System.out.println("Конвертация евро в рубли : " + convEURtoRUB(money) + " RUB");
        } else if (currency.equals("e") && convCurrency.equals("d")) {
            System.out.println("Конвертация евро в доллары : " + convEURtoUSD(money) + " €");
        } else {
            System.out.println("К сожалению, такой валюты нет.");
        }

    }

    // Создаем методы и в них производим конвертацию валют

    public static double convRUBToUSD(double money) {
        return money * RUB_to_USD;
    }

    public static double convRUBToEUR(double money) {
        return money * RUB_to_EUR;
    }

    public static double convUSDtoRUB(double money) {
        return money * USD_to_RUB;
    }

    public static double convUSDtoEUR(double money) {
        return money * USD_to_EUR;
    }

    public static double convEURtoRUB(double money) {
        return money * EUR_to_RUB;
    }

    public static double convEURtoUSD(double money) {
        return money * EUR_to_USD;
    }
}
