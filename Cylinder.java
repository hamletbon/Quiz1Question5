public class Cylinder
{
    //fields
    private Circle base;
    private double height;
    
    //constructors
    public Cylinder(int r, int h){
        this.base = new Circle(r);
        this.height = h;
    }

    //methods
    public double getVolume(){
        return this.base.getArea()*this.height;
    }
}
