package labExercises.lab5;

public class Problem2 {
	int recursiveFibonacci(int n){
		if (n <= 1)
		       return n;
	    return recursiveFibonacci(n-1) + recursiveFibonacci(n-2);
	}
	
	int nonRecursiveFibonacci(int n) {
		int f[] = new int[n+2];
	    int i;
	    f[0] = 0;
	    f[1] = 1;
	     
	    for (i = 2; i <= n; i++)
	    {
	        f[i] = f[i-1] + f[i-2];
	    }
	      
	    return f[n];
	}

	public static void main(String[] args) {
		int n=9;
		Problem2 P2 = new Problem2();
		System.out.println(P2.recursiveFibonacci(n));
		System.out.println(P2.nonRecursiveFibonacci(n));

	}

}
