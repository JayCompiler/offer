package offer;

import java.util.ArrayList;

public class _40FindContinuousSequence {

	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> res=FindContinuousSequence(100);
		for (ArrayList<Integer> arrayList : res) {
			for (Integer integer : arrayList) {
				System.out.print(integer+" ");
			}
			System.out.println();
		}
	}
    public static ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
    	ArrayList<ArrayList<Integer>> res=new ArrayList<>();
    	int[] sumArray=new int[sum+1];
    	sumArray[0]=0;
    	for(int k=1;k<=sum;k++) {
    		sumArray[k]+=sumArray[k-1]+k;
    	}
    	int i=1;
    	int j=1;
    	while(i<=sum&&j<=sum) {
    		int curr=sumArray[j]-sumArray[i-1];
    		if(curr<sum) {
    			j++;
    		}else if(curr>sum) {
    			i++;
    		}else {
    			if(j-i>=1) {
    				ArrayList<Integer> local=new ArrayList<>();
    				for(int k=i;k<=j;k++) {
    					local.add(k);
    				}
    				res.add(local);
    			}
    			i++;
    		}
    	}
        return res;
    }
}
