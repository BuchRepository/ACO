package ITEducation.homework_week2;

/**
 * Created by Администратор on 25.05.2015.
 */
public class TestShape {
    public static void main(String[] args) {
        Point point1=new Point(0,0);
        Point point2=new Point(0,4);
        Point point3=new Point(8,4);
        Point point4=new Point(8,0);
        Point[] points={point1,point2,point3,point4};

        Rectangle rectangle =new Rectangle(points);
        Circle circle=new Circle(points,points[0],5);
        Triangle triangle=new Triangle(points);

        System.out.println(rectangle);
        System.out.println(triangle);
        System.out.println(circle);

        rectangle.perimeter();//24
        triangle.perimeter();//20
        circle.perimeter();//31

        rectangle.square();//32
        triangle.square();//10
        circle.square();//78

        rectangle.show(rectangle);//polymorphism java
        rectangle.show(circle);//polymorphism java


   /*     System.out.println("Point2: "+point2);

        Point[] pointsTriangle={point1,point2,point3};
        Rectangle rectangle=new Rectangle();
        rectangle.setRectangleArray(points);
        rectangle.showRectangle();
        Circle circle=new Circle(point2, 5);
        System.out.println(circle);
        Triangle triangle=new Triangle();
        triangle.setTriangleArray(pointsTriangle);
        triangle.showTriangle();
        rectangle.perimetr();
        rectangle.square();
        circle.square();*/

    }
}
