// 8. WAP to show diff betn bitwise op (&) and short-circuit operator (&&).

class AndVsBitwiseAnd {

    static String getBitRepr(int i) {

        return String.format("%" + 4 + "s", Integer.toBinaryString(i))
            .replace(' ', '0');
    }

    public static void main(String[] args) {

        int a = 11, b = 13;
        System.out.printf("""
        Bitwise &:
            a = %d (%s), b = %d (%s)
            a & b = %d (%s)\n
        """, a, getBitRepr(a), b, getBitRepr(b),
        a & b, getBitRepr(a & b));

        boolean x = true, y = false;
        System.out.printf("""
        Logical &&:
            x = %b, y = %b
            x && y = %b
        """, x, y, x && y);
    }
}

/* OP:
Bitwise &:
    a = 11 (1011), b = 13 (1101)
    a & b = 9 (1001)

Logical &&:
    x = true, y = false
    x && y = false
*/