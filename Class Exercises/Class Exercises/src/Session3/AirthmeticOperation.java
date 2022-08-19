package Session3;

public class AirthmeticOperation {
	
	public void add(int num1, int num2) {
		System.out.println(num1+num2);
	}
	public void add(int num1, int num2,int num3) {
		System.out.println(num1+num2+num3);
	}
	public void add(double num1, int num2) {
		System.out.println(num1+num2);
	}
	public void add(int num1, double num2) {
		System.out.println(num1+num2);
	}
	public static void main(String[] args) {
		AirthmeticOperation obj = new AirthmeticOperation();
		obj.add(12,23);
		obj.add(12,23.67);
		obj.add(23.12,5);
		obj.add(1,2,3);
	}

}
