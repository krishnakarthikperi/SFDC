package Session3;

//class A{}
//class B extends A{}
//class C extends B{}
public class OverLoadedMethod {
//	public void test(B obj) {
//		System.out.println("B");
//	}
//	public void test(C obj) {
//		System.out.println("C");
//	}
	public void test(int[] arr) {
		System.out.println("B");
	}
	public void test(char[] arr) {
		System.out.println("C");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverLoadedMethod obj = new OverLoadedMethod();
		char[] arr = {'1','2','3'};
 		obj.test(arr);
	}

}
