import java.util.*;
import java.nio.file.*;
import java.io.*;
public class EmployeeHours {
    public static void main(String args []) throws FileNotFoundException {
        Path path = Paths.get("hours.txt");
        String FilePath = path.toString();
        File myFile = new File (FilePath);
        Scanner sc1 = new Scanner(myFile);
        int EmployeeNum = 0;
        double hour = 0;
        int x = 0;
        int y = 0;
        double dumb = 0;
        double[] hours = new double[200];
        while(sc1.hasNextLine()) {
            Arrays.fill(hours, 0);
            Scanner sc2 = new Scanner(sc1.nextLine());
            while (sc2.hasNext()) {
                if(sc2.hasNextInt()) {
                    EmployeeNum = sc2.nextInt();
                }
                String EmployeeName = sc2.next();
                while (sc2.hasNextDouble()) {
                    hours[x] = sc2.nextDouble();
                    x++;
                }
                y = 0;
                for (int i = 0; i < hours.length; i++) {
                    if (hours[i] > 0) {
                        y++;
                    }
                    hour += hours[i];
                }
                dumb = hour/y;
                System.out.printf("%s (ID#%d) worked %2.1f hours (%2.2f hours/day)%n", EmployeeName, EmployeeNum, hour, dumb);
                hour = 0;
            }
            sc2.close();
        }
        sc1.close();
    }
}
