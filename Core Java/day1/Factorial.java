import java.util.*;
public class Factorial {
 public static void main(String args[]) {
    int number,fact=1;
    Scanner sc = new Scanner(System.in);
    System.out.println("EnterFactorial number");
    number=sc.nextInt();
    for(int i=1;i<=number;i++) {
     fact=fact*i;
     }
     System.out.println("Factorail of "+number+" is "+fact);
    }
}    