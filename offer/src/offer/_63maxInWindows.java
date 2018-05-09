package offer;

import java.util.ArrayList;

public class _63maxInWindows {

	public static void main(String[] args) {
		int[] num= {2,3,4,2,6,2,5,1};
		ArrayList<Integer> arrayList=maxInWindows(num, 3);
		for (Integer integer : arrayList) {
			System.out.println(integer);
		}
	}

	public static ArrayList<Integer> maxInWindows(int[] num, int size) {
		ArrayList<Integer> arrayList=new ArrayList<>();
		if(num==null||num.length<size||size<=0) {
			return arrayList;
		}
		for(int i=0;i<=num.length-size;i++) {
			int max=Integer.MIN_VALUE;
			for(int j=i;j<i+size;j++) {
				if(num[j]>max) {
					max=num[j];
				}
			}
			arrayList.add(max);
		}
		return arrayList;
	}
}
