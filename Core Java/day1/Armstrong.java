import java.util.*;

public class Armstrong {
    public static void main(String[] args) {
      int number,temp,sum=0,lastnumber;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter number to check Armstrong or Not :");
      number=sc.nextInt();
      temp=number;
      while(temp!=0) {
       lastnumber=temp%10;
       sum=sum+(lastnumber*lastnumber*lastnumber);
       temp=temp/10;
      }
     if(number == sum) {
       System.out.println(number+" is a Armstrong Number.");
      } else {
        System.out.println(number+" is not a Armstrong Number.");
      }
   }
}