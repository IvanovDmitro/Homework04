public class Dog extends Animal {
    private static int dogCount;
    private String name;

    public Dog(String name) {
        this.name = name;
        dogCount++;
    }

    public static int getDogCount() {
        return dogCount;
    }

    @Override
    void run(double meters) {
        if (meters > 0 && meters <= 500) {
            System.out.println(getName() + " run " + meters);
        } else {
            System.out.println(getName() + " can run only 500 meters");
        }
    }

    @Override
    void swim(double meters) {
        if (meters > 0 && meters <= 10) {
            System.out.println(getName() + " swum " + meters);
        } else {
            System.out.println(getName() + " can swim only 10 meters");
        }
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
