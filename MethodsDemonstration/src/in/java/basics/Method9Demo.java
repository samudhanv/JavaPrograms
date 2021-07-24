package in.java.basics;

import java.util.Scanner;

// Finding biggest element in the array.
// Sorting names in ascending order.
// No args No return value method type

public class Method9Demo {
	
	private Scanner sc = new Scanner(System.in);
	private int i, j, size;

	public static void main(String[] args) {
		
		Method9Demo md = new Method9Demo();
		md.findMax();
		md.sortNames();	

	}
	
	
	public void findMax() {
		int a[];
		int big;
		
		System.out.println("Enter array size");
		size = sc.nextInt();
		a = new int[size];
		
		System.out.println("Enter array elements");
		for(i=0; i<size; i++)
			a[i] = sc.nextInt();
		
		big = a[0];
		
		for(i=0; i<size; i++)
			if(a[i] > big)
				big = a[i];
		
		System.out.println("Biggest Value= "+big);
		
	}
	
	
	public void sortNames() {
		
		String names[], temp;
		
		System.out.println("How many names you want");
		size = sc.nextInt();
		
		names = new String[size];
		
		System.out.println("Enter names");
		for(i=0; i<size; i++)
			names[i] = sc.next();
		
		for(i=0; i<size-1; i++) {
			for(j=0; j<size-i-1; j++)
				if(names[j].compareTo(names[j+1]) > 0) {
					temp = names[j];
					names[j] = names[j+1];
					names[j+1] = temp;
				}
		}
		
		System.out.println("Sorted Names\n");
		for(i=0; i<size; i++)
			System.out.println(names[i]);
	}
	
	

}
