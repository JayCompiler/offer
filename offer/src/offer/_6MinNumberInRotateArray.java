package offer;

public class _6MinNumberInRotateArray {

	public static void main(String[] args) {

	}

	public int minNumberInRotateArray(int[] array) {
		if(array.length==0)
			return 0;
		int index=0;
		for(int i=0;i<array.length-1;i++) {
			if(array[i]>array[i+1]) {
				index=i+1;
				break;
			}	
		}
		return array[index];
	}

}
