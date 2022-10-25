// 13. WAP to show implicit type casting.

class ImplicitTypeCasting {

    public static void main(String[] args) {

        int i = 10;
        double d = i;       // auto type-cast (Widening)

        System.out.printf("i = %d, d = %.2f", i, d);
    }
}

/* OP:
    i = 10, d = 10.00
*/