package ITEducation.homework_week2;

/**
 * Created by Администратор on 25.05.2015.
 */
public abstract class Shape {
    protected Point[]points;

    public Shape(Point[] points) {
        this.points = points;
    }

    public Point[] getPoints() {
        return points;
    }

    public void setPoints(Point[] points) {
        this.points = points;
    }


/* public void perimetr (Figure figure){
        int perimetr=0;
        System.out.println(figure.getPoints().;
        System.out.println(figure.getPoints()[0].getX());
        int dlina=(figure.getPoints()[3].getX()-figure.getPoints()[0].getX());
        int shirina=(figure.getPoints()[1].getY()-figure.getPoints()[0].getY());
        perimetr=(dlina+shirina)*2;
        System.out.println("Perimetr "+figure.getClass()+": "+perimetr);
    }*/


}
