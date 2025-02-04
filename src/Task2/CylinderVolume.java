package Task2;

public class CylinderVolume {
    public static double cylinderVolume(double radius, double height) {
        return Math.PI * radius * radius * height;
    }

    public static void main(String[] args) {
        double radius = 3;
        double height = 9;

        double volume = cylinderVolume(radius, height);
        System.out.println("radius = "+ radius);
        System.out.println("height = "+ height);
        System.out.println("V = "+ volume);
    }
}
