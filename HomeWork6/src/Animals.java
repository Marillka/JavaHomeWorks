public class Animals {
    protected String name;
    protected String color;
    protected int age;

    public void run(int distance) {
        System.out.printf("%s пробежал %d метров", name, distance);
        System.out.println();
    }

    public void swim(int distance) {
        System.out.printf("%s проплыл %d метров", name, distance);
        System.out.println();
    }

}

