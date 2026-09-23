package phase1;

import java.util.Arrays;

public class MoveNegativeToFirst {
	public static void main(String[] args) {
		int[] a = { 1, -2, 3, -4, 5, -6 };
//		for(int i=0;i<a.length;i++) {
//			if(a[i]<0) {
//				int j=i;
//				int temp=a[i];
//				while(j!=0 && a[j-1]>0) {
//					a[j]=a[j-1];
//					j--;
//				}
//				a[j]=temp;
//			}
//		}
		
//		int j=0;
//		for(int i=0;i<a.length;i++) {
//			if(a[i]<0) {
//				int temp=a[j];
//				a[j]=a[i];
//				a[i]=temp;
//				j++;
//			}
//		}
//		System.out.println(Arrays.toString(a));
		String s="amil";
		System.out.println(System.identityHashCode(s));
		s="kumar";
		System.out.println(System.identityHashCode(s));
	}
}
