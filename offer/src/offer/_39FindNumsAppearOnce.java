package offer;

import java.util.HashMap;
import java.util.Map.Entry;

public class _39FindNumsAppearOnce {

	public static void main(String[] args) {
		HashMap<Integer, Integer> map=new HashMap<>();
		System.out.println(map.get(0));
		System.out.println(2^3);
		System.out.println(1<<1);
	}

	public void FindNumsAppearOnce(int[] array, int num1[], int num2[]) {
		HashMap<Integer, Integer> map=new HashMap<>();
		for(int i=0;i<array.length;i++) {
			int key=array[i];
			if(map.get(key)==null) {
				map.put(key, 1);
			}else {
				map.put(key, map.get(key)+1);
			}
		}
		int[] res=new int[2];
		int i=0;
		for(Entry<Integer, Integer> entry:map.entrySet()) {
			if(entry.getValue()==1) {
				res[i]=entry.getKey();
				i++;
			}else {
				continue;
			}
		}
		num1[0]=res[0];
		num2[0]=res[1];
	}
	public void FindNumsAppearOnce1(int[] array, int num1[], int num2[]) {
		int res=0;
		for(int i=0;i<array.length;i++) {
			res^=array[i];
		}
		int count=0;
		for(;;count++) {
			if((res&(1<<count))!=0) {
				break;
			}
		}
		for(int i=0;i<array.length;i++) {
			if((array[i]&(1<<count))==0) {
				num1[0]^=array[i];
			}else {
				num2[0]^=array[i];
			}
		}
	}
}
