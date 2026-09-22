package phase1;

public class InclusionAndExclusion {

	static void inclusion(int a[][]) {
		for (int i = 0; i < a.length; i++) {
			int lie = 0;
			for (int j = 0; j < a.length; j++) {
				if (i == j)
					continue;
				if (a[i][0] > a[j][0] && a[i][1] < a[j][1]) {
					lie = 1;
					break;
				}
			}
			System.out.println(i + " " + lie);
		}
	}

	static void exclusion(int a[][]) {
		for (int i = 0; i < a.length; i++) {
			int notLie = 0;
			for (int j = 0; j < a.length; j++) {
				if (i == j)
					continue;
				if (a[i][0] < a[j][0] && a[i][1] > a[j][1]) {
					notLie = 1;
					break;
				}
			}
			System.out.println(i + " " + notLie);
		}
	}

	public static void main(String[] args) {
		int a[][] = { { 1, 2 }, { 2, 10 }, { 3, 9 }, { 5, 8 } };
		inclusion(a);
		exclusion(a);
	}
}
