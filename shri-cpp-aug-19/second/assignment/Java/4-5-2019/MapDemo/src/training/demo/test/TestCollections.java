package training.demo.test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class TestCollections {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(20);
		al.add(5);
		al.add(10);
		al.add(15);
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		Collections.reverse(al);
		System.out.println(al);
		System.out.println("Minimum : "+Collections.min(al));
		Collections.shuffle(al);
		System.out.println("Shuffle : "+al);
		al.forEach((s)->{System.out.println(s);});
		LocalDate ld =LocalDate.now();
		System.out.println(ld);
		System.out.println(ld.getYear());
		
	}

}
