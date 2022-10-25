// 20. WAP to show explicit type casting.

class ExplicitTypeCast {

    public static void main(String[] args) {

        double d = 12.34;
        int i = (int)d;     // manual type-cast (Narrowing)

        System.out.printf("d = %.2f, i = %d", d, i);
    }
}

/* OP:
    d = 12.34, i = 12
*/