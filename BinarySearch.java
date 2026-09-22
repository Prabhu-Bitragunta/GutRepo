package phase1;

public class BinarySearch {
	public static void main(String[] args) {
		int a[] = { 10, 20, 30, 40, 50, 60 };
		int foundIndex = -1;
		int target = 40;
		int left = 0;
		int right = a.length - 1;
		int mid;
		while (left <= right) {
			mid = (left + right) / 2;
			if (a[mid] == target) {
				foundIndex = mid;
				break;
			} else if (a[mid] > target) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		if (foundIndex == -1) {
			System.out.println("Element not Found");
		} else {
			System.out.println("Found at position " + foundIndex);
		}
	}
}
