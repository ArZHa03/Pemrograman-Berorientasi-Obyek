public class Casting {
	public static void main (String args[]) {
		double varDouble = -1234567890.0987654321;

        System.out.println("Naarowing Casting (manually) :");
		System.out.println(varDouble + " [double] -> " + (float)varDouble + " [float] -> " + (long)varDouble + " [long] -> " + (int)varDouble + " [int] -> " + (char)varDouble + " [char] -> " + (short)varDouble + " [short] -> " + (byte)varDouble + " [byte].");
	}
}
