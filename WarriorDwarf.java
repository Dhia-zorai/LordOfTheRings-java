public class WarriorDwarf extends Dwarf implements Warrior {

    private int force;

    WarriorDwarf(String nom, double x, double y, int force) {
        super(nom, x, y);
        this.force = force;
    }

    public void attacks(Character p) {
        p.setHealth(p.getHealth() * (100 - this.force) / 100);

    }

    ;

    public int getForce() {
        return force;
    }
}
