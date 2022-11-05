import java.util.*;

public class Latihan1 {
	public static void main(String args[]) {
		Set<Integer> setA = new HashSet<Integer>();
		Set<Integer> setB = new HashSet<Integer>();
		setA.add(1);
		setA.add(2);
		setA.add(3);
		setA.add(4);
		setA.add(5);
		setB.add(5);
		setB.add(6);
		setB.add(7);
		setB.add(8);
		setB.add(9);
		setB.add(10);
		
		// A - B
		Set<Integer> setAminusB = new HashSet<Integer>(setA);
		setAminusB.removeAll(setB);
		System.out.println("A - B = " + setAminusB);

		// A ∩ B
		Set<Integer> setAintersectB = new HashSet<Integer>(setA);
		setAintersectB.retainAll(setB);
		System.out.println("A ∩ B = " + setAintersectB);

		// A U B
		Set<Integer> setAunionB = new HashSet<Integer>(setA);
		setAunionB.addAll(setB);
		System.out.println("A U B = " + setAunionB);

		// A C B
		Set<Integer> setAcomplementB = new HashSet<Integer>(setA);
		setAcomplementB.removeAll(setAintersectB);
		System.out.println("A C B = " + setAcomplementB);
	}
}
