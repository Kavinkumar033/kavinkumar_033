import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        int option;
        Scanner sc = new Scanner(System.in);
        System.out.println("Palindrome Option");
        System.out.println("Press 1 for Number Palindrome");
        System.out.println("Press 2 for String Palindrome");
        System.out.println("Enter your Option Number");
        option = sc.nextInt();
        sc.nextLine();  

        switch (option) {
            case 1:
                numberfunc(sc);
                break;
            case 2:
                stringfunc(sc);
                break;
            default:
                System.out.println("Invalid option");
                break;
        }
    }

    public static void numberfunc(Scanner sc) {
        int number, temp, lastnumber, reversenumber = 0;
        System.out.println("Enter number: ");
        number = sc.nextInt();
        temp = number;
        while (temp != 0) {
            lastnumber = temp % 10;
            reversenumber = (reversenumber * 10) + lastnumber;
            temp = temp / 10;
        }
        if (reversenumber == number) {
            System.out.println("It is a Palindrome");
        } else {
            System.out.println("It is not a Palindrome");
        }
    }

    public static void stringfunc(Scanner sc) {
        String str, str2 = "";
        char ch;
        System.out.println("Enter String: ");
        str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);  
            str2 = ch + str2;
        }
        if (str.equals(str2)) {
            System.out.println("It is a Palindrome");
        } else {
            System.out.println("It is not a Palindrome");
        }
    }
}
