import javax.sound.sampled.Line;

public class LoopsHW {
    public static void main(String [] args){
        ExerciseNine();
        System.out.println();
        ExerciseTen();
        System.out.println();
        ExerciseEleven();

    }
        //Exercise 9

        public static void TopHex() {
            System.out.println("   _______");
            System.out.println("  /       \\");
            System.out.println(" /         \\");
        }

        public static void BottomHex() {
            System.out.println(" \\         /");
            System.out.println("  \\_______/");
        }

        public static void Line() {
            System.out.println("\"-\"-'-\"-'-\"-\"");
        }

        public static void ExerciseNine() {
            TopHex();
            BottomHex();
            System.out.println();
            Line();
            TopHex();
            BottomHex();
            System.out.println();
            Line();
            BottomHex();
            TopHex();
            Line();
            BottomHex();
        }
        //Exercise 10

        public static void RTop() {
            System.out.println("   /\\");
            System.out.println("  /  \\");
            System.out.println(" /    \\");
        }

        public static void RSquare() {
            System.out.println("+------+");
            System.out.println("|      |");
            System.out.println("|      |");
            System.out.println("+------+");
        }

        public static void RBody() {
            System.out.println("|United|");
            System.out.println("|States|");
        }

        public static void ExerciseTen() {
            System.out.println();
            RTop();
            RSquare();
            RBody();
            RSquare();
            RTop();
        }
        //Exercise 11
        public static void PatternOne() {
            System.out.println("*****");
            System.out.println("*****");
            System.out.println(" * * ");
            System.out.println("  *  ");
            System.out.println(" * * ");  
        }

        public static void PatternTwo() {
            System.out.println("  *  ");
            System.out.println("  *  ");
            System.out.println("  *  ");
        }

        public static void ExerciseEleven() {
            PatternOne();
            System.out.println();
            PatternOne();
            System.out.println("*****");
            System.out.println("*****");
            System.out.println();
            PatternTwo();
            PatternOne();
        }
}