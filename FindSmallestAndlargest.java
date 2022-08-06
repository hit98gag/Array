package Array;

import java.util.Scanner;

public class FindSmallestAndlargest {

	public static void main(String[] args) {

		
	int a[] = {1,3,4,2,5,6};
		
		int n = a.length;
		int large = a[0];
		int small = a[0];
		
		for(int i=1;i<a.length;i++) {
			if(a[i]>large) {
				large = a[i];
			}
			if(a[i]<small) {
				small = a[i];
			}
		}
  System.out.println(small);
  System.out.println(large);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
	}


