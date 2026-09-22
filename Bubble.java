package phase1;

import java.util.Arrays;

public class Bubble {
	public static void main(String[] args) {

		int a[] = { 5, 3, 4, 2, 1 };
		int temp;
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - 1 - i; j++) { // here -i is for not checking the last elements as
				// end of one pass will move big element to last one by one ,pass by pass.
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
