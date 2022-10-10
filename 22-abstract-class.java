// 22. WAP for Abstract classes

class AbstractClass {

    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.makeSound();
        cat.sleep();
    }
}

abstract class Animal {

    public abstract void makeSound();

    public void sleep() {
        System.out.println("Zzz");
    }
}

class Cat extends Animal {

    public void makeSound() {
        System.out.println("Meow!");
    }
}

/* OP:
    Meow!
    Zzz
*/