public abstract class Character {
    private String nom;
    private int health, v, coins;
    private double x, y;
    private static int nbSauron=0;

    public Character(String nom, double x, double y, int v) {
        this.nom = nom;
        this.x = x;
        this.y = y;
        this.health = 100;
        this.v = v;
        this.coins = 1000;
    }

    public int getCoins() {
        return this.coins;
    }

    public void setCoins(int coins) {
        this.coins = coins;
    }

    public int getHealth() {
        return this.health;
    }

    public void setHealth(int points) {
        this.health = points;
    }

    public void seDeplacer(int dx, int dy, int t) {
        this.x = this.x + dx * this.v * t / Math.sqrt(dx * dx + dy * dy);
        this.y = this.y + dy * this.v * t / Math.sqrt(dx * dx + dy * dy);
    }

    public void createSauronsRing(){
    };

    public abstract String speaks();
}
