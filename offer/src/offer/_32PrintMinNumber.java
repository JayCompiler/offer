package offer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class _32PrintMinNumber {

	public static void main(String[] args) {
		//int[] n= {3,32,321};
		//int [] n= {3,5,1,4,2};
		int [] n= {3,31};
		System.out.println(PrintMinNumber(n)+" ");
	}

	public static String PrintMinNumber(int[] numbers) {
		String string="";
		List<Integer> list=new ArrayList<>();
		for(int i=0;i<numbers.length;i++) {
			list.add(numbers[i]);
		}
		Collections.sort(list, new Comparator<Integer>() {
			@Override
			public int compare(Integer arg0, Integer arg1) {
				String aString=String.valueOf(arg0);
				String bString=String.valueOf(arg1);
				String s1=aString+bString;
				String s2=bString+aString;
				return s1.compareTo(s2);
//				if((aString.compareTo(bString)>0)&&(aString.length()<=bString.length())) {
//					return 1;
//				}else {
//					return -1;
//				}
			}	
		});
		for(int i=0;i<list.size();i++) {
			string+=list.get(i)+"";
		}
		return string;
	}
}
