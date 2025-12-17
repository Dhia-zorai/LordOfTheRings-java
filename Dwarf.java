public class Dwarf extends Character {
    Dwarf(String name, double x, double y) {
        super(name, x, y, 2);
    }

    public String speaks() {
        return "May your beard grow ever longer.";
    }
}
