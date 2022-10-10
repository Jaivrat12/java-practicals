// 11. WAP that takes vars (width, height, depth) from class 'Box' & calcs volume in a method.
// Display result in main method in Class 'BoxDemo'.

class BoxDemo {

    public static void main(String[] args) {

        float w = 7, h = 5, d = 10;
        Box box = new Box(w, h, d);
        System.out.printf(
            "Volume of the box(w: %.1f, h: %.1f, d: %.1f) is: %.1f",
            w, h, d, box.volume()
        );
    }
}

class Box {

    private float width, height, depth;
    Box(float width, float height, float depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    float volume() {
        return this.width * this.height * this.depth;
    }
}


/* OP:
    Volume of the box(w: 7.0, h: 5.0, d: 10.0) is: 350.0
*/