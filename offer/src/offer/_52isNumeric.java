package offer;

public class _52isNumeric {

	public static void main(String[] args) {

	}

	public boolean isNumeric(char[] str) {
		int dotindex=-1;
		int eindex=-1;
		boolean flag=true;
		for(int i=0;i<str.length;i++) {
			//�ж�.�ĸ�������ͳ�Ƴ�λ��
			if(str[i]=='.') {
				if(dotindex!=-1) {
					flag=false;
					break;
				}else {
					dotindex=i;
				}
			}
			//�ж������ŵ�λ���Ƿ����
			if(str[i]=='+'||str[i]=='-') {
				if(i!=0) {
					flag=false;
					break;
				}
			}
			if(str[i]=='e'||str[i]=='E') {
				if(eindex!=-1) {
					flag=false;
					break;
				}else {
					eindex=i;
				}
			}
		}
		
		return false;
	}
}
