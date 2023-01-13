ArrayList<Integer> intList = new ArrayList<>();
int[] intArray = { "2","1","4" };

//converting an int array to a list
for (int number: intArray) {
  intList.add(number);
}
//converting an Integer List to an int [] 
int[] newIntArray = new int[intList.size()]);
for(int i=0;i<intList.size;i++) {
newIntArray[i] = intList.get(i);
}
  
