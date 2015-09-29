import java.util.Scanner;

public class Rectangle
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Length?: ");
        double length = s.nextDouble();
        
        System.out.print("Width?: ");
        double width = s.nextDouble();
        
        double perimeter = (2*length)+(2*width);
        double area = length*width;
        
        System.out.println("The area is " + area + ". The perimeter is " + perimeter);
        
        double diagonal = Math.sqrt(Math.pow(length, 2)+Math.pow(width, 2));
        
        System.out.printf("The length of the diagonal is %.4f", diagonal);
    }
}