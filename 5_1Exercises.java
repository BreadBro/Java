import java.util.*;
class rExercises {
    public static void main(String [] args) {
        /* 
        E1:
        1a. 10
        1b. 0
        1c. infinite
        1d. 3
        1e. 5
        1f. 8

        E3:
        3a. 1 0
        3b. 4 2
        3c. 16 4
        3d. 32 5
        3e. 64 6

        E4:
        4a. 19 0
        4b. 21 1
        4c. 3 4
        4d. 5 3
        4e. 1 6
        */
        E2();
        System.out.println();
        pg368E2();
        System.out.println();
        pg386E4();
        System.out.println();
        E6();
        System.out.println();
        E8();
        System.out.println();
        E10();
        System.out.println();
        System.out.println("\033[0;1m" + "\u001b[31m" + "We haven't learned how to do E12 yet. \033[0;0m");
    }

    public static void E2() {
        //a
        System.out.println("\033[0;1m" + "\u001b[31m" + "DISCLAIMER: Some of the answers are in the comments of this code. \033[0;0m");
        System.out.println("This one is supposed to be infinite since max isnt defined but I don't like infinite loops so I add a max");
        int n = 1;
        int max = 5;
        while (n <= max) {
            max--;
            System.out.println(n);
        }
        //b
        System.out.println();
        System.out.println("B.");
        int total = 25;
        int number = 1;
        while (number <= total) {
            total = total - number;
            System.out.println(total + " " + number);
        }
        //c
        System.out.println();
        System.out.println("C.");
        int i = 1;
        int j = 1;
        int k = 1;
        while (i <= 2) {
            i++;
            while (j <= 3) {
                j++;
                while (k <= 4) {
                    k++;
                    System.out.print("*");
                }
                System.out.print("!");
            }
            System.out.println();
        }
        //d
        System.out.println("D.");
        number = 4; 
        int count = 1;
        while (count <= number) {
            count++;
            System.out.println(number);
            number = number/2;
        }
    }
    public static void pg368E2() {
        System.out.println("pg368 E2:");
        int num1 = 5, num2 = 10, gcd = 1;
        for(int i = 1; i <= num1 && i <= num2; i++) {
            if(num1%i==0 && num2%i==0) {
                gcd = i;
            }
        }
        System.out.println("The GCD of " + num1 + " and " + num2 + " is " + gcd);
    }

    public static void pg386E4() {
        int y = 1;
        while (y == 1) {
            Random numb = new Random();
            int num = numb.nextInt(16) + 5;
            for (int x = 1; x <= num; x++) {
                System.out.print("x");
            }
            System.out.println();
            if (num >= 16) {
                y++;
            }
        }
    }

    public static void E6() {
        int x = 1;
        while (x == 1) {
            Random numb = new Random();
            int num = numb.nextInt(50) + 1;
            System.out.println("Guess: " + num);
            if (num >= 48) {
                System.out.println("I guessed correctly.");
                x++;
            }
        }
    }

    public static void E8() {
        int pos = 0;
        int x = 1;
        int maxpos = 0;
        while (x == 1) {
            Random numb = new Random();
            int num = numb.nextInt(2);
            if (num == 1) {
                pos += 1;
            }
            if (num == 0) {
                pos -= 1; 
            }
            if (pos == -3) {
                x++;
            }
            if (pos == 3) {
                x++;
            }
            if (pos == 1 && maxpos == 0) {
                maxpos = 1;
            }
            if (pos == 2 && maxpos == 1) {
                maxpos = 2;
            }
            if (pos == 3 && maxpos == 2) {
                maxpos = 3;
            }
            System.out.println("Position: " + pos);
        }
        System.out.println("Max Position: " + maxpos);
    }
    public static final int HOPS = 1;
    public static void E10() {
        int current = 1;
        int total = 3 * HOPS+ 1;
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
}