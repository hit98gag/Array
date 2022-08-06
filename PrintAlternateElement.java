package Array;
import java.util.*;
public class PrintAlternateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int a[] = new int[n];
		
		
		for(int i=0;i<a.length;i++)
		{
			a[i] = input.nextInt();
		}
		
		for(int i=0;i<a.length;i=i+2) {
			
			System.out.print(a[i]);
		}
		
		System.out.println();
		for(int i=a.length-1;i>=0;i=i-2) {
			
			System.out.print(a[i]);
		}

	}

}
