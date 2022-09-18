import java.util.*;

class MendeteksiBilanganPrima {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int bilangan = scan.nextInt(), faktor = 0;

        for(int i = 1; i <= bilangan; i++)
            if(bilangan % i == 0)
                faktor++;

        if(faktor == 2)
            System.out.println(bilangan + " adalah bilangan prima");
        else
            System.out.println(bilangan + " bukan termasuk bilangan prima");
    }
}
