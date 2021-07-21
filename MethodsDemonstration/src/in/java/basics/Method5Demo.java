// Addition of 2 numbers, no arguments and no return value, method type

package in.java.basics;

import java.util.Scanner;

public class Method5Demo {

	public static void main(String[] args) {
		
		Method5Demo md = new Method5Demo();
		
		md.addition();		
	}
	
	
	public void addition() {
		int a, b;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter 2 integers");
		a = in.nextInt();
		b = in.nextInt();
		
		System.out.println("Sum= "+(a+b));
	}	
}
