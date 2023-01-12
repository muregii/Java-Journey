public Node reverse(Node list) {
if(list == null || list.next == null){
return list;
}
  Node afterMe = reverse(list.next); // list refers to A node. list.next refers to the B node
  list.next.next = list;//makes B point to A instead of null.
  list.next = null; // to avoid an infinite circular loop, this tells the program that the next node should be null.
  return afterMe;
}
