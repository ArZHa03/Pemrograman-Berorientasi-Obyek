import java.util.*;

class DeretFibonacci {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        Fibonacci fibo = new Fibonacci();
        fibo.setFibo(input.nextInt());

        for(int i = 0; i < fibo.getFibo(); i++)
            System.out.print(fibo.getResultFibo());
    }
}
