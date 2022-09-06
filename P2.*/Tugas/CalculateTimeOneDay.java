import java.util.Scanner;

public class CalculateTimeOneDay {
    public static void main(String args[]) {
			System.out.println("Program Penghitung Lama Waktu/Durasi");
			Scanner input = new Scanner(System.in);

			Times start = new Times();
			System.out.print("Time start:\nhour = ");
			start.setHour(input.nextInt());
			System.out.print("minute = ");
			start.setMinute(input.nextInt());

			Times end = new Times();
			System.out.print("\nTime end:\nhour = ");
			end.setHour(input.nextInt());
			System.out.print("minute = ");
			end.setMinute(input.nextInt());

			if(end.getCalculate() < start.getCalculate()) {
				System.out.println("The Program only calculate time in one day");
			} else {
				System.out.println("\nDuration time: " + (end.getCalculate() - start.getCalculate()));
			}
    }
}
