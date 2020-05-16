package Senfter.Working_with_Classes;

public class Circle {
    private double radius;
    public Circle(double radius){
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getCircumference(){
        return getRadius()*2*SomeMaths.pi();
    }

    public double getArea(){
        return SomeMaths.pi()*SomeMaths.getSquare(getRadius());
    }

    public void out(){
        System.out.println("Radius: "+getRadius());
        System.out.println("Circumference: "+getCircumference());
        System.out.println("Area: "+getArea());
        System.out.println();
    }


}
