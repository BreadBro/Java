import java.util.*;
public class Pascal {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What would you like the size of Pascal's Triangle to be? You cannot go over 13.");
        int SIZE = sc.nextInt();
        if (SIZE > 13) {
            SIZE = 13;
        }
        Pascals(SIZE);

    }
    
    public static int Math(int x) {
        int y;
 
        for(y = 1; x > 1; x--) {
           y *= x;
        }
        return y;
    }

    public static void Pascals(int SIZE) {
        System.out.println();
        int line, space, number;
        SIZE -= 1;

        for (line = 0; line <= SIZE; line++) {
            for (space = 0; space <= SIZE-line; space++) {
                System.out.printf("%2s", " ");
            }
            for (space = 0; space <= line; space++) {
                number = Math(line) / (Math(line-space) * Math(space));
                System.out.printf("%4s", number);
            }
            System.out.println();
        }
    }
 }