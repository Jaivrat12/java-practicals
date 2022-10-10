// 1. WAP to calculate area of rectangle.

import java.util.Scanner;

class RectArea {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        float l = sc.nextFloat();

        System.out.print("Enter breadth: ");
        float b = sc.nextFloat();

        float area = l * b;
        System.out.printf("Area of rectangle: %.2f", area);
    }
}

/* OP:
    Enter length: 12
    Enter breadth: 5
    Area of rectangle: 60.00
*/