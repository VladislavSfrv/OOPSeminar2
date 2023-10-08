package sample1;

public class MainClass {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", 5);
        Plate plate = new Plate(100, 5);
        plate.info();
        cat.eat();
        plate.setFood(plate.getFood() - plate.getAppetite());
    }
}