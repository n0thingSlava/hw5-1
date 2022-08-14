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

        for (int i = 0; i < doub.length; i++) {
            if (i == doub.length - 1)
                System.out.print(doub[i]);
            else System.out.print(doub[i] + ",");
        }
        System.out.println();

        for (int i = 0; i < abc.length; i++) {
            if (i == abc.length - 1)
                System.out.print(abc[i]);
            else System.out.print(abc[i] + ",");
        }
        System.out.println();

        //Задача №3
        for (int i = light.length - 1; i >= 0; i--) {
            System.out.print(light[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = doub.length - 1; i >= 0; i--) {
            System.out.print(doub[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = abc.length - 1; i >= 0; i--) {
            System.out.print(abc[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println();
//Задача №4
        for (int i = 0; i <= 2; i++){
            if (light[i] % 2 ==1 ) {
                light[i]++;
            }
                System.out.print(light[i]);
                if (i!= light.length-1){
                    System.out.print(", ");
                }

            }

    }
}

