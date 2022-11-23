public class Player {
    public String id;
    public String name;

    public void attack(Weapon weapon) {
        System.out.println(name + " is attacking with " + weapon.name);
    }
}
