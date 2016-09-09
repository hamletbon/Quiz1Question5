import java.util.Scanner;

public class CylinderTest
{
    public static void main(String[] args)
    {
        Scanner fork = new Scanner(System.in);
 
        System.out.println("Enter the radius of the mooncake: ");
        int r = fork.nextInt();
        System.out.println("Enter the height of the mooncake: ");
        int h = fork.nextInt();
        
        Cylinder mooncake = new Cylinder(r, h);
        System.out.println("Volume of the mooncake: "+mooncake.getVolume());
    }
}
