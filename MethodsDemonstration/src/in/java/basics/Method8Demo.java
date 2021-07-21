// Addition of 2 numbers, with arguments and with return value, method type

package in.java.basics;

import java.util.Scanner;

public class Method8Demo {

	public static void main(String[] args) {

		Method8Demo md = new Method8Demo();
		Scanner x = new Scanner(System.in);
		
		System.out.println("Enter 2 integers");
		int m = x.nextInt();
		int n = x.nextInt();
		
		int sum= md.addition(m, n); //Calling Parameters
		System.out.println("Sum= "+sum);
	}
	
	public int addition(int x, int y) {//Called Parameters
				
		return (x+y);
	}
}
