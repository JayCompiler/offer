package offer;

public class _2Replace {

	public static void main(String[] args) {
		StringBuffer str=new StringBuffer();
		str.append("We Are Happy");
		String result=replaceSpace(str);
		System.out.println(result);
	}
    public static String replaceSpace(StringBuffer str) {
    	String tp=str.toString();
    	tp=tp.replaceAll(" ", "\\%20");
    	return tp;
    }

}
