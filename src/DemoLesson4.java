import java.util.Scanner;

public class DemoLesson4 {
    public static void main(String[] args) {
        float[] arrFl = new float[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 float numbers");
        for (int i = 0; i < arrFl.length; i++) {
            arrFl[i] = sc.nextFloat();
        }
        boolean check = true;
        for (int i = 0; i < arrFl.length; i++) {
            if (arrFl[i] <= 5.0f && arrFl[i] >= -5.0f) {
                check = true;
            } else {
                check = false;
            }
        }
        System.out.println("Is belong to the range [-5, 5] : " + check);

        int[] arrInt = new int[3];
        System.out.println("Enter 3 int numbers");
        // Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arrInt.length; i++) {
            arrInt[i] = sc.nextInt();
        }
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        ;
        for (int i = 0; i < arrInt.length; i++) {
            if (arrInt[i] < min) {
                min = arrInt[i];
            }
            if (arrInt[i] > max) {
                max = arrInt[i];
            }
        }
        System.out.println("Minimum int = " + min);
        System.out.println("Maximum int = " + max);


    }
}
