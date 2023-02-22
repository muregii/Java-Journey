//Recursive solution

public Node reverse(Node list) {
if(list == null || list.next == null){
return list;
}
  Node afterMe = reverse(list.next); // list refers to A node. list.next refers to the B node
  list.next.next = list;//makes B point to A instead of null.
  list.next = null; // to avoid an infinite circular loop, this tells the program that the next node should be null.
  return afterMe;
}

/*Iterative solution.

==>Use an invariant(is some property that is true each loop guard check, it may become false part way throught the loop but it's always re-established before guard check). After k iterations, rev points to the reverse of the first k nodes...
...before loop iterates at all? rev = null;
Then at the end we return rev.
After iteration 1, rev is reveres of the first elements. List has moved to represent [B, C]. So rev represents A.

How to move B to the front. 
==> Save a temporary reference to the C node(List.next.
==> Make B point to A. (list.next = rev)
==> Update . Now rev points to B (rev = list)
==> List now points to C ( list = temp)
*/

//please check pictorial reasoning : https://drive.google.com/file/d/1KEStG9gdrVUxZGLqKG2ek3T7LuWwaw31/view?usp=sharing
public ListNode reverse (ListNode front) {
ListNode rev = null;
ListNode list = front;
while (list != null) {
  ListNode temp = list.next;
  list.next = rev;
  rev = list;
  list = temp;
  }
return rev;
}






