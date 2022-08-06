package Array;

public class FindIfArraySorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {1,2,3,4,5};
		boolean flag = true;
			for(int j=0;j<a.length-1;j++) {
			
			if(a[j]>a[j+1])
			{
				flag = false;
			}
			
			
		}
	
		System.out.println(flag);
	}
}
