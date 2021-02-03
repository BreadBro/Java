public class ProjectUno {
    public static void main(String [] args) {
        E3();
        System.out.println();
        E4();
        System.out.println();
        System.out.println();
        E5();
        System.out.println();
        E6();
    }
    public static void E3() {
        First_Line();
        Top();
        Bottom();
        First_Line();
    }
    public static void First_Line() {
        System.out.print("+");
        for (int dash = 1; dash <= 9; dash++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
    public static void Top() {
        for (int line = 1; line <= 4; line++) {
		    System.out.print("|");
		    for (int spaces = 1; spaces <= -line + 5; spaces++) {
                System.out.print(" ");
            }
		    for (int slash = 1; slash < line; slash++) {
                System.out.print("/");
            }
		    System.out.print("*");
		    for (int bslash = 1; bslash < line; bslash++) {
                System.out.print("\\");
            }
            for (int spaces = 1; spaces <= -line + 5; spaces++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }
    public static void Bottom() {
        for (int line = 1; line <= 4; line++) {
            System.out.print("|");
            for (int spaces = 1; spaces <= line; spaces++) {
                System.out.print(" ");
            }
            for (int bslash = 1; bslash <= -line+4; bslash++) {
                System.out.print("\\");
            }
            System.out.print("*");
            for (int slash = 1; slash <= -line+4; slash++) {
                System.out.print("/");
            }
            for (int spaces = 1; spaces <= line; spaces++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }
    public static final int StairAmount = 2;
    public static void E4() {
        for(int stair = 1; stair <= StairAmount; stair++) {
            Full(stair);
        }
        //12, 17, 22
        BottomLine();
    }

    public static void BottomLine() {
        for(int star = 1; star <= 5*StairAmount+7; star++) {
            System.out.print("*");
        }
    }
    public static void LeftSpace(int stair) {
        for(int aspace = 1; aspace <= (5*StairAmount-5)-(5*stair-5); aspace++) {
            System.out.print(" ");
        }
    }

    public static void StairSpace(int stair){
        System.out.print("*");
        for(int bspace = 0; bspace < 5*stair; bspace++) {
            System.out.print(" ");
        }
        System.out.println("*");
    }

    public static void Steps(int stair){
        System.out.print("******");
        for(int cspace = 1; cspace <= 5*stair-5; cspace++) {
            System.out.print(" ");
        }
        System.out.println("*");
    }

    public static void Full(int stair) {
        LeftSpace(stair);
        System.out.print("  o  ");
        Steps(stair);
        LeftSpace(stair);
        System.out.print(" /|\\ ");
        StairSpace(stair);
        LeftSpace(stair);
        System.out.print(" / \\ ");
        StairSpace(stair);
    }


    public static void E5() {
        aCone();
        aLine();
        aPatternTop();
        aPatternBottom();
        aLine();
        aPatternBottom();
        aPatternTop();
        aLine();
        aCone();
    }

    public static void aCone() {
        for (int line = 1; line <= 5; line++) {
	        for (int spaces = 1; spaces <= -line + 6; spaces++) {
                System.out.print(" ");
            }
		    for (int slash = 1; slash <= line; slash++) {
                System.out.print("/");
            }
		    System.out.print("**");
		    for (int bslash = 1; bslash <= line; bslash++) {
                System.out.print("\\");
            }
            System.out.println();
        }
    }

    public static void aLine() {
        System.out.print("+");
	    for (int dash = 1; dash <= 6; dash++) {
            System.out.print("=*");
        }
	    System.out.println("+");
    }

    public static void aPatternTop() {
        for (int line = 1; line <= 3; line++) {
            System.out.print("|");
            aPatternTopHalf(line);
            aPatternTopHalf(line);
            System.out.println("|");
        }
    }

    public static void aPatternTopHalf(int line) {
        for (int dots = 1; dots <= -line+3; dots++) {
            System.out.print(".");
        }
        for (int cone = 1; cone <= line; cone++) {
            System.out.print("/\\");
        }
        for (int dots = 1; dots <= -line+3; dots++) {
            System.out.print(".");
        }
    }

    public static void aPatternBottom() {
        for (int line = 1; line <= 3; line++) {
            System.out.print("|");
            aPatternBottomHalf(line);
            aPatternBottomHalf(line);
            System.out.println("|");
        }
    }

    public static void aPatternBottomHalf(int line) {
        for (int dots = 1; dots < line; dots++) {
            System.out.print(".");
        }
        for (int cone = 1; cone <= -line+4; cone++) {
            System.out.print("\\/");
        }
        for (int dots = 1; dots < line; dots++) {
            System.out.print(".");
        }
    }
    public static final int CONTROLLER = 8;
    public static void E6() {
        NeedleTip();
        TopNeedle();
        MiddleLine();
        BottomNeedle();
        NeedleTip();
        NeedleBody();
        TopNeedle();
        MiddleLine();
    }
    public static void NeedleTip() {
        for (int i = 1; i <= CONTROLLER; i++) {
            for (int j = 1; j <= CONTROLLER*3; j++) {
                System.out.print(" ");
            }
            System.out.println("||");
        }
    }
    public static void TopNeedle() {
        for (int line = 0; line < CONTROLLER; line++) {
            for (int spaces = 1; spaces <= -3*line+(2*CONTROLLER+(CONTROLLER-3)); spaces++) {
                System.out.print(" ");
            }
            System.out.print("__/");
            for (int colon = 1; colon <= line; colon++) {
                System.out.print(":::");
            }
            System.out.print("||");
            for (int colon = 1; colon <= line; colon++) {
                System.out.print(":::");
            }
            System.out.println("\\__");
        }
    }

    public static void MiddleLine() {
        System.out.print("|");
        for (int marks = 1; marks <= CONTROLLER*6; marks++){
            System.out.print("\"");
        }
        System.out.println("|");
    }

    public static void BottomNeedle() {
        for (int line = 1; line <= CONTROLLER; line++) {
            for (int spaces = 1; spaces <= (line-1)*2; spaces++) {
                System.out.print(" ");
            }
            System.out.print("\\_");
            for (int conething = 1; conething <= -2*line+(3*CONTROLLER+1); conething++) { // 4 13, 3 10, 2 7, 1 6
                System.out.print("/\\");
            }
            System.out.println("_/");
        }
    }
    public static void NeedleBody() {
        for (int line = 1; line <= CONTROLLER*4; line++) {
            for (int spaces = 1; spaces <= CONTROLLER*2+(CONTROLLER-3); spaces++) { // 3 6, 4 9, 5 12, 6 15
                System.out.print(" ");
            }
            System.out.println("|%%||%%|");
        }
    }
}
