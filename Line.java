import java.util.*;
import java.awt.Point;
public class Line {
    //variables
    private Point pt1;
    private Point pt2;
    String point1 = "";
    String point2 = "";
    double x1, y1, x2, y2, x3, y3;
    int temp;

    //constructors
    public Line(Point p1, Point p2) {
        pt1 =  p1;
        pt2 = p2;
    }
    public Line(int x1, int y1, int x2, int y2) {
        pt1 = new Point(x1, y1);
        pt2 = new Point(x2, y2);
    }

    //useful stuff
    public Point getP1() {
        return pt1;
    }

    public Point getP2() {
        return pt2;
    }
    
    public String toString() {
        point1 = pt1.toString();
        point2 = pt2.toString();
        point1 = point1.replace("java.awt.Point[x=", "");
        point1 = point1.replace("y=", " ");
        point1 = point1.replace("]", "");
        point2 = point2.replace("java.awt.Point[x=", "");
        point2 = point2.replace("y=", " ");
        point2 = point2.replace("]", "");
        return ("[(" + point1 + "), (" + point2 + ")]");
    }
    
    public double getSlope() {
        x1 = pt1.getX();
        y1 = pt1.getY();
        x2 = pt2.getX();
        y2 = pt2.getY();
        try {
            return (y2 - y1) / (x2 - x1);
        }
        catch(Exception E) {
            return 999999;
        }
    }

    public boolean isCollinear(Point p) {
        //check slope of one of the points with a third point
        //if slope of first 2 is equal to slope of first and new point, true
        x1 = pt1.getX();
        y1 = pt1.getY();
        x2 = pt2.getX();
        y2 = pt2.getY();
        x3 = p.getX();
        y3 = p.getY();

        temp = (int)((y2 - y1) / (x2 - x1) * 10000);
        double slope1 = temp / 10000.00;
        temp = (int)((y3 - y1) / (x3 - x1) * 10000);
        double slope2 = temp / 10000.00;

        if (slope1 == slope2) {
            return true;
        }

        else {
            return false;
        }

    }
}