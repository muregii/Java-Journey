public static List<String>mergeSortList(List<String> list) {
if(list.size() <= 1) {
return list;
}
  int mid = list.size()/2;
  List<String> firstHalfSorted = mergeSortList(List.sublist(0,mid));
  List<String> secondHalfSorted = mergeSortList(list.sublist(mid, list.size()));
  return merge(firstHalfSorted, secondHalfSorted);
}

//Merge helper methods to create new lists needed. Not recursive.
public static List<String> merge(List<String> listA, List<String> list B) {
List<String> merged = new ArrayList<>();
  int indexA = 0;
  int indexB = 0;
  while(indexA < listA.size() && indexB < listB.size()) {
  if(listA.get(indexA).compareTo(listB.get(indexB) <= 0) {
  merged.add(listA.get(indexA));
    indexA++;
  }
     else{
     merged.add(listB.get(indexB));
       indexB++;
     }
  }

}
//RECURSION TREE FOR A MERGESORT.
//T(N) = N + T(N/2) + T(N/2)
