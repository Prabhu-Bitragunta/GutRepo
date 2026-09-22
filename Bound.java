package phase1;

public class Bound {
	static int lowerBound(int[] a, int value) {
		int ans = -1;
		int left = 0, right = a.length - 1;
		while (left <= right) {
			int mid = (left + right) / 2;
			if (a[mid] >= value) {
				ans = mid;
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		return ans;
	}
	
	static int upperBound(int []a,int value) {
		int ans=-1;
		int left=0,right=a.length-1;
		while(left<right) {
			int mid=left+right/2;
			if(a[mid]<value) {
				ans=mid;
				left=mid+1;
			}
			else {
				right=mid-1;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		int a[] = { 3, 4, 5, 15, 16, 19 };
		int value = 9;

		System.out.println("lower bound "+lowerBound(a, value));
		System.out.println("upper bound "+upperBound(a, value));
	}
}
