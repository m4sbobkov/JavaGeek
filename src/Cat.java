public class Cat {
    private String name;
    private int appetite;
    private boolean sat;
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        sat = false;
    }

    public String getName() {
        return name;
    }

    public void eat(Plate p) {
        if (p.getFood() < appetite) System.out.println("Для " + getName() + " мало еды");
        else {
            p.decreaseFood(appetite);
            sat = true;
            System.out.println(getName() + " сыт");
        }


    }



}