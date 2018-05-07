package offer;

import java.util.ArrayList;

public class _49duplicate {

	public static void main(String[] args) {

	}

	public boolean duplicate(int numbers[], int length, int[] duplication) {
		if(numbers==null||length==0) {
			duplication[0]=-1;
			return false;
		}
		ArrayList<Integer> arrayList=new ArrayList<>();
		boolean flag=false;
		for(int i=0;i<length;i++) {
			if(arrayList.contains(numbers[i])) {
				duplication[0]=numbers[i];
				flag=true;
				break;
			}else {
				arrayList.add(numbers[i]);
			}
		}
		return flag;
	}
}
