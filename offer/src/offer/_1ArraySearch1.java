package offer;

public class _1ArraySearch1 {

	public static void main(String[] args) {
		int [][] a= {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
		System.out.println(a.length);
		boolean flag=arrSearch(7, a);
		System.out.println(flag);
	}
	
	public static boolean arrSearch(int target, int[][] array) {
		for (int[] is : array) {
			for (int i : is) {
				if(i==target) {
					return true;
				}	
			}
		}
		return false;
	}
}
