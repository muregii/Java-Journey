/*In many computer systems and networks, different users are granted different levels of access to different resources.
In this case, you are given a int[] rights, indicating the privilege level of each user to use some system resource.
You are also given a int minPermission, which is the minimum permission a user must have to use this resource.
You are to return a String indicating which users can and cannot access this resource. Each character in the return value 
corresponds to the element of users with the same index. 
'A' indicates the user is allowed access, while 'D' indicates the user is denied access.
*/


import java.util.Scanner;

public class AccessLevel {
  public static void main(String[] args) {
    Scanner reader = new (System.in);
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
      if(right[i]>minPermission) {
      s = s + 'A';
      }
      else{
      s = s + 'D';
      }
    }
    System.out.println("Returns: %s", s);
     
  }
}
