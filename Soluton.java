class ListNode {
int val;
ListNode next;
ListNode(int x){
val= x;
}
} 
public class Solution {
public static ListNode removeNthFromEnd(ListNode l1, int n) {
if(l1==null) return null;
ListNode ln = l1;
int size = 0;    
while(ln!=null) {
size++;
ln = ln.next;
}
int count =0;
ListNode dummy = new ListNode(0);
dummy.next = l1;
ListNode current = dummy;
while(count<size-n) {
current=current.next;
count++;
}
if(current.next !=null){
current.next = current.next.next;
}
return dummy.next;
}
}
