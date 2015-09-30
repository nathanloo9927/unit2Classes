import java.util.Scanner;

public class PhoneNumber
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter your phone #: ");
        String phone = s.next();
        
        String area = phone.substring(0,3);
        String s1 = phone.substring(3,6);
        String s2 = phone.substring(6,10);
        
        System.out.println("Your phone number with parentheses and dashes is (" + area + ") - " + s1 + " - " + s2);
    }
}