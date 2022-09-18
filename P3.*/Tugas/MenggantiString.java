import java.util.*;

class MenggantiString {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        Text text = new Text();

        text.setText(scan.nextLine());
        text.replaceText(scan.nextLine(), scan.nextLine());

        System.out.println(text.getText());
    }
}
