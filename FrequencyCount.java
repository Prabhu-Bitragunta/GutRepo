package phase1;

import java.util.HashMap;
import java.util.Map.Entry;

public class FrequencyCount {
	public static void main(String[] args) {
		int[] a = { 1, 2, 4, 3, 1, 4, 2 };

		// 1
//		String s = "";
//		for (int i = 0; i < a.length; i++) {
//			int e = a[i];
//			int count = 0;
//			for (int j = 0; j < a.length; j++) {
//				if (e == a[j])
//					count++;
//			}
//			if (s.indexOf(Integer.toString(e)) == -1) {
//				System.out.println(e + "->" + count);
//				s = s + e + " ";
//			}
//
//		}

		// 2
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i : a) {
			map.put(i, map.getOrDefault(i, 0) + 1);
		}
		System.out.println(map);
		int ele = Integer.MAX_VALUE;
		int freq = -1;
		for (Entry<Integer, Integer> e : map.entrySet()) {
			if (e.getKey() < ele && e.getValue() > freq) {
				ele = e.getKey();
				freq = e.getValue();
			}
		}
		System.out.println(ele);

//		int[] a = { 1, 3, 20, 4, 1, 0 };
//		for (int i = 0; i < a.length; i++) {
//			if (i == 0) {
//				if (a[i] > a[i + 1]) {
//					System.out.println(a[i]);
//				}
//			} else if (i == a.length - 1) {
//				if (a[i] > a[i - 1]) {
//					System.out.println(a[i]);
//				}
//			} else if (a[i] > a[i - 1] && a[i] > a[i + 1]) {
//					System.out.println(a[i]);
//				}
//			}

	}
}
