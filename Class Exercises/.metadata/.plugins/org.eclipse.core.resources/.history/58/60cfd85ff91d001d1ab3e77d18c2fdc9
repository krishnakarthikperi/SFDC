package Session3.interfaces;

public class Example implements MyInterface,MyInterface1{

	
	public static void main(String[] args) {
		MyInterface obj = new Example();
		obj.exisitingMethod("Hello");
		obj.newMethod();
		MyInterface.anotherNewMethod();
		MyInterface1 obj1 = new Example();
		obj1.disp("world");
	}

	@Override
	public void exisitingMethod(String str) {
		System.out.println("String is: "+str);	
	}
	
	@Override
	public void newMethod() {
		System.out.println("Overriden in implemeted method");
	}

	@Override
	public void disp(String str) {
		System.out.println("My interface1: "+str);
		
	}
}
