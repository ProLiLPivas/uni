package uni_java_2;

public class Point3d {

    private double x;
    private double y;
    private double z;

    public Point3d(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Point3d(){
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    // getters
    public double getX(){
       return this.x;
    }
    public double getY(){
        return this.y;
    }
    public double getZ(){
        return this.z;
    }

    //setters
    public void setX(double cord){
        this.x = cord;
    }
    public void setY(double cord){
        this.y = cord;
    }
    public void setZ(double cord){
        this.z = cord;
    }

    public static boolean isSamePoints(Point3d cord1, Point3d cord2 ){
        double[] cord_list1 = new double[]{cord1.getX(), cord1.getY(), cord1.getZ()};
        double[] cord_list2 = new double[]{cord2.getX(), cord2.getY(), cord2.getZ()} ;

        if(cord_list1[0] == cord_list2[0] && cord_list1[1] == cord_list2[1] && cord_list1[2] == cord_list2[2]){
            return true;
        }
        else{return false;}
    }

    public static double distanceTo(Point3d cord1, Point3d cord2 ){
        if(Point3d.isSamePoints(cord1,cord2) != true) {
            double[] cord_list1 = new double[]{cord1.getX(), cord1.getY(), cord1.getZ()};
            double[] cord_list2 = new double[]{cord2.getX(), cord2.getY(), cord2.getZ()};

            double distance = Math.sqrt(
                    Math.pow((cord_list1[0] - cord_list2[0]), 2) +
                            Math.pow((cord_list1[1] - cord_list2[1]), 2) +
                            Math.pow((cord_list1[2] - cord_list2[2]), 2)
            );

            return distance;
        }
        else{
            System.out.println("points r same ");
            return 0;
        }
    }
}
