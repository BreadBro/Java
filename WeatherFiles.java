import java.util.*;
import java.io.*;
import java.nio.file.*;
public class WeatherFiles {
    public static void main(String [] args) throws FileNotFoundException {
        Path path = Paths.get("weather.txt");
        String FilePath = path.toString();
        File MyFile = new File(FilePath);
        Scanner sc = new Scanner(MyFile);
        double temp1 = 0;
        double temp2 = 0;
        double change = 0;
        if(sc.hasNextDouble()) {
            temp1 = sc.nextDouble();
        }
        while(sc.hasNext()) {
            if (sc.hasNextDouble()) {
                temp2 = sc.nextDouble();
                change = temp2 - temp1;
                System.out.printf("%-4.1f to %-4.1f, change = %-4.1f%n", temp1, temp2, change);
                temp1 = temp2;
            }
            else {
                sc.next();
            }
        }
        sc.close();
    }

}