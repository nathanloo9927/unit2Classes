import java.util.Scanner;

public class Change
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        
        System.out.print("How much did you owe?: ");
        double due = s.nextDouble();
        
        System.out.print("How much did you pay?: ");
        double receive = s.nextDouble();
        
        double change = receive - due;
        System.out.println("Your change is " + change);
        
        double dollar = change / 1;
        int dollars = (int) dollar;
        change = change - dollars;
        
        double quarter = change / .25;
        int quarters = (int) quarter;
        change = change - (quarters / 4);
        
        double dime = change / .1;
        int dimes = (int) dime;
        change = change - (dimes / 10);
        
        double nickel = change / .05;
        int nickels = (int) nickel;
        change = change - (nickels / 20);
        
        double pennies = change * 100;
        
System.out.print("You get " + dollars + " dollar(s), " + quarters + " quarter(s), " + dimes + " dime(s), " + nickels + " nickel(s), and " + pennies + "penny(ies)");
    }
}