// 6. WAP to print max from given 10 numbers.

import java.util.Scanner;

class MaxNum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 10 numbers:");
        int max = sc.nextInt();
        for (int i = 1; i < 10; i++) {

            int n = sc.nextInt();
            if (n > max) {
                max = n;
            }
        }
        System.out.printf("Maximum of given numbers is: %d", max);
    }
}

/* OP:
    Enter 10 numbers:
    23 43 65 -12 42 -66 19 0 55 8
    Maximum of given numbers is: 65
*/