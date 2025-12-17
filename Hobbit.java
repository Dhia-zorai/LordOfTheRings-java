public class Hobbit extends Character {

    Hobbit(String name, double x, double y) {
        super(name, x, y, 5);
    }

    public String speaks() {
        return "All’s well that ends better.";
    }
}
