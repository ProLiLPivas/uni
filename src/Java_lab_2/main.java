package uni_java_2;

public class main {
    public static void main(String[] args) {
        Point3d point1 = new Point3d(1,1,1);
        Point3d point_zero = new Point3d();

        boolean is_same = Point3d.isSamePoints(point1,point_zero);
        double distance = Point3d.distanceTo(point1, point_zero);


        System.out.println(distance);



    }
}
