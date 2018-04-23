package offer;

public class _16Merge {

	public static void main(String[] args) {

	}

	public ListNode Merge(ListNode list1, ListNode list2) {
		ListNode reS=new ListNode(0);
		ListNode re=reS;
		while(list1!=null&&list2!=null) {
			if(list1.val>=list2.val) {
				reS.next=new ListNode(list2.val);
				reS=reS.next;
				list2=list2.next;
			}else {
				reS.next=new ListNode(list1.val);
				reS=reS.next;
				list1=list1.next;
			}
		}
		while(list1!=null) {
			reS.next=new ListNode(list1.val);
			reS=reS.next;
			list1=list1.next;
		}
		while(list2!=null) {
			reS.next=new ListNode(list2.val);
			reS=reS.next;
			list2=list2.next;
		}
		return re.next;
	}
}
