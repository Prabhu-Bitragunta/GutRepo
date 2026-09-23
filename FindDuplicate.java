package phase1;

public class FindDuplicate {
	public static void main(String[] args) {
		int[] a = { 1, 3, 4, 2, 2 };
		int n = a.length - 1;
		int expsum = n * (n + 1) / 2;
		int actsum = 0;
		for (int i = 0; i < a.length; i++) {
			actsum += a[i];
		}
		System.out.println(actsum - expsum);
	}
}
