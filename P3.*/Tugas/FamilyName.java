import java.util.*;

class FamilyName {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        Name name1 = new Name();
        name1.setName(scan.nextLine());

        Name name2 = new Name();
        name2.setName(scan.nextLine());

        System.out.println(name1.getFrontName() + name2.getBackName());
        System.out.println(name2.getFrontName() + name1.getBackName());
    }
}
