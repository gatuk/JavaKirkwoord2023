public class AssignmentPart2 {
    public static void main(String[] args) {

        System.out.println(circumference(4));
        System.out.println(Area(4));
        System.out.println(circumference(-1));

    }

    public static double circumference(double radius) {
        if(radius <=0){
            throw new IllegalArgumentException("Invalid radius");
        }
        return 2*Math.PI * radius;
    }
    public static double Area(double radius) {
        if(radius <= 0) {
            throw new IllegalArgumentException("Invalid radius");
        }
        return Math.PI * Math.pow(radius, 2);
    }
}