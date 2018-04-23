package offer;

import java.util.ArrayList;

public class _13ReOrderArray {

	public static void main(String[] args) {

	}
    public void reOrderArray(int [] array) {
    	ArrayList<Integer> odd=new ArrayList<>();
    	ArrayList<Integer> even=new ArrayList<>();
        for(int i=0;i<array.length;i++) {
        	if(array[i]%2!=0) {
        		odd.add(array[i]);
        	}else {
        		even.add(array[i]);
        	}
        }
        for(int i=0;i<odd.size();i++) {
        	array[i]=odd.get(i);
        }
        int pre=odd.size();
        for(int i=0;i<even.size();i++) {
        	array[pre+i]=even.get(i);
        }
    }
}
