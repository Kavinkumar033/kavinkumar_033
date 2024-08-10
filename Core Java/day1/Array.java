import java.util.*;
public class Array {
 public static void main(String[] args) {
   int i,sum=0;
   int arr[]=new int[5];
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter 5 Array Elements :");
   for(i=0;i<5;i++) {
    arr[i]=sc.nextInt();
    }
    System.out.println("Sum of Array Elements ");
    for(i=0;i<5;i++) {
     sum=sum+arr[i];
    }
    System.out.println(sum);
  }
}