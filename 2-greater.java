// 2. WAP to find greater among three numbers.

import java.util.Scanner;

// Find greater among 3 nos

class Greater {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 numbers: ");
        int a = sc.nextInt(),
            b = sc.nextInt(),
            c = sc.nextInt();

        int max = c;
        if (a > b && a > c) {
            max = a;
        } else if (b > c) {
            max = b;
        }
        System.out.printf("Greatest is: %d", max);
    }
}

/* OP:
    Enter 3 numbers: 46 92 73
    Greatest is: 92
*/