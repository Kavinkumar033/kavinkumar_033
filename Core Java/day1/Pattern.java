import java.util.*;

public class Pattern{
    public static void main(String[] args) {
       int number;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter row size : ");
       number=sc.nextInt();
       for(int i=1;i<=number;i++) {
         for(int j=1;j<=i;j++) {
           System.out.print(" * ");
           }
         System.out.println();
       }
    }
 }