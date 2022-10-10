// 20. WAP to show implicit type casting.

class ImplicitTypeCast {

    public static void main(String[] args) {

        double d = 12.34;
        int i = (int)d;     // manual type-cast (Narrowing)

        System.out.printf("d = %.2f, i = %d", d, i);
    }
}

/* OP:
    d = 12.34, i = 12
*/