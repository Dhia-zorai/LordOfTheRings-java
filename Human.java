public class Human extends Character {

    Human(String name, double x, double y) {
        super(name, x, y, 5);
    }

    public String speaks() {
        return "One does not simply walk into Mordor.";
    }
}
