package com;

import java.util.Stack;

class Parent{
	public String v = "p";
	public String getValue() {
		return v;
	}
}
public class Test extends Parent{
	
	
	public static void main(String[] args) {
		Stack<String> s = new Stack<String>();
		s.push("App");
		s.push("ban");
		s.push("che");
		//System.out.println(s.pop())
		 //fig egg di ;
		s.pop();
		
	}
	
	/*
	 * public String v = "c"; public String getValue() { return v; } public static
	 * void main(String[] args) { Parent chi = new Test();
	 * System.out.println(chi.getValue()); System.out.println(chi.v); }
	 */
	/*
	 * public static void str(String st) { st = "sathya"; } public static void
	 * main(String[] args) { String st = "kumar"; str(st); System.out.println(st);
	 * 
	 * }
	 */

}
