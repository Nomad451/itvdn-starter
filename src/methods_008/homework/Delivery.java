package methods_008.homework;

public class Delivery {
    public static void main(String[] args) {
        System.out.println("Способов доставки - " + process(5));
    }

    // Проблема факториала в том, что у нас не получится точно уследить за размером переменной
    // Число может не поместиться в тип int. Нужно использовать больше.
    public static int process(int num) {
        if (num == 1 || num == 0) {
            return 1;
        } else if (num < 0) {
            return 0;
        } else {
            // Рекурсия
            return num * process(num - 1);
        }
    }
}
