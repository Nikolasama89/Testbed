package gr.aueb.cf.ch14;

public class PointMain {

    public static void main(String[] args) {

//        Point point = new Point();
//        Point2D point2D = new Point2D();
//        Point3D point3D = new Point3D();

        Point p1 = new Point();
        Point p2 = new Point2D();
        Point p3 = new Point3D();

        p2.movePlusOne();
        p2.movePlusOne();

        p3.movePlus10();

        ((Point2D) p2).setY(15);

//        doMovePlus10(point);
//        doMovePlus10(point2D);
//        doMovePlus10(point3D);
    }


    public static void doMovePlus10(Point point) {
        point.movePlus10();
    }
}