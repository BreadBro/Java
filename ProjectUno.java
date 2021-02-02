public class ProjectUno {
    public static void main(String [] args) {
        E3();
        System.out.println();
        E4();
        System.out.println();
        System.out.println();
        E5();
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
    public static int StairAmount = 5;
    public static void E4() {
        for(int stair = 1; stair <= StairAmount; stair++) {
            Full(stair);
        }
        System.out.print("******");
        for(int star = 1; star <= 5*StairAmount; star++) {
            System.out.print("*");
        }
        System.out.print("*");
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
}