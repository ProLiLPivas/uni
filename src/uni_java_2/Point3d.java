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

    public static boolean isSamePoints(double[] cord1, double[] cord2 ){
        if(cord1[0] == cord2[0] && cord1[1] == cord2[1] && cord1[2] == cord2[2]){
            return true;
        }
        else{return false;}
    }

    public static double distanceTo(double[] cord1, double[] cord2 ){
        double distance = Math.sqrt(Math.pow((cord1[0] - cord2[0]), 2) + Math.pow((cord1[1] - cord2[1]), 2) + Math.pow((cord1[2] - cord2[2]), 2));
        return distance;
    }
}
