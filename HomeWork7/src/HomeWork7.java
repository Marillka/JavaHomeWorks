public class HomeWork7 {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Барсик", 10000),
                new Cat("Васька", 75),
                new Cat("Рыжик", 100)
        };
        System.out.println(); // для удобства

        Bowl bowl = new Bowl();
        bowl.putFood(1000);
        System.out.println();// для удобства

        cats[0].eat(bowl);
        cats[0].isSatiety();
        System.out.println();// для удобства

        cats[1].eat(bowl);
        cats[1].isSatiety();
        System.out.println();// для удобства

        cats[2].eat(bowl);
        cats[2].isSatiety();


    }
}
