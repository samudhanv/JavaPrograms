// Addition of 2 numbers, no arguments and with return value, method type

package in.java.basics;

import java.util.Scanner;

public class Method6Demo {

	public static void main(String[] args) {
		
		Method6Demo method6Demo = new Method6Demo();	
		System.out.println("Sum= "+method6Demo.addition());

	}
	
	
	public int addition() {
		int a, b;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter 2 integers");
		a = in.nextInt();
		b = in.nextInt();
		
		return (a+b);
	}	
}
