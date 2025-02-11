class ListNode {
int val;
ListNode next;
ListNode(int x){
val = x;
}
}

public class Practice1 {
public static ListNode remove(ListNode l1, int n){
int size =0;
ListNode current = l1;
while(l1!=null){
size++;
l1 = l1.next;
}
int num = size - n -1;
if(num==size){
return current.next;
}

int i=0;
while(current!=null) {
if(i == num){
current.next = current.next.next;
break;
}
i++;
current = current.next;
}
return current;
}
}
