package offer;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _51match {

	public static void main(String[] args) {

	}
	public boolean match(char[] str, char[] pattern)
    {
		String regex="";
		String s="";
        for(int i=0;i<pattern.length;i++) {
        	regex+=pattern[i];
        }
        for(int i=0;i<str.length;i++) {
        	s+=str[i];
        }
        //����������ʽ
        Pattern p=Pattern.compile(regex);
        Matcher matcher=p.matcher(s);
        return matcher.matches();
    }
}
