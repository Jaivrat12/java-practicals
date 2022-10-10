// 17. WAP to convert Decimal To Binary

import java.util.Scanner;

class DecimalToBinary {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // I wish I could use `Integer.toBinaryString(n)` here 😢
        String binaryForm = "";
        do {
            binaryForm = (n % 2) + binaryForm;
            n /= 2;
        } while (n != 0);
        System.out.printf("Binary form: %s", binaryForm);
    }
}

/* OP:
    Enter a number: 42
    Binary form: 101010
*/