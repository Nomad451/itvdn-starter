package variables_003.homework;

public class Volume {
    public static void main(String[] args) {
        double R = 10;
        double h = 4;

        // double S = 2 * Math.PI * Math.pow(R, 2) + 2 * Math.PI * Math.pow(R, 2);

        double V = Math.PI * Math.pow(R, 2) * h;    // Объем цилиндра
        double S = 2 * Math.PI * R * (R + h);       // Площадь

        System.out.println("Объем цилиндра V: " + V);
        System.out.println("Площадь S: " + S);
    }
}
