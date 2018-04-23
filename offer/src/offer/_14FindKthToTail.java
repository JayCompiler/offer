package offer;

public class _14FindKthToTail {

	public static void main(String[] args) {

	}
	public ListNode FindKthToTail(ListNode head,int k) {
		int count=0;
		ListNode p=head;
		while(p!=null) {
			count++;
			p=p.next;
		}
		if(count<k) {
			return null;
		}
		count=count-k;
		while(count!=0) {
			head=head.next;
			--count;
		}
		return head;
    }
}
