public class Gun extends Weapon {
    public int bullets;

    public Gun(int bullets) {
        this.bullets = bullets;
    }

    public void attack() {
        info();
        System.out.println("Menambakan Peluru\nSisa peluru:" + --bullets);
    }
}
