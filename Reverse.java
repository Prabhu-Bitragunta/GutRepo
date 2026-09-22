package phase1;

import java.util.Arrays;

public class Reverse {
	public static void main(String[] args) {
		int a[] = { 8, 5, 3, 7, 3, 7, 4, 2 };
		int l=0,r=a.length-1;
		while(l<r) {
			int temp=a[l];
			a[l]=a[r];
			a[r]=temp;
			l++;
			r--;
		}
		System.out.println(Arrays.toString(a));
	}
}
