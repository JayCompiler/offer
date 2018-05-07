package offer;

public class _47Add {

	public static void main(String[] args) {
		
	}

	public static int Add(int num1, int num2) {
		while(num2!=0) {
			//异或相当于加法运算（没进位）
			int temp=num1^num2;
			//与以后左移一位相当于进位运算
			num2=(num2&num1)<<1;
			num1=temp;
		}
		return num1;
	}
}
