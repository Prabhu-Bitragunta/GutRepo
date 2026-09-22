package phase1;

public class RemoveDupsFromSorted {
	
	static int fun(int[] a) {
		int i = 0;
		for (int j = 0; j < a.length; j++) {
			if (a[i] != a[j]) {
				a[++i] = a[j];
			}
		}

		return i + 1;
	}

	public static void main(String[] args) {
		int[] a = { 0, 1, 2, 2, 3, 4, 4 };
		int i = fun(a);
		for (int j = 0; j < i; j++) {
			System.out.print(a[j] + " ");
		}
//		int a[]= {1,2,3,5};
//		int sum = 0;
//		for (int i : a) {
//			sum += i;
//		}
//		int n = a.length + 1;
//		System.out.println(n * (n + 1) / 2 - sum);
		

	}
}
