import java.util.*;
public class ConditionalBranchingAndLooping {
    public static void main(String [] args) {
        System.out.println("\033[0;1m" + "\u001b[31m");
        E10();
        E12();
        E14();
        E16();
    }
    
    public static void E10() {
        System.out.println("What size would you like the hopscotch game to be?");
        Scanner reee = new Scanner(System.in);
        int HOPS = reee.nextInt();
        System.out.println();
        Hopscotch(HOPS);
    }

    public static void Hopscotch(int HOPS) {
        int current = 1;
        int total = 3 * HOPS + 1;
        while(current < total) {
            if((current - 1) % 3 == 0) {
                System.out.println("   " + current);
                current++;
            } 
            else {
                System.out.println(current + "     " + (current + 1));
                current += 2;
            }
        }
        System.out.println("   " + current);
    }

    public static void E12() {
        Scanner reee = new Scanner(System.in);
        PrintAverage(reee);
    }

    public static void PrintAverage(Scanner console) {
        System.out.println("Type a number.");
        int num = console.nextInt();
        if(num < 0)
            return;
        int sum = 0;
        int count = 0;
        while(num >= 0) {
            sum += num;
            count++;
            System.out.print("Type a number: ");
            num = console.nextInt();
        }
        System.out.println("Average was " + ((double) sum / count));
    }
    
    public static void E14() {
        System.out.println("Type any word.");
        Scanner reee = new Scanner(System.in);
        String aaa = reee.nextLine();
        String WeirdString = SwapPairs(aaa);
        System.out.println(WeirdString);
    }

    public static String SwapPairs(String x) {
        String y = "";
        for (int i = 0; i < x.length() / 2; i++) {
            y += x.charAt(2 * i + 1);
            y += x.charAt(2 * i);
        }
        if (x.length() % 2 != 0) {
            y += x.charAt(x.length() - 1);
        }
        return y;
    }

    public static void E16() {
        Scanner reee = new Scanner(System.in);
        System.out.println("Enter the X coordinate.");
        int x = reee.nextInt();
        System.out.println("Enter the Y coordinate.");
        int y = reee.nextInt();
        int quad = Quadrant(x, y);
        if (quad == 0) {
            System.out.println("Your coordinates are not in any quadrant.");
        }
        else {
            System.out.printf("Your coordinates are in quadrant %d%n", quad);
        }
    }

    public static int Quadrant(int x, int y) {
        int quad = 0;
        if (x > 0) {
            if (y > 0) {
                quad = 1;
            }
            if (y < 0) {
                quad = 4;
            }
        }

        else if (x < 0) {
            if (y > 0) {
                quad = 2;
            }
            if (y < 0) {
                quad = 3;
            }
        }

        else {
            quad = 0;
        }
        return quad;
    }
}
