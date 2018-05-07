package offer;

import java.util.ArrayList;
import java.util.HashMap;

public class _53FirstAppearingOnce {
	public static void main(String[] args) {

	}
	ArrayList<Character> list =new ArrayList<>();
	HashMap<Character, Integer> map=new HashMap<>();
	public void Insert(char ch) {
		list.add(ch);
		if(map.get(ch)!=null) {
			map.put(ch, map.get(ch)+1);
		}else {
			map.put(ch, 1);
		}
	}

	public char FirstAppearingOnce() {
		char res='#';
		for(int i=0;i<list.size();i++) {
			if(map.get(list.get(i))==1) {
				res=list.get(i);
				break;
			}
		}
		return res;
	}
}
