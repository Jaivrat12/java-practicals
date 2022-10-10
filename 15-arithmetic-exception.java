// 15. WAP to handle Arithmetic Exception.

class ArithmeticExceptionTest {

    static void printDivision(int a, int b) {

        try {
            int c = a / b;
            System.out.printf("%d / %d = %d\n", a, b, c);
        } catch (ArithmeticException e) {
            System.out.printf("%d / %d = undefined\nError, can't divide by zero!\n", a, b);
        }
    }

    public static void main(String[] args) {

        printDivision(15, 3);
        System.out.println();
        printDivision(8, 0);
    }
}

/* OP:
    15 / 3 = 5

    8 / 0 = undefined
    Error, can't divide by zero!
*/