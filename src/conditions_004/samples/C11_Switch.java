package conditions_004.samples;

import java.util.Scanner;

public class C11_Switch {
    // Оператор многозначного выбора - switch-case (переключатель).

    public static void main(String[] args) {
        // Предлагаем пользователю ввести число.
        System.out.println("Введите число 1 или 2: ");

        // Принимаем ввод от пользователя.
        Scanner in = new Scanner(System.in);
        String number = in.next();

        // На 19 строке создаем конструкцию многозначного выбора, переключатель - switch,
        // которому в качестве выражения-селектора, передаем переменную - number.

        switch (number) { // (number) — выражение-селектор.

            // В теле переключателя switch-case, на 27 и 32 строках,
            // создаем два оператора case, c постоянными выражениями равными "1" и "2" соответственно.

            // Если значение выражения-селектора совпадет с одним из значений постоянных выражений,
            // то выполняется тело оператора case, постоянное выражение которого, совпало с выражением-селектора.

            case "1": {   // "1" — постоянное выражение.
                System.out.println("Один");                                       // Ветвь 1
                // Выход из переключателя.
                break;
            }
            case "2": {
                System.out.println("Два");                                        // Ветвь 2
                break;
            }

            // На 40 строке создаем (необязательный) оператор default, тело которого выполняется в случае,
            // если значение выражения-селектора не совпадет ни с одним из значений постоянных выражений.

            default: {
                System.out.println("Вы ввели значение отличное от 1 и 2.");       // Ветвь 3
                break;
            }

            // Если в переключателе отсутствует оператор default, то управление передается за пределы переключателя switch.
        }
    }
}
