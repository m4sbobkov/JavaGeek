public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void decreaseFood(int n){
        if (n < getFood())
            food -= n;
        else System.out.println("Столько еды в миске нет");
    }

    public void increaseFood(int n){
        food += n;
    }

    public void info() {
        System.out.println("plate: " + food);
    }
}
