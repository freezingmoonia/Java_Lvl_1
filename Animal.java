public class Animal {
    String name;
    String color;
    int age;
    static int count = 0;

    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
        Animal.count = count + 1;
    }

    public void run(int distance, int max_dist) {
        if (max_dist <= 0)
            System.out.println("Животное не умеет бегать");
        else
            System.out.println("Животное пробежало " + distance + "м");
    }

    public void swim(int distance, int max_dist) {
        if (max_dist <= 0)
            System.out.println("Животное не умеет плавать");
        else
            System.out.println("Животное проплыло " + distance  + "м");
    }

    public static void main(String[] args) {
        Animal animal = new Animal("Животинка", "Трёхцветное", 7);
        Cat cat = new Cat("Барсик", "Серый", 7);
        Dog dog = new Dog("Джерик", "Белый", 5);
        dog.run(200, dog.max_run);
        cat.swim(150, cat.max_swim);
        System.out.println(count);
    }
}

class Cat extends Animal {
    public int max_run = 200;
    public int max_swim = 0;

    public Cat(String name, String color, int age) {
        super(name, color, age);
    }
}

class Dog extends Animal {
    public int max_run = 500;
    public int max_swim = 10;

    public Dog(String name, String color, int age) {
        super(name, color, age);
    }
}