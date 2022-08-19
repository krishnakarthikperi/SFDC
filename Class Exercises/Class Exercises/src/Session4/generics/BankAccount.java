package Session4.generics;

public class BankAccount<T> extends Object {
	T t1;
	public BankAccount(T t1) {
		this.t1=t1;
	}
	public void display() {
		System.out.println(t1);
	}
	public <T> void depositMoney(T[] money) {
		for(T t:money) {
			System.out.println(t);
		}
		
	}
}
