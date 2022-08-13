public class Main {
    public static void main(String[] args) {
        //задание №1
        int[] light = new int[3];
        light[0] = 1;
        light[1] = 2;
        light[2] = 3;
        double[] doub = {1.57, 7.654, 9.986};
        int[] abc = {77, 88, 99};
        //задание №2
        for (int i = 0; i < light.length; i++) {
            if (i == light.length - 1)
                System.out.print(light[i]);
            else System.out.print(light[i] + ",");
        }
        System.out.println();

        for (int q = 0; q < doub.length; q++) {
            if (q == doub.length - 1)
                System.out.print(doub[q]);
            else System.out.print(doub[q] + ",");
        }
        System.out.println();

        for (int p = 0; p < abc.length; p++) {
            if (p == abc.length - 1)
                System.out.print(abc[p]);
            else System.out.print(abc[p] + ",");
        }
        System.out.println();

        //Задача №3
        for (int i = light.length - 1; i >= 0; i--) {
            System.out.print(light[i] + ",");
        }
        System.out.println();
        for (int q = doub.length - 1; q >= 0; q--) {
            System.out.print(doub[q] + ",");
        }
        System.out.println();

        for (int p = abc.length - 1; p >= 0; p--) {
            System.out.print(abc[p] + ",");
        }
        System.out.println();
//Задача №4
        for (int i = 0; i <= 2; i++)
            if (i % 2 != 0) {
                System.out.print(light[i]+ ",");
            } else {
                System.out.print(light[i] + 1 + ",");

            }

    }
}

