import java.util.Scanner;

// 7. WAP to calculate factorial of given number.

class Factorial {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int fact = 1;
        for (int i = n; i >= 2; i--) {
            fact *= i;
        }
        System.out.printf("Factorial of %d is: %d", n, fact);
    }
}

/* OP:
    Enter a number: 6
    Factorial of 6 is: 720
*/