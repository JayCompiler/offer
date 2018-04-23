package offer;

public class _15ReverseList {

	public static void main(String[] args) {
		ListNode node=new ListNode(10);
		node.next=new ListNode(4);
		node.next.next=new ListNode(5);
		ListNode aListNode=ReverseList(node);
		while(aListNode!=null) {
			System.out.println(aListNode.val);
			aListNode=aListNode.next;
		}
	}
	public static ListNode ReverseList(ListNode head) {
		if(head==null) {
			return null;
		}
		ListNode p=head;
		ListNode temp=head;
		head=head.next;
		temp.next=null;
		while(head!=null) {
			temp=head;
			head=head.next;
			temp.next=p;
			p=temp;
		}
		return p;
    }
}
