public class Promotion {
	public static void main (String args[]) {
		byte varByte = 18;

		System.out.println("Widening Casting (automatically) :");

		System.out.println(varByte + " [byte] -> " + (short)varByte + " [short] -> " + (char)varByte + " [char] -> " + (int)varByte + " [int] -> " + (long)varByte + " [long] -> " + (float)varByte + " [flaot] -> " + (double)varByte + " [double].");
	}
}
