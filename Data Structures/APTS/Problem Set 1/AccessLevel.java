//check the video explanation of this code @ https://youtu.be/nrqbzubJJG4
public class AccessLevel {
  public String canAccess(int[] rights, int minPermission) {
  
    String s="";
    for(int i: rights) {
      if(i >= minPermission) {
      s = s + 'A';
      }
      else if(i < minPermission){
      s = s + 'D';
      }
      
    }
    return s;
     
  }
}
