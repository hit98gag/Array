package Array;
import java.util.*;
public class ArithmaticoperationInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int a [] = new int[n];
		
		int b = 0;
		int p=1;
		int s = 0;
		int m = 10; 
		
		for(int i =0 ;i<a.length;i++) {
			
			a[i]= input.nextInt();
			
		}
		for(int i =0;i<a.length;i++) {
			
			b = a[i]+b;
			
			p = p*a[i];
			
			s= s=a[i];
			
		}
		
		System.out.println(b);
		System.out.println(p);
		System.out.println(s);
		System.out.println(m);

	}

}
