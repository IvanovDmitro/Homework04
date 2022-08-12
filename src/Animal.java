public abstract class Animal {
    private static int countAnimals;
    private String name;

    public Animal(String name) {
        this.name = name;
        countAnimals++;
    }

    public static int getCountAnimals() {
        return countAnimals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract void run(double meters);

    abstract void swim(double meters);
}
