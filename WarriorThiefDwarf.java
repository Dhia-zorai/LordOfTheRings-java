public class WarriorThiefDwarf extends WarriorDwarf implements Thief {
    private int dexterity;

    WarriorThiefDwarf(String nom, double x, double y, int force, int dex) {
        super(nom, x, y, force);
        this.dexterity = dex;
    }

    public void steals(Character p) {
        if (p.getCoins() >= this.dexterity) {
            p.setCoins(p.getCoins() - this.dexterity);
            this.setCoins(this.getCoins() + this.dexterity);

        } else {
            this.setCoins(this.getCoins() + p.getCoins());
            p.setCoins(0);
        }

    }

    public void attacks(Character p) {
        p.setHealth(p.getHealth() * (100 - this.getForce()) / 100);

    }
    ;

}
