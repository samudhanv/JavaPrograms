// Program to demonstrate with arguments and with return value, method type

package in.java.basics;

public class Method4Demo {
	
	public static void main(String[] args) {
		
		Method4Demo md = new Method4Demo();
		
		System.out.println("Name Size= "+md.getNameSize("Java Programming"));
		System.out.println("Maximum= "+md.findMax(56.23f, 56.06f));
	}
	
	public int getNameSize(String name) {
		
		return name.length();
	}
	
	public float findMax(float m, float n) {
		return m>n?m:n;
	}

}


