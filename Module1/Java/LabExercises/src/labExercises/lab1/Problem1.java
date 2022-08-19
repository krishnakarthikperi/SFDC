package labExercises.lab1;

public class Problem1 {
	public int calculateSum(int n) {
		int sum=0;
		int count=0;
		for(int i=1;count<n;i++) {
			if(i%3==0 || i%5==0) {
				sum=sum+i;
				count++;
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		Problem1 P1 = new Problem1();
		int n=10;
		System.out.print("Sum of first "+n+" natural numbers divisible by 3 and 5: "+P1.calculateSum(10));
	}

}
