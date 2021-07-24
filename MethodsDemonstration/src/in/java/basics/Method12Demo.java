package in.java.basics;

import java.util.Scanner;

// Finding biggest element in the array.
// Sorting names in ascending order.
// With args with return value method type

public class Method12Demo {
	
	private static Scanner sc = new Scanner(System.in);
	private static int i, size;

	public static void main(String[] args) {
		
		Method12Demo md = new Method12Demo();
		
		System.out.println("How many values you want");
		size = sc.nextInt();
		int x[] = new int[size];
		
		System.out.println("Enter values");
		for(i=0; i<size; i++)
			x[i] = sc.nextInt();
		
		System.out.println("How many names you need");
		size = sc.nextInt();
		String names[] = new String[size];
		
		System.out.println("Enter names");
		for(i=0; i<size; i++)
			names[i] = sc.next();
	
		md.sortNames(names);
		System.out.println("Names after sorting");
		for(i=0; i<names.length; i++)
			System.out.println(names[i]);
		
		System.out.println("Biggest Number= "+md.findMax(x));
		
	}
	
	
	public int findMax(int a[]) {
		
		int big;
					
		big = a[0];
		
		for(i=0; i<a.length; i++)
			if(a[i] > big)
				big = a[i];
		
		return big;
		
	}
	
	
	
	
	public String[] sortNames(String names[]) {
		
		String temp;
		
		
		for(int i=0; i<(names.length)-1; i++) {
			for(int j=0; j<(names.length)-i-1; j++)
				if(names[j].compareTo(names[j+1]) > 0) {
					temp = names[j];
					names[j] = names[j+1];
					names[j+1] = temp;
				}
		}
		
		return names;
	}
}
