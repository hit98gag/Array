package Array;
import java.util.*;
public class ArrayPRintReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
				
		int a[] = new int[n];
		
		for(int i =0;i<a.length;i++)
		{
			a[i] = input.nextInt();

		}
		
		for(int j =a.length-1;j>=0;j--)
		{
         System.out.print(a[j] + " ");
		}
		System.out.println( );
		for(int j =0;j<a.length;j++)
		{
       System.out.print(a[j]+ " ");
		}

	}

}
