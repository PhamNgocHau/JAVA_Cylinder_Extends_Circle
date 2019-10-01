public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(5.0 , "Blue");
        System.out.println(circle +"\n");

        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);
        cylinder = new Cylinder(100 , 3.5 ,"Red");
        System.out.println(cylinder);
    }
}
