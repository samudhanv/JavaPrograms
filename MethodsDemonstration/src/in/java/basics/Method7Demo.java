// Addition of 2 numbers, with arguments and no return value, method type

package in.java.basics;

import java.util.Scanner;

public class Method7Demo {

	public static void main(String[] args) {

		Method7Demo md = new Method7Demo();
		Scanner x = new Scanner(System.in);
		
		System.out.println("Enter 2 integers");
		int m = x.nextInt();
		int n = x.nextInt();
		
		md.addition(m, n); //Calling Parameters
	}
	
	public void addition(int x, int y) {//Called Parameters
				
		System.out.println("Sum= "+(x+y));
	}
}
