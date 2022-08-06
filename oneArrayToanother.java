package Array;
import java.util.*;
public class oneArrayToanother {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int a[] = new int[n];
		int b[] = new int[a.length];
		for(int i=0; i<a.length;i++) {
			a[i]= input.nextInt();
			
			b[i]=a[i];

		}
		
		System.out.println(Arrays.toString(b));


		

}}
