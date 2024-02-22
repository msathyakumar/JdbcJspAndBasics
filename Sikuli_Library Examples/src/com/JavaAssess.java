package com;
import java.util.*;
class par{
	{
		System.out.println("A");
	}
	static {
		System.out.println("B");
	}
}
public class JavaAssess extends par{
	{
		System.out.println("C");
	}
	static {
		System.out.println("D");
	}
	public static void main(String[] args) {
		JavaAssess ja = new JavaAssess();
		List<Integer> list1 = new ArrayList<Integer>();
		for(int i =0;i<5;i++) {
			list1.add(i/2);
			
		}
		System.out.println(list1);
		Set<Integer> s = new TreeSet<Integer>();
		s.add(3);
		s.add((int)3.0);
		s.add(2);
		s.add(2);
		s.add(new Integer(2));
		s.add(Integer.parseInt("2"));
		
		System.out.println(s);
	}

}
