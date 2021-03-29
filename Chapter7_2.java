import java.util.*;
public class Chapter7_2 {
    public static void main(String [] args) {
        pg496E2();
        System.out.println();
        pg496E4();
        System.out.println();
        pg493E18();
        System.out.println();
        pg494E20();
        System.out.println();
        pg494E22();
        System.out.println();
        pg495E24();
        System.out.println();
        pg495E26();
    }

    public static void pg496E2() {
        System.out.println("Page 496, Exercise 2");
        int range = range();
        System.out.printf("The range is %d%n", range);
    }

    public static int range() {
        Random ran = new Random();
        int ArraySize = ran.nextInt(9)+1;
        int[] array = new int[ArraySize];
        for (int i = 0; i < ArraySize; i++) {
            array[i] = ran.nextInt(100);
        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        return (array[ArraySize-1] - array[0])+1;
    }

    public static void pg496E4() {
        System.out.println("Page 496, Exercise 4");
        boolean Sort = isSorted();
        if (Sort) {
            System.out.println("The array is sorted.");
        }
        else {
            System.out.println("The array isn't sorted.");
        }
    }

    public static boolean isSorted() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Array Size: \n");
        int ArraySize = sc.nextInt();
        int[] list1 = new int[ArraySize];
        for (int i = 0; i < ArraySize; i++) {
            System.out.print("Number: ");
            list1[i] = sc.nextInt();
        }
        int[] list2 = Arrays.copyOf(list1, ArraySize);
        Arrays.sort(list2);
        if (Arrays.equals(list1, list2)) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void pg493E18() {
        System.out.println("Page 493, Exercise 18");
        System.out.println("[20, 30, 40, 50, 60, 70, 80, 90, 100, 100]");
    }

    public static void pg494E20() {
        System.out.println("Page 494, Exercise 20");
        System.out.println("[26, 17, 14, 11, 10");
    }

    public static void pg494E22() {
        System.out.println("Page 494, Exercise 22");
        System.out.println("[3, 7, 1, 7, 25, 4, 18, -1, 25]");
    }

    public static void pg495E24() {
        System.out.println("Page 495, Exercise 24");
        System.out.println("a. [8]");
        System.out.println("b. [14, 8]");
        System.out.println("c. [7, 2, 3, 3, 1, 4]");
        System.out.println("d. [10, 9, 9, 6, 6]");
        System.out.println("e. [12, 12, 11, 11, 9, 8]");
    }

    public static void pg495E26() {
        System.out.println("Page 495, Exercise 24");
        boolean check = Palindrome();
        if (check) {
            System.out.println("The string is a palindrome.");
        }
        else {
            System.out.println("The string is not a palindrome.");
        }
    }
    
    public static boolean Palindrome() {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many words do you want in your array?");
        int ArraySize = sc.nextInt();
        String[] array = new String[ArraySize];
        for (int i = 0; i < ArraySize; i++) {
            System.out.print("Word: ");
            array[i] = sc.next();
        }
        String[] array2 = Arrays.copyOf(array, ArraySize);
        for (int i = 0; i < ArraySize; i++) {
            array2[i] = array[ArraySize-i-1];
        }
        if (Arrays.equals(array, array2)) {
            return true;
        }
        else {
            return false;
        }

    }
}