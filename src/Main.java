public class Main {
    public static void main(String[] args) {

        Plate plate = new Plate(100);
        Cat[] cats = {
                new Cat("Jhon", 15),
                new Cat("Mike", 25),
                new Cat("Garfield", 85),
        };

        feed(cats, plate);
        plate.info();
        plate.increaseFood(100);
        plate.info();

    }
    static void feed(Cat[] cats, Plate plate) {

        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
        }
    }
}