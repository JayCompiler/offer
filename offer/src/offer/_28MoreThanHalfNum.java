package offer;

import java.util.HashMap;

public class _28MoreThanHalfNum {

	public static void main(String[] args) {
	}

	public int MoreThanHalfNum_Solution(int[] array) {
		if (array == null || array.length == 0) {
			return 0;
		}
		int len = array.length;
		int med = len / 2;
		HashMap<Integer, Integer> cou = new HashMap<>();
		int key = 0;
		int value=0;
		for (int i = 0; i < len; i++) {
			key = array[i];
			if (cou.get(key) == null) {
				cou.put(key, 1);
				value=1;
				if (1 > med) {
					break;
				}
			} else {
				value = cou.get(key) + 1;
				if (value > med) {
					break;
				}
				cou.put(array[i], value);
			}
		}
		if(value>med) {
			return key;
		}
		return 0;
	}
}
