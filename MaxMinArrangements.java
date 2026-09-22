package phase1;

import java.util.Arrays;

public class MaxMinArrangements {
	
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 7 };
		int b[] = new int[a.length];
		int k = 0;
		int left = 0;
		int right = a.length - 1;
		while (left <= right) {
			if (left != right) {
				b[k++] = a[right--];
				b[k++] = a[left++];
			} else {
				b[k] = a[left++];
			}
		}
		System.out.println(Arrays.toString(b));
	}
}
