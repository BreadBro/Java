import java.util.*;
public class Pascal {
    public static void main(String [] args) {
        //asks for size
        Scanner sc = new Scanner(System.in);
        System.out.println("What would you like the size of Pascal's Triangle to be? You cannot go over 13.");
        int SIZE = sc.nextInt();
        //triangle breaks after 13 cause of printf so this makes sure it cant do that
        if (SIZE > 13) {
            SIZE = 13;
        }
        //main code
        Pascals(SIZE);

    }
    
    public static int Math(int x) {
        int y;
        //this loops multiplies the numbers until x <= 1 then returns the final answer of that
        for(y = 1; x > 1; x--) {
           y *= x;
        }
        return y;
    }

    public static void Pascals(int SIZE) {
        System.out.println();
        int line, space, number;
        //sets size one less than input so it is accurate
        SIZE -= 1;
        for (line = 0; line <= SIZE; line++) {
            //first spaces
            for (space = 0; space <= SIZE-line; space++) {
                System.out.printf("%2s", " ");
            }
            //spaces in between letters
            for (space = 0; space <= line; space++) {
                //equation to get the number
                number = Math(line) / (Math(line-space) * Math(space));
                System.out.printf("%4s", number);
            }
            System.out.println();
        }
    }
 }
