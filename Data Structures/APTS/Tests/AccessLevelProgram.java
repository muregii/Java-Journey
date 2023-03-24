import java.util.Scanner;

public class AccessLevel {
  public static void main(String[] args) {
    Scanner reader = new Scanner (System.in);
    System.out.println("Enter the total number of users: ");
    int num = reader.nextInt();
    
    int[] rights = new int [num];
    System.out.println("Enter their permission numbers: ");
    for(int i =0;i<num;i++) {
      rights[i] = reader.nextInt();
    }
    System.out.print("Enter minimum permission number: ");
    int minPermission = reader.nextInt();
    
    String s="";
    for(int i=0;i<num;i++) {
      if(rights[i]>minPermission) {
      s = s + 'A';
      }
      else{
      s = s + 'D';
      }
    }
    System.out.println("Returns:" +s);
     
  }
}
