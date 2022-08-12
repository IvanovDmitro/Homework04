public class App {
    static int howManyCats;
    static int howManyDogs;
    static int howManyAnimals;
    static String name;

    public static void main(String[] args) {
        Animal cat = new Cat("Barsik");
        Animal dog = new Dog("Bobik");
        Animal cat1 = new Cat("Lelik");
        Animal dog1 = new Dog("Bolik");
        Animal cat2 = new Cat(name);
        cat2.setName("Flusha");

        cat.run(150);
        cat.swim(250);
        cat1.run(78);
        cat1.swim(0);
        cat2.run(44);
        cat2.swim(45);
        dog.run(410);
        dog.swim(8);
        dog1.run(340);
        dog1.swim(90);


        howManyCats = Cat.getCatCount();
        System.out.println("\nCats added " + howManyCats);
        howManyDogs = Dog.getDogCount();
        System.out.println("Dogs added " + howManyDogs);
        howManyAnimals = Animal.getCountAnimals();
        System.out.println("Animals total " + howManyAnimals);
    }
}


