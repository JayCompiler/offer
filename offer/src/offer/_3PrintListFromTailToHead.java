package offer;

import java.util.ArrayList;
import java.util.Stack;

public class _3PrintListFromTailToHead {

	public static void main(String[] args) {
		ListNode listNode=new ListNode(2);
		listNode.next=new ListNode(4);
		listNode.next.next=new ListNode(3);
		listNode.next.next.next=null;
		ArrayList<Integer> arrayList=printListFromTailToHead(listNode);
		for (Integer integer : arrayList) {
			System.out.println(integer);
		}
	}

	public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
		ArrayList<Integer> arrayList=new ArrayList<>();
		Stack<Integer> stack=new Stack<>();
		while(listNode!=null) {
			stack.push(listNode.val);
			listNode=listNode.next;
		}
		while(!stack.isEmpty()) {
			arrayList.add(stack.pop());
		}
		return arrayList;
	}
}
