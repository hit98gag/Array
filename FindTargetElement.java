package Array;

import java.util.*;

public class FindTargetElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int a[] = new int[n];
		boolean flag = true;
		int target = 10;
		int index = 0;
		for (int i = 0; i < a.length; i++) {

			a[i] = input.nextInt();

		}
		for (int i = 0; i < a.length; i++) {

			if (a[i] == target) {

				index = i;
			}

		}
		System.out.println("Target is at index : " + index);

	}

}
