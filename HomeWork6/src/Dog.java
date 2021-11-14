public class Dog extends Animals {

    public Dog(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public void run(int distance) {
        if (distance <= 500 && distance > 0) {
            System.out.printf("%s пробежал %d метров", name, distance);
            System.out.println();
        } else if (distance > 500) {
            System.out.printf("%s пробежал 500 метров и устал", name);
            System.out.println();
        }
    }

    public void swim(int distance) {
        if (distance <= 200) {
        System.out.printf("%s не собака, а морской волк, проплыл аж %d метров",name,distance);
        System.out.println();
        } else if (distance > 200) {
            System.out.printf("%s проплыл %d метров и больше не может, устал", name, distance);
        }
    }


}
