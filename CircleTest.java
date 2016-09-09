import java.util.Scanner;

public class CircleTest
{
    public static void main(String[] args)
    {
        Scanner fork = new Scanner(System.in);
        System.out.println("Enter the radius of the mooncake: ");
        int foo = fork.nextInt();
        
        Circle mooncake = new Circle(foo); //creating a mooncake based on the Circle class
        System.out.println(mooncake.getArea()); //call the method "getArea()" of the mooncake
        
        System.out.println("Enter the radius of the potato: ");
        foo = fork.nextInt();        
        Circle potato = new Circle(foo); //creating a potato based on the Circle class
        System.out.println(potato.getArea()); //call the method "getArea()" of the potato
        
    }
}
