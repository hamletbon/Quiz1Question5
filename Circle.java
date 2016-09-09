
public class Circle
{
   //fields
   private int radius;

   //constructors
   public Circle (int r)
   {
      this.radius = r; 
    }
    
   //methods
   public double getArea()
   {
       return Math.PI*radius*radius;
    }
}
