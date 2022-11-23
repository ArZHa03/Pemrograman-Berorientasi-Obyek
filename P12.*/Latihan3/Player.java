public class Player {
    public Avatar avatar = new Avatar();
    public Pet pet;
    public VirtualHouse virtualHouse;

    public Player() {
        pet = new Pet();
        virtualHouse = new VirtualHouse();
    }

    public void createHouse() {
        virtualHouse = new VirtualHouse();
    }

    public void buyPet(Pet pet) {
        this.pet = pet;
    }

    public void attack(Weapon weapon) {
        System.out.println("Player attack with " + weapon.nama);
    }
}
