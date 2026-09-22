package phase1;

public class ThirdLargest {
	public static void main(String[] args) {
		int a[] = { 5, 3, 6, 7, 8, 3, 2, 9 };
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		int third = Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > first) {
				third = second;
				second = first;
				first = a[i];
			} else if (a[i] < first && a[i] > second) {
				third = second;
				second = a[i];
			} else if (a[i] < first && a[i] < second && a[i] > third) {
				third = a[i];
			}
		}
		System.out.println("First :" + first);
		System.out.println("Second :" + second);
		System.out.println("Third :" + third);
	}
}
