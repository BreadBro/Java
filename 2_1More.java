class Exercise {
    //Main
    public static void main(String[] Args) {
        E3();
        System.out.println();
        System.out.println();
        E5();
        System.out.println();
        System.out.println();
        E9();
        System.out.println();
        System.out.println();
        E11();
        System.out.println();
        System.out.println();
        E15();

    }

    //E3
    public static void E3() {
        int count = 12;
        int num1 = 1;
        int num2 = 1;
        for (int i = 1; i <= count; ++i) {
            System.out.print(num1+" ");
            int sumOfPrevTwo = num1 + num2;
            num1 = num2;
            num2 = sumOfPrevTwo;
        }
    }

    //E5
    public static void E5() {
        for(int i=0; i < 5; i++) {
            for(int j=0; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
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

    //15
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
}