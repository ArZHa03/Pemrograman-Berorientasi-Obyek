import java.util.*;

class MenampilkanDeretFibonacci {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int deret = scan.nextInt();
        int fibo[] = new int[255];

        fibo[0] = 0;
        fibo[1] = 1;

        System.out.print(fibo[0] + " ");
        for(int i = 1; i < deret; i++) {
            fibo[i+1] = fibo[i-1] + fibo[i];
            System.out.print(fibo[i] + " ");
        }
    }
}
