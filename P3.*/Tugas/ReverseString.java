import java.util.Scanner;

class ReverseString {
    public static void main (String[] args) {
        Scanner scan = new Scanner (System.in);

        String random = scan.nextLine(), hurufDepan = random.substring(0, 1);

        random = random.replaceAll(Character.toString(random.charAt(0)), Character.toString(random.charAt(random.length()-1)));

        random = random.substring(0, random.length()-1)+hurufDepan;

        System.out.println(random);
    }
}
