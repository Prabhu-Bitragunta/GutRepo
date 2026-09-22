package phase1;

import java.util.Arrays;

public class Selection {
	public static void main(String[] args) {
		int a[]= {9,3,6,2,5,1,3,6,7};
		int temp;
		for(int i=0;i<a.length;i++) {
			int mi=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[j]<a[mi])
					mi=j;
			}
			temp=a[mi];
			a[mi]=a[i];
			a[i]=temp;
		}
		System.out.println(Arrays.toString(a));
	}

}
