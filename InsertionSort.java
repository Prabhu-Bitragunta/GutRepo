package phase1;

import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args) {
		int a[] = { 6, 4, 3, 8, 2, 4 };
		for (int i = 1; i < a.length; i++) {
			int temp = a[i];
			int j = i;
			while (j > 0 && a[j - 1] > temp) {
				a[j] = a[j - 1];
				j--;
			}
			a[j] = temp;
		}
		System.out.println(Arrays.toString(a));

	}

}
