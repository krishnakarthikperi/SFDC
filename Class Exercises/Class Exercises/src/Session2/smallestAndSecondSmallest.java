package Session2;

import java.util.Arrays;
import java.util.*;
public class smallestAndSecondSmallest{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner usrip = new Scanner(System.in);
		System.out.println("Enter array length:");
		int length = usrip.nextInt();
		int[] arr = new int[length];
		System.out.println("Enter array elements:");
		for(int i=0;i<length;i++) {
			arr[i]=usrip.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("First smallest: "+arr[0]+"\nsecond smallest: "+arr[1]);
		usrip.close();
	}

}
