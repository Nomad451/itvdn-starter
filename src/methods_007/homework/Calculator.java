package methods_007.homework;

public class Calculator {
    public static void main(String[] args) {
        System.out.println(calculate(5, 2, 5));
    }

    // Создаем метод calculate
    public static int calculate(int a, int b, int c) {
        // Считаем среднее арифметическое значение аргументов
        return (a + b + c) / 3;
    }
}
