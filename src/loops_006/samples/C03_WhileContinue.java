package loops_006.samples;

public class C03_WhileContinue {
    // Циклическая конструкция - while. (с пропуском итерации - continue)

    public static void main(String[] args) {
        int counter = 0;

        while (counter < 3) {
            counter++;
            System.out.println("Counter " + counter);

            if (true) continue;

            System.out.println("Эта строка не выполнится.");
        }

        System.out.println("Произведено " + counter + " итераций.");
    }
}
