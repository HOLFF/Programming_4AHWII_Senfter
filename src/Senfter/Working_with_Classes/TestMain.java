package Senfter.Working_with_Classes;

public class TestMain {
    public static void main(String[] args)throws Exception{
        Circle c1=new Circle(3);
        Circle c2=new Circle(8);
        Circle c3=new Circle(5);

        System.out.println("Circle 1: ");
        c1.out();
        System.out.println("Circle 2: ");
        c2.out();
        System.out.println("Circle 3: ");
        c3.out();
    }
}
