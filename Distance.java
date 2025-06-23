/*

Ques: The program is supposed to calculate the sum of  distance between three points from each other.

For
x1 = 1 y1 = 1
x2 = 2 y2 = 4
x3 = 3 y3 = 6

Distance is calculated as : sqrt(x2-x1)2 + (y2-y1)2
 */


import java.util.Scanner;

public class Distance {

    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        double dx = x2 - x1;
        double dy = y2 - y1;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter coordinates for point 1 (x1 y1): ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        System.out.print("Enter coordinates for point 2 (x2 y2): ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        System.out.print("Enter coordinates for point 3 (x3 y3): ");
        double x3 = sc.nextDouble();
        double y3 = sc.nextDouble();

       
        double firstDiff = calculateDistance(x1, y1, x2, y2);
        double secondDiff = calculateDistance(x2, y2, x3, y3);
        double thirdDiff = calculateDistance(x1, y1, x3, y3);

        
        System.out.println("Distances:");
        System.out.printf("Between point 1 and point 2: %.2f\n", firstDiff);
        System.out.printf("Between point 2 and point 3: %.2f\n", secondDiff);
        System.out.printf("Between point 1 and point 3: %.2f\n", thirdDiff);
    }
}
