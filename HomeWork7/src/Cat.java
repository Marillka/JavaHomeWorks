public class Cat {
    private String name;
    protected int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
        System.out.printf("Кот %s голодный\n", name);
    }

    public void eat(Bowl bowl) {
        if (appetite > bowl.amountOfFood) {
            System.out.printf("В миске недостаточно еды, должно быть минимум %d еды, сейчас в миске %d еды\n", appetite, bowl.amountOfFood);
        } else {
            bowl.decreaseFood(appetite);
            System.out.printf("Кот %s скушал из миски %d еды и наелся\n", name, appetite);
            satiety = true;
        }
    }

    public void isSatiety() {
        if (satiety) {
            System.out.printf("Кот %s - сытый\n", name);
        } else {
            System.out.printf("Кот %s - голодный\n", name);
        }
    }
}
