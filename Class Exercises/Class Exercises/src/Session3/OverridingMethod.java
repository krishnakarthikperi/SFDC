package Session3;

class Parent{
	public void doSomething() {
		System.out.println("Doing smthng in parent class");
	}
	public void fn1() {
		System.out.println("Parent class");
	}
}
class Child extends Parent{
	public void doSomething() {
		System.out.println("Doing smthng in child class");
	}
	public void fn2() {
		System.out.println("Child class");
	}
}
public class OverridingMethod {

	public static void main(String[] args) {
		Parent p= new Parent();
		p.doSomething();
		Parent p1 = new Child();
		//p1 is polymorphic variable
		//The polymorphic variable can call all the methods of parent class except overriden methods.
		//It can call only the overriden methods from the child class
		p1.doSomething();
		p1.fn1();
	}
}