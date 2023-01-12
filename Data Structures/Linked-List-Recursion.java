/*copying via recursion

public ListNode copyRec(ListNode list) {
if(list == null) return null;
return new ListNode(list.info, copyRec(list.next);
}
*/
public ListNode copy(ListNode list) {
if(list == null) return null;
  ListNode first = new ListNode(list.info, null);
  list = list.next;
  ListNode Last = first;
  while(list!=null){
  last.next = new ListNode(list.info);
    last = last.next;
    list = list.next;
  }
  return first;
}
