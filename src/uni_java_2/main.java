package uni_java_2;

public class main {
    public static void main(String[] args) {
        Point3d point1 = new Point3d(1,1,1);
        Point3d point_zero = new Point3d();

        double[] cord_list1 = new double[]{point1.getX(), point1.getY(), point1.getZ()};
        double[] cord_list2 = new double[]{point_zero.getX(), point_zero.getY(), point_zero.getZ()} ;




        System.out.println(Point3d.isSamePoints(cord_list1, cord_list2));


    }
}
