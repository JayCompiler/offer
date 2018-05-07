package offer;



public class _33FirstNotRepeatingChar {

	public static void main(String[] args) {
		String string="googgle";
		System.out.println(FirstNotRepeatingChar(string));
	
	}
    public static  int FirstNotRepeatingChar(String str) {
    	if(str.length()==0||str==null) {
    		return -1;
    	}
    	int res=Integer.MAX_VALUE;
    	for(int i=0;i<str.length()-1;i++) {
    		char a=str.charAt(i);
    		String pre=str.substring(0,i);
    		String post=str.substring(i+1,str.length());
    		if((pre.indexOf(a)==-1)&&(post.indexOf(a)==-1)) {	
    			res=i;
    			break;
    		}else {
    			continue;
    		}
    	}
    	if(str.substring(0,str.length()-1).indexOf(str.charAt(str.length()-1))==-1) {
    		if(res>str.length()-1) {
    			res=str.length()-1;
    		}
    	}
    	return res;
    }
}
