import java.util.*;

class PencarianBilanganTerkecil {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        Number number = new Number();

        for (int i = 1; i <= 3; i++)
            number.setNumberLowest(input.nextInt());

        System.out.println(number.getNumberLowest());
    }
}
