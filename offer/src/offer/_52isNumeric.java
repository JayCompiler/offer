package offer;

public class _52isNumeric {

	public static void main(String[] args) {

	}

	public boolean isNumeric(char[] str) {
		int dotindex=-1;
		int eindex=-1;
		boolean flag=true;
		for(int i=0;i<str.length;i++) {
			//判断.的个数，并统计出位置
			if(str[i]=='.') {
				if(dotindex!=-1) {
					flag=false;
					break;
				}else {
					dotindex=i;
				}
			}
			//判断正负号的位置是否合理
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
