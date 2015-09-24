public class DistanceConverter
{
   private static final double yards = 3.5;
   private static final double feet = yards * 3;
   private static final double inches = feet * 12;
   public static void main(String[] args)
   {
      System.out.println(yards + " yards are " + feet + " feet");
      System.out.println(yards + " yards are " + inches + " inches");
   }
}