import java.util.*;

class PenghitungVolumeBalok {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        Balok benda = new Balok();
        benda.setBalok(input.nextInt());

        System.out.println(benda.getResult());
    }
}
