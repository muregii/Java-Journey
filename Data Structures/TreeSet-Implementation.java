String message = "Raydon Muregi is a freshman at Duke";
char[] messageCharArray = message.toCharArray();
TreeSet<Character> uniqueChars = new TreeSet <>();
for( char c: messageCharArray) {
  uniqueChars.add(c):
}
System.out.println(uniqueChars);
