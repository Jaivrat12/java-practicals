import java.util.Scanner;

// 9. WAP to show use of ternary operator.

class TernaryOperator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        String output = n % 2 == 0 ? "Even" : "Odd";
        System.out.printf("%d is %s", n, output);
    }
}

/* OP:
    Enter a number: 12
    12 is Even
*/