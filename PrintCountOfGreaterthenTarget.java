package Array;

import java.util.Scanner;

public class PrintCountOfGreaterthenTarget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int a[] = new int[n];
		int target = 10;
		int count = 0;
		int count1 = 0;
		for (int i = 0; i < a.length; i++) {

			a[i] = input.nextInt();

		}
		
		for(int i=0;i<a.length;i++) {

			if (a[i] > target) {
				count++;
			} 
			else if (a[i] < target) {
				count1++;
				
			}
		}

		System.out.println(count);
		System.out.println(count1);

	}

}
