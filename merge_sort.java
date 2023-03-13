package Sorting;

import java.util.*;

public class merge_sort {
	void merge(int [] arr, int l, int m, int r) {
		int n1 = m-l+1;
		int n2 = r-m;
		
		// create temp array for storing left and right subarray
		int [] L = new int[n1];
		int [] R = new int[n2];
		
		for(int i=0; i<n1; i++) {
			L[i] = arr[l+i];
		}
		for(int j=0; j<n2; j++) {
			R[j] = arr[m+1+j];
		}
		
		//initial index of first and second subarrays
		int i=0;
		int j=0;
		
		//initial index of merged array
		int k=l;
		
		while(i<n1 && j<n2) {
			if(L[i] < R[j]) {
				arr[k] = L[i];
				k++;
				i++;
			}
			else {
				arr[k] = R[j];
				k++;
				j++;
			}
		}
		
		//for storing remaining elements in L[] if any
		while(i<n1) {
			arr[k] = L[i];
			k++;
			i++;
		}
		
		//for storing remaining elements in R[] if any
		while(j<n2) {
			arr[k] = R[j];
			k++;
			j++;
		}
	}
	
	void sort(int [] arr, int l, int r) {
		if(l<r) {
			//find middle point
			int m = (l+r)/2;
			
			//sort the left and right arrays
			sort(arr, l, m);
			sort(arr, m+1, r);
			
			//merge the left and right arrays
			merge(arr, l, m, r);
		}
	}
	
	static void print_array(int [] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String [] args) {
		merge_sort m1 = new merge_sort();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of array:");
		int n = sc.nextInt();
		
		int [] arr = new int[n];
		System.out.println("Enter elements of array:");
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println();
		m1.sort(arr, 0, arr.length-1);
		System.out.println("after sorting:");
		print_array(arr);
	}
}
