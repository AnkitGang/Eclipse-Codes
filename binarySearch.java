// USING RECURSION //
/*
public class binarySearch {
	static int binary_search(int [] arr, int low, int high, int target) {
		int mid;
		if(high >= low) {
			mid = (low + high)/2;
			
			if(arr[mid] == target)
				return mid;
			else if(arr[mid] > target)
				return binary_search(arr, low, mid-1, target);
			else
				return binary_search(arr, mid+1, high, target);
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		int arr[] = {1, 2, 4, 5, 6, 7, 8, 9};
		int low = 0, high = arr.length-1;
		int target = 6;
		int position = binary_search(arr, low, high, target);
		
		if(position == -1)
			System.out.println("Element not found");
		else
			System.out.println("Position = " + (position+1));
	}
}
*/

// USING LOOP //
/*
public class binarySearch {
	static int binary_search(int [] arr, int low, int high, int target) {
		int mid = (low + high)/2;
		while(high >= low) {
			if(arr[mid] == target)
				return mid;
			else if(arr[mid] > target)
				high = mid-1;
			else
				low = mid+1;
			
			mid = (low + high)/2;
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		int arr[] = {1, 2, 4, 5, 6, 7, 8, 9};
		int low = 0, high = arr.length-1;
		int target = 9;
		int position = binary_search(arr, low, high, target);
		
		if(position == -1)
			System.out.println("Element not found");
		else
			System.out.println("Position = " + (position+1));
	}
}
*/


// USING Arrays.binarySearch() //
import java.util.Arrays;
public class binarySearch {
	public static void main(String[] args) {
		int arr[] = {1, 2, 4, 6, 7, 8, 9, 10};
		int target = 3;
		
		int position = Arrays.binarySearch(arr, target);
		if(position < 0)
			System.out.println("Element not found");
		else
			System.out.println("Position = "+ (position+1));
	}
}