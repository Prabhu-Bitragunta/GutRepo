package phase1;

public class IsSorted {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		boolean status=true;
		for(int i=0;i<a.length-1;i++) {
			if(a[i]>a[i+1]) {
				status=false;
				break;
			}
		}
		System.out.println(status);
	}
}
