import java.awt.*;
import java.util.*;
public class Chapter8 {

    public static void main(String [] args) {
        E9();
    }

    public static Scanner sc = new Scanner(System.in);
    public static Random ran = new Random();
    public static void E9() {
        int x1, y1, x2, y2, x3, y3;
        
        System.out.println("What would you like your first point's coordinates to be?");
        System.out.print("X: ");
        x1 = sc.nextInt();
        if (x1 == 69) {
            y1 = ran.nextInt(100);
            x2 = ran.nextInt(100);
            y2 = ran.nextInt(100);
        }
        else {
            System.out.print("Y: ");
            y1 = sc.nextInt();
            System.out.println("What would you like your second point's coordinates to be?");
            System.out.print("X: ");
            x2 = sc.nextInt();
            System.out.print("Y: ");
            y2 = sc.nextInt();
        }

        Line line = new Line(new Point(x1, y1), new Point (x2, y2));
        System.out.println(line.toString());

        if (line.getSlope() != 999999) {
            System.out.printf("The slope is %.2f%n", line.getSlope());
        }
        else {
            System.out.println("The slope is undefined.");
        }

        System.out.println("What point would you like to check the collinearity of?");
        System.out.print("X: ");
        x3 = sc.nextInt();
        System.out.print("Y: ");
        y3 = sc.nextInt();

        if (line.isCollinear(new Point(x3, y3))) {
            System.out.println("The points are collinear.");
        }
        else {
            System.out.println("The points are not collinear.");
        }
    }
}
