package labExercises.lab5;

public class Problem3 {
	static boolean isPrime(int n){
        if(n==1||n==0)return false;
        for(int i=2; i<n; i++){
              if(n%i==0)return false;
        }
        return true;
	}
	public void printPrimes(int n) {
		for(int i=1; i<=n; i++){
	        if(isPrime(i)) {
	            System.out.print(i + " ");
	        }
		}
	}

	public static void main(String[] args) {
		int n=9;
		Problem3 P3 = new Problem3();
		P3.printPrimes(n);

	}

}
