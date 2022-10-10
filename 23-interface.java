// 23. WAP for interface

class Interface {

    public static void main(String[] args) {

        Cube cube = new Cube(4);
        System.out.printf("Area of the cube: %.1f\n", cube.area());
        System.out.printf("Volume of the cube: %.1f\n", cube.volume());
    }
}

interface Shape {

    public float area();
    public float volume();
}

class Cube implements Shape {

    float side;

    Cube(float side) {
        this.side = side;
    }

    public float area() {
        return 6 * side * side;
    }

    public float volume() {
        return side * side * side;
    }
}

/* OP:
    Area of the cube: 96.0
    Volume of the cube: 64.0
*/