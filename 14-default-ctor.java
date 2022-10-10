// 14. WAP for Default Constructor

class DefaultCtor {

    public static void main(String[] args) {

        Shape shape = new Shape();
        System.out.printf("By default the shape has %d sides", shape.sides);
    }
}

class Shape {

    int sides;
    Shape() {
        this.sides = 3;
    }
}

/* OP:
    By default the shape has 3 sides
*/