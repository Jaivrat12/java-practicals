// 24. WAP for method overloading

class Overloading {

    static int add(int a, int b) {
        return a + b;
    }

    static double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {

        int a = 10, b = 20;
        double x = 12.34, y = 56.78;
        System.out.printf("%d + %d = %d\n", a, b, add(a, b));
        System.out.printf("%.2f + %.2f = %.2f\n", x, y, add(x, y));
    }
}

/* OP:
    10 + 20 = 30
    12.34 + 56.78 = 69.12
*/