package offer;

public class _48StrToInt {

	public static void main(String[] args) {
		String aString="+123";
		System.out.println(StrToInt(aString));
		System.out.println(Long.MIN_VALUE);
		System.out.println(Integer.MIN_VALUE);
		int a=-2147483647;
		System.out.println(a);
	}

	public static int StrToInt(String str) {
		if(str==null||str.length()==0) {
			return 0;
		}
		String str1=str;
		if(str.charAt(0)=='+') {
			str1=str.substring(1, str.length());
		}
		String pre="";
		if(str.charAt(0)=='-') {
			str1=str.substring(1, str.length());
			pre="-";
		}
		long res=0;
		if(str1.length()==0||str1==null) {
			return 0;
		}
		for(int i=0;i<str1.length();i++) {
			char temp=str1.charAt(i);
			if(temp<'0'||temp>'9') {
				res=0;
				break;
			}else {
				res+=(temp-'0')*Math.pow(10, str1.length()-i-1);
			}
		}
		if(pre=="-"&&res!=0) {
			return (int) -res;
		}else {
			return (int) res;
		}
	}
}
