public class Cat extends Animal {
    private static int catCount;

    public Cat(String name) {
        super(name);
        catCount++;
    }

    public static int getCatCount() {
        return catCount;
    }

    @Override
    void run(double meters) {
        if (meters > 0 && meters <= 200) {
            System.out.println(getName() + " run " + meters);
        } else {
            System.out.println(getName() + " can run only 200 meters");
        }
    }

    @Override
    void swim(double meters) {
        System.out.println(getName() + " can't swim");
    }
}

