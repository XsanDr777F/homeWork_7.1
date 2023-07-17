import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task_1();

    }

    public static void task_1() {
        System.out.println("Задача 1");
        int[] mass = new int[]{1, 2, 3};
        double[] mass_2 = {1.57, 7.654, 9.986};
        int[] year = {10, 20, 30};

        System.out.println("Задача 2");

        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i]);

            if (i != mass.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < mass_2.length; i++) {
            System.out.print(mass_2[i]);

            if (i != mass_2.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();

        for (int i = 0; i < year.length; i++) {
            System.out.print(year[i]);
            if (i != mass.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("Задача 3");
        for (int i = mass.length - 1; i >= 0; i--) {
            System.out.print(mass[i]);

            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = mass_2.length - 1; i >= 0; i--) {
            System.out.print(mass_2[i]);

            if (i != 0) {
                System.out.print(", ");
            }
        }

        System.out.println();

        for (int i = year.length - 1; i >= 0; i--) {
            System.out.print(year[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("Задача 4");

        for (int i = 0; i < mass.length; i++) {
            if (mass[i] % 2 != 0) {
                mass[i]++;
            }
        }
            System.out.println(Arrays.toString(mass));

        }

}