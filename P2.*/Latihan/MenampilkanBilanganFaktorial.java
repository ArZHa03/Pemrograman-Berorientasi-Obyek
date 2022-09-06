import java.util.*;

class MenampilkanBilanganFaktorial {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        Bilangan bilangan = new Bilangan();

        System.out.print("Masukkan bilangan faktorial: ");
        bilangan.setBilangan(input.nextInt());

        for(int i = 1; i < bilangan.getBilangan() + 1; i++)
            System.out.println(bilangan.getFaktorial(i));
    }
}
