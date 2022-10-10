// 16. WAP for while loop.

import java.util.Scanner;

class WhileLoop {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = "y";
        System.out.println("Press 'x' to stop");
        while (input != "x") {

            System.out.print("Enter a number: ");
            input = sc.next();
            if (input.charAt(0) == 'x') {
                System.out.println("Terminating...");
                break;
            }
            System.out.println(input);
        }
    }
}

/* OP:
    Press 'x' to stop
    Enter a number: 12
    12
    Enter a number: 42
    42
    Enter a number: x
    Terminating...
*/