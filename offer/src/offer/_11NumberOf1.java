package offer;

public class _11NumberOf1 {

	public static void main(String[] args) {
		NumberOf1(2);
	}
	 public static int NumberOf1(int n) {
		int num=0;
		int index=1;
		while(index!=0) {
			if((n&index)!=0)
				num++;
			index=index<<1;
		}
	    return num;
	 }
}
