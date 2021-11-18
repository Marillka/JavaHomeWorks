public class Bowl {
    protected int amountOfFood;

    public void putFood(int amount) {
        this.amountOfFood += amount;
        System.out.printf("Положили в тарелку %d еды, сейчас в тарелке %d еды\n", amount, amountOfFood);
    }

    public void decreaseFood(int amount) {
        this.amountOfFood -= amount;
        System.out.printf("Из тарелки пропало %d еды, сейчас в тарелке %d еды\n", amount, amountOfFood);
    }

    public int getAmountOfFood() {
        return amountOfFood;
    }
}
