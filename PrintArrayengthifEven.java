package Array;

import java.util.*;

public class PrintArrayengthifEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int a[] = new int[n];
        boolean flag = true;
		for (int i = 0; i < a.length; i++) {

			a[i] = input.nextInt();
			
			
		}
		System.out.println(a.length);

if(a.length%2!=0) {
	flag=false;
}

System.out.println(flag);

		

	}

}
