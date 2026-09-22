package phase1;

import java.util.Arrays;

public class QuickSort {

//	static void quickSort(int a[], int start, int end) {
//		if (start >= end) {
//			return;
//		}
//		int pivotIndex = partition(a, start, end);
//		quickSort(a, start, pivotIndex - 1);
//		quickSort(a, pivotIndex + 1, end);
//	}
//
//	static int partition(int[] a, int start, int end) {
//		int pivot = a[end];
//		int pi = start;
//		for (int i = start; i < end; i++) {
//			if (a[i] < pivot) {
//				int temp = a[i];
//				a[i] = a[pi];
//				a[pi] = temp;
//				pi++;
//			}
//		}
//		int temp = a[pi];
//		a[pi] = a[end];
//		a[end] = temp;
//		return pi;
//	}
	static void quick(int a[], int low, int high) {
		if (low >= high) {
			return;
		}
		int pi = part(a, low, high);
		quick(a, low, pi - 1);
		quick(a, pi + 1, high);
	}

	static int part(int[] a, int low, int high) {
		int pivot = a[low];
		int i = low, j = high;
		while (i < j) {
			while (i <= high && a[i] <= pivot) {
				i++;
			}
			while (j >= low && a[j] > pivot) {
				j--;
			}
			if (i < j) {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;

			}
		}
		int temp = a[low];
		a[low] = a[j];
		a[j] = temp;
		return j;
	}

	public static void main(String[] args) {
		int a[] = { 6, 2, 5, 3, 6, 2, 8, 1 };
		quick(a, 0, a.length - 1);
		System.out.println(Arrays.toString(a));

	}
}
