package offer;

public class _47Add {

	public static void main(String[] args) {
		
	}

	public static int Add(int num1, int num2) {
		while(num2!=0) {
			//����൱�ڼӷ����㣨û��λ��
			int temp=num1^num2;
			//���Ժ�����һλ�൱�ڽ�λ����
			num2=(num2&num1)<<1;
			num1=temp;
		}
		return num1;
	}
}
