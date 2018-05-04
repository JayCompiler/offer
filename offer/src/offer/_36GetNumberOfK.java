package offer;

public class _36GetNumberOfK {

	public static void main(String[] args) {
		int [] array= {3};
		System.out.println(GetNumberOfK(array, 3));
	}

	public static int GetNumberOfK(int[] array, int k) {
		if(array.length==0||array==null) {
			return 0;
		}
		int count =-1;
		int res=0;
		int i=0;
		for(i=0;i<array.length;i++) {
			if(array[i]==k) {
				count=i;
				break;
			}
		}
		if(count==-1) {
			return 0;
		}
		for(int j=count;j<array.length;j++) {
			if(array[j]!=k) {
				break;
			}else {
				res++;
			}
		}
		return res;
	}
}
