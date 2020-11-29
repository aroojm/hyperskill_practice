class BoxInside {
    public static void showAnimal(Box<? extends Animal> b) {
        System.out.println(b.getAnimal().toString());
    }
}

class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}

class Box<T> {

    private T animal;

    void setAnimal(T animal) {
        this.animal = animal;
    }

    T getAnimal() {
        return animal;
    }
}