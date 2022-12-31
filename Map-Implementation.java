String message = "Computer Science is so much fun";
char[] messageCharArray = message.toCharArray(); //Converts the message above to an array of characters.
Treemap<Character,Integer> charCounts = new TreeMap<>(); //We want to count how many times each character occurs.
  for (char c: messageCharArray) { //We are going to associate characters with Integer values. So we loop offer each character one at a time.
    if(!charCounts.containsKey(c)) { //Check if we have not seen (C) yet. If it's the first time we are seeing a certain character, 
    charCounts.put(c, 1);//We put that key value which the character in the value 1.
    }
    else {
    int currentVal = charCounts.get(c); //We get the current value,
    charCounts.put(c, currentVal +1);//We then put the old value by 1.
    } //Else we increment the count of how many times that character has occurred by 1.
  }
System.out.println(charCounts);
    //COunts the number of values in a given set of data and stores them in a map. / Counting the number of incidences of all the characters.
