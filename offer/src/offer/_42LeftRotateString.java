package offer;

public class _42LeftRotateString {

	public static void main(String[] args) {
		String string="abcdefg";
		string=LeftRotateString(string, 6);
		System.out.println(string);
	}

	public static String LeftRotateString(String str, int n) {
		if(str==null) {
			return null;
		}
		if(str.length()==0) {
			return str;
		}
		String pre=str.substring(0, n);
		//Ê£ÓàÒ»¶Î
		if(str.length()-n>n) {
			String po =str.substring(str.length()-n,str.length());
			String in=str.substring(n,str.length()-n);
			str=in+po+pre;
		}else {
			String po=str.substring(n,str.length());
			str=po+pre;
		}
		return str;
	}
}
