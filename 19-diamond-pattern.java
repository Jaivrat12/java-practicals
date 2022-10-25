// 19. WAP to print Diamond Pattern

class DiamondPattern {

    static void printTriangle(int row, int n) {

        for (int spaces = n - 1; spaces >= row; spaces--) {
            System.out.print(" ");
        }

        for (int stars = 1; stars <= 2 * row - 1; stars++) {
            System.out.print("*");
        } System.out.println();
    }

    public static void main(String[] args) {

        int n = 3;

        for (int row = 1; row <= n; row++) {
            printTriangle(row, n);
        }

        for (int row = n - 1; row >= 1; row--) {
            printTriangle(row, n);
        }
    }
}

/* OP:
  *
 ***
*****
 ***
  *
*/