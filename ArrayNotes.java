import java.util.*;
public class ArrayNotes {
    public static void main(String [] args) {
        Weather();
    }

    public static void Notes() {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers would you like to input?");
        int ArraySize = sc.nextInt();
        System.out.println();
        int Sum = 0;
        double SumAverage = 0;
        int[] arrays = new int[ArraySize];
        for (int i = 0; i < ArraySize; i++) {
            System.out.print("What : ");
            arrays[i] = sc.nextInt();
            Sum += arrays[i];
        }
        for (int j = 0; j < ArraySize; j++) {
            System.out.print(arrays[j] + " ");
        }
        SumAverage = (double)Sum/ArraySize;
        System.out.printf("The average is %f%n", SumAverage);

        int[] arrays2 = Arrays.copyOf(arrays, ArraySize);
        Arrays.sort(arrays2);
        String arr = Arrays.toString(arrays2);
        System.out.println(arr);
        if (Arrays.equals(arrays, arrays2)) {
            System.out.println("Same");
        }
        else {
            System.out.println("Diff");
        }
        System.out.println("What number would you like to find the index of?");
        int search = sc.nextInt();
        if (Arrays.binarySearch(arrays2, search) < 0) {
            System.out.printf("%d is not in the array.%n", search);
        }
        else {
            System.out.printf("The index of number %d is %d%n", search, Arrays.binarySearch(arrays2, search));
        }
    }

    public static void Weather() {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many days' temperatures? ");
        int ArraySize = sc.nextInt();
        int Sum = 0;
        double SumAverage = 0;
        int DaysAbove = 0;
        int[] arrays= new int[ArraySize];
        int x = 1;
        int high1 = 0;
        int high2 = 0;
        int low1 = 0;
        int low2 = 0;
        int[] ArraySorted;
        String ans = "";
        while (x == 1) {
            arrays = new int[ArraySize];
            DaysAbove = 0;
            SumAverage = 0;
            for (int i = 0; i < ArraySize; i++) {
                System.out.printf("Day %d's high temp: ", i+1);
                arrays[i] = sc.nextInt();
                Sum += arrays[i];
            }

            SumAverage = (double)Sum/ArraySize;
            System.out.printf("Average temp = %.1f%n", SumAverage);

            for (int k = 0; k < ArraySize; k++) {
                if (arrays[k] > SumAverage) {
                    DaysAbove++;
                }
            }

            if (DaysAbove == 1) {
                System.out.printf("%d day was above average", DaysAbove);
            }

            else {
                System.out.printf("%d days were above average", DaysAbove);
            }

            System.out.println();
            System.out.println("Temperatures: " + Arrays.toString(arrays));
            ArraySorted = Arrays.copyOf(arrays, ArraySize);
            Arrays.sort(ArraySorted);
            high1 = ArraySorted[ArraySize-1];
            high2 = ArraySorted[ArraySize-2];
            low1 = ArraySorted[0];
            low2 = ArraySorted[1];
            System.out.printf("Two coldest days: %d, %d%n", low1, low2);
            System.out.printf("Two hottest days: %d, %d%n", high1, high2);

            System.out.println("Would you like to go again?");
            ans = sc.next();

            if (ans.contains("n")) {
                x++;
            }

            else {
                System.out.println("How many day's temperatures? ");
                ArraySize = sc.nextInt();
            }
        }
    }
}
