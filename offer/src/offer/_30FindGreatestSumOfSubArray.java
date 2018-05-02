package offer;

public class _30FindGreatestSumOfSubArray {
//超级经典的一道题
	public static void main(String[] args) {
		int [] array={-3,-2,7,-15,1,2,2};
		System.out.println(FindGreatestSumOfSubArray(array));
	}
	public static int FindGreatestSumOfSubArray(int[] array) {
		int globalmax=Integer.MIN_VALUE;
		int currentmax=0;
		for(int i=0;i<array.length;i++) {
			currentmax+=array[i];
			if(currentmax>globalmax){
				globalmax=currentmax;
			}
			if(currentmax<0) {
				currentmax=0;
			}
		}
		return globalmax;
	}
}
