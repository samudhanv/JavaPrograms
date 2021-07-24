// Program to demonstrate no arguments and with return value, method type

package in.java.basics;

public class Method2Demo {

	public static void main(String[] args) {
		
		Method2Demo method2Demo = new Method2Demo();
		
		method2Demo.getValue();	//Calling getValue method
		System.out.println(method2Demo.getName());
		

	}
	
	public String getName() {
		String name = "Java World";
		return "Hello "+name;
	}
	
	public float getValue() {
		float val = 25.75f;
		return val+10;
	}

}
