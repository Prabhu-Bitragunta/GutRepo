package phase1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leader {

	public static void main(String[] args) {
		int arr[] = { 17,18,5,4,6,1 };
//		int n = a.length - 1;
//		int max = Integer.MIN_VALUE;
//		List<Integer> li=new ArrayList<>();
//		for (int i = n; i >= 0; i--) {
//			if (a[i] > max) {
//				li.add(a[i]);
//				max = a[i];
//			}
//		}	
//		System.out.println(li.reversed());
		int max=-1;
		arr[arr.length-1]=max;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]>max){
                max=arr[i];
            }
            arr[i]=max;
        }
        System.out.println(Arrays.toString(arr));
	}

}
