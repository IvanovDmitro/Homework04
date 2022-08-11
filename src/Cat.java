public class Cat extends Animal {
    private static int catCount;
    private String name;

    public Cat(String name) {
        this.name = name;
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

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}

