package week1.day2;

import java.util.Arrays;

public class MissingElementInArray {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,7,6,8};
		Arrays.sort(arr);
		
		for(int num=1; num<=6; num++)
		{
			if(num!=arr[num-1])
			{
			System.out.println("Missing number is" +num);
			break;
			
			}
		
		}

		

	}

}
