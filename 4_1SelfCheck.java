class a4_1SelfChecks {
    public static void main(String[] args) {
        E1();
        System.out.println();
        E2();
        System.out.println();
        E3();
        System.out.println();
        E4();
    }

    public static void E1() { 
        int z = 1;
        int y = 9;
        int x = -6;
        //a
        if (z%2 == 1) {
            System.out.println("odd");
        }
        //b
        if (z < Math.sqrt(y)) {
            System.out.println("less than");
        }
        //c
        if (y > 0) {
            System.out.println("positive");
        }
        //d
        if (x % 2 == 0 || y % 2 == 0 && z%2 == 1) {
            System.out.println("why");
        }
        //e
        if (y%z == 0) {
            System.out.println("multiple");
        }
        //f
        if (z > 0 || z < 0) {
            System.out.println("not 0");
        }
        //g
        if (x < 0 && z > 0) {
            System.out.println("different signs");
        }
        //h
        if (y >= 0 && y < 10) {
            System.out.println("between 0 and 10");
        }
        //i
        if (z >= 0) {
            System.out.println("non-negative");
        }
        //j
        if (x%2 == 0) {
            System.out.println("even");
        }
        //k
        if (Math.abs(x-z) < Math.abs(y-z)) {
            System.out.println("something");
        }
    }

    public static void E2() {
        System.out.println("2a. True");
        System.out.println("2b. False");
        System.out.println("2c. True");
        System.out.println("2d. False");
        System.out.println("2e. True");
        System.out.println("2f. False");
        System.out.println("2g. False");
        System.out.println("2h. True");
        System.out.println("2i. False");
    }

    public static void E3() {
        System.out.println("3a. 13 12");
        System.out.println("3b. 5 6");
        System.out.println("3c. 6 5");
        System.out.println("3c. 7 11");
    }

    public static void E4() {
        System.out.println("4a. 10 6");
        System.out.println("4b. 9 9");
        System.out.println("4c. 3 4");
        System.out.println("4d. 29 30");
    }
}