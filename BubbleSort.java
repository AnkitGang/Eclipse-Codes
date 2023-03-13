package Sorting;

import java.util.*;

public class BubbleSort {
	public void bubbleSort(int [] arr) {
		int temp=0;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[j] < arr[i]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	
	public void print(int [] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args) {
		BubbleSort bs = new BubbleSort();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array:");
		int n = sc.nextInt();
		
		int [] arr = new int[n];
		
		System.out.println("Enter array elements:");
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Array before Sorting:");
		bs.print(arr);
		
		bs.bubbleSort(arr);
		System.out.println("Array after Sorting:");
		bs.print(arr);
		
		sc.close();
	}

}
