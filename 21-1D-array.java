// 21. WAP for 1D Array.

import java.util.Scanner;

class Array1D {

    public static void main(String[] args) {

        final int SIZE = 5;
        int[] arr = new int[SIZE];
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter %d numbers:\n", arr.length);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.printf("Sum is: %d", sum);
    }
}

/* OP:
    Enter 5 numbers:
    5 3 6 9 2
    Sum is: 25
*/