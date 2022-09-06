import java.util.*;

class MenampilkanDeretBilanganGenap {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        BilanganGenap bilangan = new BilanganGenap();

        for(int i = 0; i < 10; i++)
            System.out.print(bilangan.getResultExcept(6));
    }
}
