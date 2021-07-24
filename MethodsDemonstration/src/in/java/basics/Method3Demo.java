// Program to demonstrate with arguments and no return value, method type

package in.java.basics;

public class Method3Demo {
	
	public static void main(String[] args) {
		
		Method3Demo md = new Method3Demo();
		md.showNumbers(45, 86);
	}
	
	public void showName(String name) {
		
		System.out.println("Name= "+name);
	}
	
	public void showNumbers(int m, int n) {
		System.out.println("m= "+m);
		System.out.println("n= "+n);
	}

}


