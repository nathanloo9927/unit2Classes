import java.util.Scanner;

public class Parsing
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter a number. Include the comma(s) if it is over 1,000: ");
        String number = s.next();
        
        number = number.replaceAll(",", "");
        
        System.out.println("The number without the comma is " + number);
    }
}