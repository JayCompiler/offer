package offer;

import java.util.ArrayList;
import java.util.Arrays;

public class _29GetLeastNumbers {

	public static void main(String[] args) {

	}

	public ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
		ArrayList<Integer> arrayList=new ArrayList<>();
		if(input==null||input.length==0||k>input.length) {
			return arrayList;
		}
		Arrays.sort(input);
		for(int i=0;i<k;i++) {
			arrayList.add(input[i]);
		}
		return arrayList;
	}
}
