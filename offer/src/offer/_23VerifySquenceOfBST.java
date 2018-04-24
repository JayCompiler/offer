package offer;

import java.util.Arrays;

public class _23VerifySquenceOfBST {

	public static void main(String[] args) {
		//int [] a= {7,4,6,5};
		int [] a= {1,2,3,4,5};
		System.out.println(VerifySquenceOfBST(a));
	}

	public static boolean VerifySquenceOfBST(int[] sequence) {
		if (sequence.length == 1 || sequence.length == 2) {
			return true;
		}
		if(sequence.length==0)
			return false;
		int root = sequence[sequence.length - 1];
		int index = 0;
		for (int i = 0; i < sequence.length - 1; i++) {
			if (sequence[i] > root) {
				index = i;
				break;
			}
			index++;
		}
		for(int i=index;i<sequence.length-1;i++) {
			if(sequence[i]<root) {
				return false;
			}
		}
		if (index == 0) {
			return VerifySquenceOfBST(Arrays.copyOfRange(sequence, index, sequence.length - 1));
		} else if (index == sequence.length - 1) {
			return VerifySquenceOfBST(Arrays.copyOfRange(sequence, 0, index));
		} else {
			return VerifySquenceOfBST(Arrays.copyOfRange(sequence, 0, index))
					&& VerifySquenceOfBST(Arrays.copyOfRange(sequence, index, sequence.length - 1));
		}
	}
}
