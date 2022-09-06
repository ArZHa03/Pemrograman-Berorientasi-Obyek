import java.util.*;

public class PenghitungVolumeBola {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        Bola bola = new Bola();
        bola.setBola(input.nextInt());

        System.out.println(bola.getResultVolume());
    }
}
