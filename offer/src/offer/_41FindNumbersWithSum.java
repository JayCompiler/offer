package offer;

import java.util.ArrayList;

public class _41FindNumbersWithSum {

	public static void main(String[] args) {
		int [] array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		ArrayList<Integer> res=FindNumbersWithSum(array, 21);
		for (Integer integer : res) {
			System.out.println(integer);
		}
	}

	public static ArrayList<Integer> FindNumbersWithSum(int[] array, int sum) {
		ArrayList<Integer> res=new ArrayList<>();
		if(array==null||array.length==0) {
			return res;
		}
		int multi=Integer.MAX_VALUE;
		int[] re =new int[2];
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				System.out.println(array[i]+":"+array[j]);
				int temp=array[i]+array[j];
				if(temp>sum) {
					break;
				}
				if(temp==sum) {
					if(multi>array[i]*array[j]) {
						multi=array[i]*array[j];
						re[0]=array[i];
						re[1]=array[j];			
					}
				}
			}
		}
		if(re[1]==re[0]) {
			return res;
		}
		res.add(re[0]);
		res.add(re[1]);
		return res;
	}
}
