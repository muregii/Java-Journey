public static List<String>mergeSortList(List<String> list) {
if(list.size() <= 1) {
return list;
}
  int mid = list.size()/2;
  List<String> firstHalfSorted = mergeSortList(List.sublist(0,mid));
  List<String> secondHalfSorted = mergeSortList(list.sublist(mid, list.size()));
  return merge(firstHalfSorted, secondHalfSorted);
}

//Merge helper methods to create new lists needed.
