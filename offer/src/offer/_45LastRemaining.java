package offer;

import java.util.ArrayList;

public class _45LastRemaining {

	public static void main(String[] args) {
		//System.out.println(3%5);
		int a=LastRemaining_Solution(5, 2);
		System.out.println(a);
	}
    public static int LastRemaining_Solution(int n, int m) {
    	if(n==0) {
    		return -1;
    	}
    	ArrayList<Integer> child=new ArrayList<>();
        for(int i=0;i<n;i++) {
        	child.add(i);
        }
        int index=0;
        for(int i=(index+m-1)%(child.size());i<child.size();i=(i+m-1)%(child.size())) {
        	if(child.size()==1) {
        		break;
        	}
        	child.remove(i);
        }
        return child.get(0);
    }
}
