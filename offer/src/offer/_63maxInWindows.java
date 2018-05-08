package offer;

import java.util.ArrayList;

public class _63maxInWindows {

	public static void main(String[] args) {
		int[] num= {2,3,4,2,6,2,5,1};
	}

	public ArrayList<Integer> maxInWindows(int[] num, int size) {
		ArrayList<Integer> arrayList=new ArrayList<>();
		if(num==null||num.length<size||size<=0) {
			return arrayList;
		}
		//第一个窗口的最大值，以及索引
		int max=Integer.MIN_VALUE;
		int index=0;
		for(int i=0;i<size;i++) {
			if(num[i]>max) {
				max=num[i];
				index=i;
			}
		}
		return arrayList;
	}
}
