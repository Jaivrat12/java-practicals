// 5. WAP to print first 20 fibonacci series.

class Fib {

    public static void main(String[] args) {

        int[] fib = new int[20];

        fib[0] = 0; fib[1] = 1;
        for (int i = 2; i < fib.length; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        for (int i = 0; i < fib.length; i++) {
            System.out.printf("%d, ", fib[i]);
        }
    }
}

/* OP:
    0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181,
*/