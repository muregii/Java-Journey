class Solution {
public boolean isIsomorphic (String s, String t) {
List<String> soFar = new ArrayList<>(); /*A way to keep track or store already mapped characters as we loop the characters in s and t.*/
  for(int i=0;i<s.length();i++) {/*loop over all the character's indexes*/
    char sChar = s.charAt(i);/*get the character at that given position for both strings*/
    char tChar = t.charAt(i);
  
  if( isOk(soFar, sChar, tChar)) { /*Is it OK to map the s character to the t character?*/
  soFar.add(new String (new char[] {sChar, tChar } )); /*If not, add the s character to the t character.*/
  }
  else { return false; }
}
  return true; /*If I can create a map of all characters in the string, the return true.*/
}


//HELPER METHOD
public boolean isOk(List<String>soFar, char c1, char c2) {
  for(String s: soFar) {
    if((s.charAt(0) == c1) && (s.charAt(1) !=c2))  {
      return false;
    }
     if((s.charAt(1) == c2) && (s.charAt(0) !=c1)) {
     return false;
     }
  }
        return true;
  
    }
}

