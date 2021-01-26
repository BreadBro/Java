class Exercises {
    //Main
    public static void main(String [] args){
        E7();
        System.out.println();
        System.out.println();
        E9();
        System.out.println();
        System.out.println();
        E11();
        System.out.println();
        System.out.println();
        E13();
        System.out.println();
        System.out.println();
        E15();
        System.out.println();
        System.out.println();
        E17();
    }
    //E7
    public static void E7() {
        for (int line = 1; line <= 5; line++) {
            for (int dot = 1; dot <= -line+5; dot++) {
                System.out.print(" ");
            }
        System.out.println(line);
        }
    }
    //E9
    public static void E9() {
        Dash();
        System.out.println("");
        PatternOne();
        System.out.println("");
        Numbers();
        Numbers();
        System.out.println("");
        Dash();
    }
    public static void Dash() {
        for (int i = 1; i <= 40; i++) {
            System.out.print("-");
        }
    }
    public static void PatternOne() {
        for (int i = 1; i <= 10; i++) {
            System.out.print("_-^-");
        }
    }
    public static void Numbers() {
        for (int i = 0; i < 10; i++) {
            System.out.print("" + i+i);
        }
    }
    //E11
    public static void E11() {
        LineOver0_1();
        LineOver0_2();
        System.out.println("");
        LineOver0_3();
        LineOver0_4();
    }
    public static void LineOver0_1() {
        for (int line = 0; line < 6; line++) {
            System.out.print("    |");
        }
    }
    public static void LineOver0_2() {
        System.out.println("");
        System.out.print("1234");
        for (int num = 0; num < 5; num++) {
            System.out.print("01234");
        }
        System.out.print("0");
    }
    public static void LineOver0_3() {
        for (int line = 0; line < 6; line++) {
            System.out.print("       |");
        }
    }
    public static void LineOver0_4() {
        System.out.println("");
        System.out.print("1234567");
        for (int num = 0; num < 5; num++) {
            System.out.print("01234567");
        }
        System.out.print("0");
    }
    //E13
    public static void E13() {
        for (int i = 9; i >= 0; --i) {
            System.out.print("" + i+i+i+i+i);
        }
    }
    //E15
    public static void E15() {
        for(int i = 1; i <= 9; i+=2) {
            for(int j = 0; j < (11 - i) / 2; ++j) {
                System.out.print("-");
            }
            for(int j = 0; j < i; j++) {
                System.out.print(i);
            }
            for(int j = 0; j < (11 - i) / 2; j++) {
                System.out.print("-");
            }
            System.out.println();
            }
        }
    //E17
    public static final int HEIGHT = 8;
    public static void E17() {
        main();
    }

    public static void main() {    
        for(int i = HEIGHT; i >= 1; --i) {
            for(int space = 1; space <= HEIGHT - i; ++space) {
                System.out.print("");
            }

            for(int j = 0; j < (HEIGHT-i)*2; ++j) {
                System.out.print("\\");
            }

            for(int j=i; j <= 2 * i - 1; ++j) {
                System.out.print("||");
            }

            for(int j = 0; j < i - 1; ++j) {
                System.out.print("||");
            }

            for(int j = 0; j < (HEIGHT-i)*2; j++) {
                System.out.print("/");
            }
            System.out.println();
        }
    }
}
