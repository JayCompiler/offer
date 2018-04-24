package offer;

import java.util.ArrayList;

public class _19PrintMatrix {

	public static void main(String[] args) {
		// int[][] arr= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		int[][] arr = { { 1 } };
		//int[][] arr = { { 1,2,3,4,5 } };
		ArrayList<Integer> arrayList = new ArrayList<>();
		// printRound(arr, 0, arr.length, 0, arr[0].length, arrayList);
		arrayList = printMatrix(arr);
		for (Integer integer : arrayList) {
			System.out.println(integer);
		}
	}

	public static ArrayList<Integer> printMatrix(int[][] matrix) {
		int mlen = matrix.length;
		int nlen = matrix[0].length;
		int ce = 0;
		if (mlen < nlen) {
			ce = (int) Math.ceil((double)mlen / 2) ;
		} else {
			ce = (int) Math.ceil((double)nlen / 2);
		}
		ArrayList<Integer> arrayList = new ArrayList<>();
		for (int i = 0; i < ce; i++) {
			printRound(matrix, i, mlen - i, i, nlen - i, arrayList);
		}
		return arrayList;
	}

	private static void printRound(int[][] matrix, int i, int mlen, int j, int nlen, ArrayList<Integer> arrayList) {
		for (int n = j; n < nlen; n++)
			arrayList.add(matrix[0 + i][n]);
		for (int m = i + 1; m < mlen; m++)
			arrayList.add(matrix[m][nlen - 1]);
		for (int n = nlen - 2; n >= 0 + j; n--) {
			if(mlen-1!=i) {
				arrayList.add(matrix[mlen - 1][n]);
			}else {
				break;
			}
		}	
		for (int m = mlen - 2; m >= 1 + i; m--)
			if(nlen-1!=0+i) {
				arrayList.add(matrix[m][0 + i]);
			}else {
				break;
			}
	}

}
