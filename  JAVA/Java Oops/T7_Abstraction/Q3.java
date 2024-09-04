package T7_Abstraction;

import T4_Constructor.constructor;

abstract class Shape{
    abstract public double calculateArea();
    abstract public double  calculatePerimeter();
}

class Circles extends Shape{

   public int radius;

   public Circles(int radius)
   {
    this.radius = radius;
   }

   public double calculateArea()
   {
         double res = Math.PI*radius*radius;
         return res;
   }

   public double calculatePerimeter()
   {
         double perimeter = 2*Math.PI*radius;
         return perimeter;
   }

   public void printinfo()
   {
    System.out.println("calculated area"+calculateArea()+"calculated perimert"+calculatePerimeter());
   }

}

class triangle extends Shape{

    int length;
    int breath;
    
    int side1;
    int side2;
    int side3;

    triangle(int length, int breath, int side1, int side2 , int side3)
    {
        this.length = length;
        this.breath = breath;
        this.side1=side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double calculateArea()
    {
        double area = (length*breath)/2;
        return area;
    }

    public double calculatePerimeter()
    {
        double perimert = side1+side2+side3;
        return perimert;
    }

    public void printinfotraingle()
    {
        System.out.println("traingle area"+calculateArea()+"traingle area"+calculatePerimeter());
    }
    
    
}


public class Q3 {
    public static void main(String[] args) {
       /*
         * Write a Java program to create an abstract class Shape with abstract methods
         * calculateArea() and calculatePerimeter().
         * Create subclasses Circle and Triangle that extend the Shape class and
         * implement the respective methods to calculate the
         * area and perimeter of each shape.
         */

         Circles ans = new Circles(23);
         ans.printinfo();
         triangle t1 = new triangle(12, 23, 56, 54, 12);
         t1.printinfotraingle();


    }
}
