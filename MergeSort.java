package phase1;

import java.util.Arrays;

public class MergeSort {
	static void divide(int a[]) {
		if (a.length == 1)
			return;
		int left[] = new int[a.length / 2];
		int right[] = new int[a.length - left.length];
		int i;
		for (i = 0; i < left.length; i++) {
			left[i] = a[i];
		}
		for (int j = 0; j < right.length; j++) {
			right[j] = a[i++];
		}
		divide(left);
		divide(right);
		merge(a, left, right);
	}

	static void merge(int[] a, int[] left, int[] right) {
		int i = 0, j = 0, k = 0;
		while (i < left.length && j < right.length) {
			if (left[i] <= right[j]) {
				a[k++] = left[i++];
			} else {
				a[k++] = right[j++];
			}
		}
		while (i < left.length) {
			a[k++] = left[i++];
		}
		while (j < right.length) {
			a[k++] = right[j++];
		}
	}

	public static void main(String[] args) {
		int a[] = { 9, 8, 7, 6, 6, 5, 4, 3, 2, 1 };
		divide(a);
		System.out.println(Arrays.toString(a));
	}
}
