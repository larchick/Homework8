import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] values = new int[3];
        for (int i = 0; i < 3; i++) {
            values[i] = i + 1;
            System.out.println(values[i]);
        }
        System.out.println();
        double[] weight = {1.57, 7.654, 9.986};
        for (int a = 0; a < weight.length; a++) {
            System.out.println(weight[a]);
        }
        System.out.println();

        int [] variable = {3, 4, 6, 7, 8, 100, 1000, 500};
        for (int d = 0; d < variable.length; d++){
            System.out.println(variable[d]);
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] values = new int[3];
        for (int i = 0; i < values.length; i++) {
            values[i] = i + 1;
            System.out.print(values[i]);
            if (i != values.length - 1){
                System.out.print(", ");
            }
        }
        System.out.println();
        double[] weight = {1.57, 7.654, 9.986};
        for (int a = 0; a < weight.length; a++) {
            System.out.print(weight[a]);
            if (a != weight.length - 1){
                System.out.print(", ");
            }
        }
        System.out.println();

        int [] variable = {3, 4, 6, 7, 8, 100, 1000, 500};
        for (int d = 0; d < variable.length; d++) {
            System.out.print(variable[d]);
            if (d != variable.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int [] values = {1, 2, 3};
        for (int i = values.length - 1; i >= 0; i--){
            System.out.print(values[i]);
            if (i != 0){
                System.out.print(", ");
            }
        }
        System.out.println();

        double[] weight = {1.57, 7.654, 9.986};
        for (int a = weight.length - 1; a >= 0; a--){
            System.out.print(weight[a]);
            if (a != 0){
                System.out.print(", ");
            }
        }
        System.out.println();

        int [] variable = {3, 4, 6, 7, 8, 100, 1000, 500};
        for (int d = variable.length - 1; d >= 0; d--){
            System.out.print(variable[d]);
            if (d != 0){
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void task4() {
        System.out.println("Задача 4");
        int [] values = {1, 2, 3};
        for (int i = 0; i < values.length; i++) {
            if (values[i] % 2 != 0){
                values[i] += 1;
            }
        }
        System.out.println(Arrays.toString(values));

    }
}