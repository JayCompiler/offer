package offer;

import java.util.ArrayList;
import java.util.Collections;

public class _62GetMedian {
	ArrayList<Integer> arrayList=new ArrayList<>();
	public static void main(String[] args) {

	}

	public void Insert(Integer num) {
		arrayList.add(num);
	}

	public Double GetMedian() {
		Collections.sort(arrayList);
		int size=arrayList.size();
		double res=0.0;
		if(size%2==0) {
			int m=size/2;
			res=(arrayList.get(m)+arrayList.get(m-1))/2.0;
		}else {
			res=arrayList.get(size/2);
		}
		return res;
	}
}
