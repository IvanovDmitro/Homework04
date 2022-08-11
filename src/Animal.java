public abstract class Animal {
    private String name;
    private static int countAnimals;

    public Animal() {
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
