// 10. WAP to display use of Literals (Numeric, floating point, character, boolean & String.)

class Literals {

    public static void main(String[] args) {

        int i = 2147483647;                 // 2 ^ 31 - 1
        long l = 9223372036854775807L;      // 2 ^ 63 - 1
        float f = 12.345678f;               // 6 digits precision
        double d = 12.123456789012345;      // 15 digits precision
        char c = 'J';
        String s = "hello";
        boolean b = true;

        System.out.printf("""
            int: %d
            long: %d
            float: %f
            double: %.15f
            char: %c
            String: %s
            boolean: %b
        """, i, l, f, d, c, s, b);
    }
}

/* OP:
    int: 2147483647
    long: 9223372036854775807
    float: 12.345678
    double: 12.123456789012344
    char: J
    String: hello
    boolean: true
*/