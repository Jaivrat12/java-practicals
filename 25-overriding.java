// 25. WAP for Overriding

class Overriding {

    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.displayInfo();

        Dog dog = new Dog();
        dog.displayInfo();
    }
}

class Animal {

    public void displayInfo() {
        System.out.println("I am an animal.");
    }
}

class Dog extends Animal {

    public void displayInfo() {
        System.out.println("I am a dog.");
    }
}

/* OP:
    I am an animal.
    I am a dog.
*/