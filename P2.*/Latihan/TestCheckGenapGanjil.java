import java.util.*;

class TestCheckGenapGanjil {
    public static void main (String args[]) {
        Scanner input = new Scanner(System.in);

        Number number = new Number();
        number.setNumber(input.nextInt());

        System.out.println(number.getResult());
    }
}
