// 12. Explain following unary operators with suitable program: ++, --, !

class UnaryOperators {

    public static void main(String[] args) {

        int i = 10;
        boolean b = true;

        System.out.printf("i = %d\n", i);
        System.out.printf("Incrementing i (i++)\n");
        i++;
        System.out.printf("Now, i = %d\n\n", i);

        System.out.printf("Decrementing i (i--)\n");
        i--;
        System.out.printf("Now, i = %d\n\n", i);

        System.out.printf("b = %b\n", b);
        System.out.printf("!b = %b (negating b)\n", !b);
    }
}

/* OP:
    i = 10
    Incrementing i (i++)
    Now, i = 11

    Decrementing i (i--)
    Now, i = 10

    b = true
    !b = false (negating b)
*/