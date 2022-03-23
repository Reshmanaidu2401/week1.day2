package week1.day2.assignments;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,3,4,7,6,8};
		Arrays.sort(arr);
		int i;
		
		for(i=0;i<=arr.length-2;i++)
		{
			if(arr[i+1]!= arr[i]+1)
			
			{
				System.out.println(arr[i]+1);
			}
		}
		

	}

}
