public class Cat extends Animals{

    public Cat(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public void run(int distance) {
        if (distance <= 200 && distance > 0) {
            System.out.printf("%s пробежал %d метров", name, distance);
            System.out.println();
        } else if (distance > 200) {
            System.out.printf("%s пробежал 200 метров и устал", name);
            System.out.println();
        }
    }

    public void swim(int distance) {
        System.out.printf("Коты не умеют плавать, %s чуть не утонул!!!", name);
        System.out.println();
    }

}
