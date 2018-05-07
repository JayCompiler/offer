package offer;

import java.util.Arrays;

public class _44isContinuous {

	public static void main(String[] args) {
		int [] arr= {1,3,2,5,4};
		System.out.println(isContinuous(arr));
	}

	public static boolean isContinuous(int[] numbers) {
		if(numbers.length!=5)
			return false;
		Arrays.sort(numbers);
		//大小王个数
		int count=0;
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]==0) {
				count++;
			}else {
				break;
			}
		}
		
		int sum=0;
		for(int i=count+1;i<numbers.length;i++) {
			if(numbers[i]==numbers[i-1]) {
				return false;
			}
			sum+=numbers[i]-numbers[i-1]-1;
		}
		if(sum>count) {
			return false;
		}else {
			return true;
		}
	}
}
