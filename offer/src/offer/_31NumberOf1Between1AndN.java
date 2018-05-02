package offer;

public class _31NumberOf1Between1AndN {

	public static void main(String[] args) {
		System.out.println(NumberOf1Between1AndN_Solution(13));
	}
    public static int NumberOf1Between1AndN_Solution(int n) {
    	int count=0;
        for(int i=1;i<=n;i++) {
        	String string=String.valueOf(i);
        	char[] ch=string.toCharArray();
        	for(int j=0;j<ch.length;j++) {
        		if(ch[j]=='1') {
        			count++;
        		}
        	}
        }
        return count;
    }
}
