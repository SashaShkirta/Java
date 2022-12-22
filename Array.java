

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        ////////////////////   TASK 1
        int[] monthDays = {31,28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        System.out.println("Enter the number of month (1 to 12)");
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        System.out.println(monthDays[month - 1]);

        ///////////////////    TASK  2
        System.out.println("Enter 10 integer numbers");
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0, product = 1;
        boolean posFirst = false;
        for (int i = 0; i < (arr.length / 2); i++) {
            if (arr[i] > 0) {
                sum += arr[i];
                posFirst = true;
            } else {
                posFirst = false;
                break;
            }
        }
        if (posFirst) {
            System.out.println("sum of first 5 elements = " + sum);
        }
        for (int i = (arr.length / 2); i < arr.length; i++) {
            product *= arr[i];
        }
        if (!posFirst) {
            System.out.println("product of last 5 element  = " + product);
        }
        ////////////////////     TASK  3
        System.out.println("Enter 5 integer numbers");
        int[] arr2 = new int[5];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }
        int posPositive = 0, posMin = 0, productEven = 1;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] > 0) {
                posPositive++;
                if (posPositive == 2){
                    System.out.println("position of second positive number - " + i);
                }
            }
            if (arr2[i] < min){
            min = arr2[i];
            posMin = i;
            }
            if (arr2[i] % 2 == 0){
                productEven *= arr2[i];
            }
        }
        System.out.println("minimum = " + min + ", its position in the array: " + posMin);
        System.out.println("the product of all entered even numbers = " + productEven);

    }
}
