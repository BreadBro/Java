import java.util.Random;
import java.util.Scanner;

public class SelfCheck7_1 {
    public static void main(String [] args) {
        E2();
        System.out.println();
        E4();
        System.out.println();
        E6();
        System.out.println();
        E8();
        System.out.println();
        E10();
        System.out.println();
        E12();
        System.out.println();
        E14();
        System.out.println();
        E16();

    }
    
    public static void E2() {
        System.out.println("E2:");
        int[] array= {27, 51, 33, -1, 101};
        for (int i = 0; i < 5; i++) {
            System.out.println(array[i]);
        }
    }

    public static void E4() {
        System.out.println("E4:");
        System.out.println("numbers[0] = 0");
        System.out.println("numbers[1] = 4");
        System.out.println("numbers[2] = 11");
        System.out.println("numbers[3] = 0");
        System.out.println("numbers[4] = 44");
        System.out.println("numbers[5] = 0");
        System.out.println("numbers[6] = 0");
        System.out.println("numbers[7] = 2");
    }

    public static void E6() {
        System.out.println("E6:");
        int[] array= new int[5];
        array[0] = 7;
        array[1] = -1;
        array[2] = 13;
        array[3] = 24;
        array[4] = 6;
        for (int i = 0; i < 5; i++) {
            System.out.println(array[i]);
        }
    }

    public static void E8() {
        System.out.println("E8:");
        double avg = average();
        System.out.printf("The average is: %.1f%n", avg);
    }

    public static double average() {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers? ");
        int ArraySize = sc.nextInt();
        int Sum = 0;
        double SumAverage = 0;
        int[] arrays= new int[ArraySize];
        int x = 1;
        String ans = "";
        arrays = new int[ArraySize];
        SumAverage = 0;
        for (int i = 0; i < ArraySize; i++) {
            System.out.print("Number: ");
            arrays[i] = sc.nextInt();
            Sum += arrays[i];
        }
        SumAverage = (double)Sum/ArraySize;
        return SumAverage;
    }

    public static void E10() {
        System.out.println("E10:");
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("How large would you like your array?");
        int ArraySize = sc.nextInt();
        int[] array = new int[ArraySize];
        for (int i = 0; i < ArraySize; i++) {
            array[i] = rand.nextInt(100);
        }
        for (int i = 0; i < ArraySize; i++) {
            System.out.printf("array [%d] is %d%n", i, array[i]);
        }
        try {
            Thread.sleep(2000);
        } 
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void E12() {
        System.out.println("E12:");
        System.out.println("Change int[] equals = new int[randomnumber] to String[] equals = new String[randomnumber]");
    }

    public static void E14() {
        System.out.println("E14:");
        System.out.println("Unlike integers, arrays are objects and use reference semantics.");
    }

    public static void E16() {
        System.out.println("E16:");
        System.out.println("2 0");
        System.out.println("1 0");
        System.out.println("1 0");
        System.out.println("0 0");
    }
}
