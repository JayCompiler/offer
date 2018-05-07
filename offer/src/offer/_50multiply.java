package offer;

public class _50multiply {

	public static void main(String[] args) {
		int[] a= {1,2,3,4};
		int [] b=multiply(a);
		for (int i : b) {
			System.out.println(i);
		}
	}

	public static int[] multiply(int[] A) {
		if(A==null||A.length==0) {
			return A;
		}
		int [] B=new int[A.length];
		for(int i=0;i<B.length;i++) {
			B[i]=mul(A,0,i-1)*mul(A,i+1,A.length-1);
		}
		return B;
	}

	private static int mul(int[] a, int i, int j) {
		int mult=1;
		for(int k=i;k<=j;k++) {
			mult=mult*a[k];
		}
		return mult;
	}
}
