package offer;

public class _43ReverseSentence {

	public static void main(String[] args) {
		String string=" ";
		System.out.println(ReverseSentence(string));
	}

	public static String ReverseSentence(String str) {
		if(str==null) {
			return str;
		}
		if(str.trim().equals("")) {
			return str;
		}
		String [] s=str.split(" ");
		String re="";
		for(int i=s.length-1;i>=0;i--) {
			re=re+" "+s[i];
		}
		return re.trim();
	}
}
