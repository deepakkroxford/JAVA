
class Cylinder{
    private float radius;
    private float height;

    public Cylinder(int radius,int height)
    {
        this.height=height;
        this.radius=radius;
    }
    public float getRadius()//it return value so we use float 
    {
        return radius;
    }
    public void setRadius(int r)//it not return any value it only set the value
    {
        radius=r;
    }
    public float getHeight()//it return value so we use float 
    {
        return height;
    }
    public void setHeight(int h)//it not return any value it only set the value
    {
        height=h;
    }
    public double surfaceArea()
    {
        return 2* Math.PI* radius * radius + 2*Math.PI*radius*height;
    }
    public double volume()
    {
        return Math.PI* radius * radius*height;
    }
}
class Rectangle{
    private float length;
    private float breadth;

    public Rectangle() //constructer
    {
        this.length = 4;
        this.breadth = 5;
    }

    public Rectangle(float length, float breadth)//constructer overloading
     {
        this.length = length;
        this.breadth = breadth;
    }

    public float getLength() {
        return length;
    }

    public float getBreadth() {
        return breadth;
    }

    public float area()
    {
        return length*breadth;
    }
    public float perimeter()
    {
        return 2*(length+breadth);
    }
}
class Sphere{
    private int radius;

    public Sphere (int radius)// using constructer
    {
        this.radius=radius;
    }
    public int getRadius()
    {
        return radius;
    }
    public void setRadius(int r)
    {
        radius=r;
    }
    public double surfaceArea()
    {
        return 4*Math.PI*radius*radius;
    }
    public double volume()
    {
        return 4/3 *Math.PI*radius*radius;
    }
}


public class ch_9_practiceSet{
    public static void main(String[] args) {
        //Cylinder obj = new Cylinder();

    //     obj.setHeight(12);
    //     obj.setRadius(9);
    //     System.out.println("the height of cylinder is -->"+obj.getHeight());
    //     System.out.println("the radius of cylinder is -->"+obj.getRadius());
    //     System.out.println("the surface area of cylinder is -->"+obj.surfaceArea());
    //     System.out.println("the volume of cylinder is -->"+obj.volume());
    // 

    Cylinder obj = new Cylinder(9, 12);
    System.out.println(obj.getHeight());
    System.out.println(obj.getRadius());
    System.out.println(obj.surfaceArea());
    System.out.println(obj.volume());

    //Rectangle sc = new Rectangle(12.78f,15);// this is using constructer
        Rectangle sc = new Rectangle();
        System.out.println("the length of rectangle is "+sc.getLength());
        System.out.println("the breath of rectangle is "+sc.getBreadth());
        System.out.println("the area of rectangle is   "+sc.area());
        System.out.println("the perimeter of rectangle is "+sc.perimeter());

       // Sphere gc = new Sphere();
       Sphere gc = new Sphere(6);
        //gc.setRadius(6);
        System.out.println(gc.getRadius());
        System.out.println(gc.surfaceArea());
        System.out.println(gc.volume());


}
}