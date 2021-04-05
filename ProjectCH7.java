import java.util.*;

public class ProjectCH7 {
    public static void main(String [] args) {
        E1();
        System.out.println();
        E5();
    }

    public static Scanner sc = new Scanner(System.in);
    public static Random ran = new Random();

    public static void E1() {
        int x = 1;
        while (x == 1) {
            //gets all the digits
            System.out.println("Please enter 50 digits.");
            String num1 = sc.next();
            char[] array1 = num1.toCharArray();
            System.out.println("Please enter another 50 digits.");
            String num2 = sc.next();
            //converts array into big array that is stores chars
            char[] array2 = num2.toCharArray();
            char[] CombinedArray = combine(array1, array2);

            if (CombinedArray.length > 100) {
                System.out.println("That number is too long.");
            }
            else {
                System.out.println();
                //prints the number
                for (int i = 0; i < CombinedArray.length; i++) {
                    System.out.print(CombinedArray[i]);
                }
            }
            System.out.println();
            System.out.println("Do you want to combine another number?");
            String answ = sc.next();
            if (answ.contains("n") || answ.contains("N")) {
                x++;
            }
        }
    }
    
    public static char[] combine(char[] array1, char[] array2) {
        //combines the arrays
        char[] CombinedArray = Arrays.copyOf(array1, array1.length + array2.length);
        for (int i = array1.length; i < array1.length + array2.length; i++) {
            CombinedArray[i] = array2[i - array1.length];
        }
        return CombinedArray;    
    }

    public static void E5() {
        //defining variables
        String[][] board = new String[3][3];
        String line = "---|----|---";
        int x = 0;
        int i = 0;
        int winloss = 0;
        String answ = "";
        String PlayAgain = "";
        //first while loop so that it is replayable
        while (i == 0) {
            //explaining rules
            System.out.println("This is a game of tic tac toe.");
            System.out.println("Each move is an abbreviated form of the position you want to go.");
            System.out.println("TL | TM | TR");
            System.out.println(line);
            System.out.println("ML | MM | MR");
            System.out.println(line);
            System.out.println("BL | BM | BR");
            System.out.println("Type the abbreviation to put your marker in that spot.");
            System.out.println("If you type a location that is invalid, you forfeit your move.");
            System.out.println();
            //Gives time to read rules. idk why i got do a try catch but it wont work otherwise
            try {
                Thread.sleep(3000);
            } 
            catch (InterruptedException e) {
                System.out.println("time.sleep is superior");
            }
            //resets each variable before starting the game
            x = 0;
            board[0][0] = " ";
            board[0][1] = " ";
            board[0][2] = " ";
            board[1][0] = " ";
            board[1][1] = " ";
            board[1][2] = " ";
            board[2][0] = " ";
            board[2][1] = " ";
            board[2][2] = " ";
            //does first move outside the loop since the number of moves is uneven and doesnt check for win because you cant win in one move
            System.out.println("Player One, please type your move.");
            answ = sc.next();
            //updates the board
            board = CheckMoveP1(answ, board);
            TicTacToeBoard(board);

            for (x = 0; x < 4; x++) {
                //more sleep
                try {
                    Thread.sleep(250);
                } 
                catch (InterruptedException e) {
                    //not wrong tho
                    System.out.println("time.sleep is superior");
                }

                //This if statement is weird because of something weird that was happening. Whenever I would set x outside of the for loop, it would continue to ask do this part again so
                //I just made sure that doesnt happen
                if (x < 4) {
                    System.out.println("Player Two, please type your move.");
                    answ = sc.next();
                    //updates the board
                    board = CheckMoveP2(answ, board);
                    TicTacToeBoard(board);
                    winloss = CheckWin(board);
                }

                if (winloss == 2) {
                    //simple loop to replay
                    System.out.println("Player 2 is the winner! Do you want to play again?");
                    PlayAgain = sc.next();
                    if (PlayAgain.contains("y") || PlayAgain.contains("Y")) {
                        x = 5;
                    }
                    else {
                        x = 6;
                        i++;
                    }
                }

                //sleep
                try {
                    Thread.sleep(250);
                } 
                catch (InterruptedException e) {
                    System.out.println("time.sleep is superior");
                }
                //same thing as the other one
                if (x < 4) {
                    System.out.println("Player One, please type your move.");
                    answ = sc.next();
                    board = CheckMoveP1(answ, board);
                    TicTacToeBoard(board);
                    winloss = CheckWin(board);
                }

                if (winloss == 1) {
                    //same thing as other one
                    System.out.println("Player 1 is the winner! Do you want to play again?");
                    PlayAgain = sc.next();
                    if (PlayAgain.contains("y") || PlayAgain.contains("Y")) {
                        x = 5;
                    }
                    else {
                        x = 6;
                        i++;
                    }
                }
            }

            //ends the game just in case something else doesnt work
            if (x == 6) {
                i++;
            }

            if (winloss == 0) {
                //replay if statement
                System.out.println("It was a tie! Do you want to play again?");
                PlayAgain = sc.next();
                if (PlayAgain.contains("n") || PlayAgain.contains("N")) {
                    i++;
                }
            }
        }
    }

    public static String[][] CheckMoveP1(String answ, String[][] board) {
        //Lots of if statements to check where P2 wants to go and puts their marker there
        try {
            if((answ.contains("TL") || answ.contains("tl")) && board[0][0].contains(" ")) {
                board[0][0] = "X";
                return board;
            }
            if((answ.contains("TM") || answ.contains("tm")) && board[0][1].contains(" ")) {
                board[0][1] = "X";
                return board;
            }
            if((answ.contains("TR") || answ.contains("tr")) && board[0][2].contains(" ")) {
                board[0][2] = "X";
                return board;
            }
            if((answ.contains("ML") || answ.contains("ml")) && board[1][0].contains(" ")) {
                board[1][0] = "X";
                return board;
            }
            if((answ.contains("MM") || answ.contains("mm")) && board[1][1].contains(" ")) {
                board[1][1] = "X";
                return board;
            }
            if((answ.contains("MR") || answ.contains("mr")) && board[1][2].contains(" ")) {
                board[1][2] = "X";
                return board;
            }
            if((answ.contains("BL") || answ.contains("bl")) && board[2][0].contains(" ")) {
                board[2][0] = "X";
                return board;
            }
            if((answ.contains("BM") || answ.contains("bm")) && board[2][1].contains(" ")) {
                board[2][1] = "X";
                return board;
            }
            if((answ.contains("BR") || answ.contains("br")) && board[2][2].contains(" ")) {
                board[2][2] = "X";
                return board;
            }
        }
        catch(Exception e) {
            System.out.println("something went wrong");
        }
        return board;
    }

    public static String[][] CheckMoveP2(String answ, String[][] board) {
        //Lots of if statements to check where P2 wants to go and puts their marker there
        try {
            if((answ.contains("TL") || answ.contains("tl")) && board[0][0].contains(" ")) {
                board[0][0] = "O";
                return board;
            }
            if((answ.contains("TM") || answ.contains("tm")) && board[0][1].contains(" ")) {
                board[0][1] = "O";
                return board;
            }
            if((answ.contains("TR") || answ.contains("tr")) && board[0][2].contains(" ")) {
                board[0][2] = "O";
                return board;
            }
            if((answ.contains("ML") || answ.contains("ml")) && board[1][0].contains(" ")) {
                board[1][0] = "O";
                return board;
            }
            if((answ.contains("MM") || answ.contains("mm")) && board[1][1].contains(" ")) {
                board[1][1] = "O";
                return board;
            }
            if((answ.contains("MR") || answ.contains("mr")) && board[1][2].contains(" ")) {
                board[1][2] = "O";
                return board;
            }
            if((answ.contains("BL") || answ.contains("bl")) && board[2][0].contains(" ")) {
                board[2][0] = "O";
                return board;
            }
            if((answ.contains("BM") || answ.contains("bm")) && board[2][1].contains(" ")) {
                board[2][1] = "O";
                return board;
            }
            if((answ.contains("BR") || answ.contains("br")) && board[2][2].contains(" ")) {
                board[2][2] = "O";
                return board;
            }  
        }

        catch(Exception e) {
            System.out.println("something went wrong");
        }
        
        return board;
    }

    public static int CheckWin(String[][] board) {
        //Lots of if statements to check if somebody has won
        if (board[0][0].contains("X") && board[0][1].contains("X") && board[0][2].contains("X")) {
            return 1;
        }

        if (board[1][0].contains("X") && board[1][1].contains("X") && board[1][2].contains("X")) {
            return 1;
        }

        if (board[2][0].contains("X") && board[2][1].contains("X") && board[2][2].contains("X")) {
            return 1;
        }

        if (board[0][0].contains("X") && board[1][0].contains("X") && board[2][0].contains("X")) {
            return 1;
        }

        if (board[0][1].contains("X") && board[1][1].contains("X") && board[2][1].contains("X")) {
            return 1;
        }

        if (board[0][2].contains("X") && board[1][2].contains("X") && board[2][2].contains("X")) {
            return 1;
        }

        if (board[0][0].contains("X") && board[1][1].contains("X") && board[2][2].contains("X")) {
            return 1;
        }

        if (board[0][2].contains("X") && board[1][1].contains("X") && board[2][0].contains("X")) {
            return 1;
        }

        if (board[0][0].contains("O") && board[0][1].contains("O") && board[0][2].contains("O")) {
            return 2;
        }

        if (board[1][0].contains("O") && board[1][1].contains("O") && board[1][2].contains("O")) {
            return 2;
        }

        if (board[2][0].contains("O") && board[2][1].contains("O") && board[2][2].contains("O")) {
            return 2;
        }

        if (board[0][0].contains("O") && board[1][0].contains("O") && board[2][0].contains("O")) {
            return 2;
        }

        if (board[0][1].contains("O") && board[1][1].contains("O") && board[2][1].contains("O")) {
            return 2;
        }

        if (board[0][2].contains("O") && board[1][2].contains("O") && board[2][2].contains("O")) {
            return 2;
        }

        if (board[0][0].contains("O") && board[1][1].contains("O") && board[2][2].contains("O")) {
            return 2;
        }

        if (board[0][2].contains("O") && board[1][1].contains("O") && board[2][0].contains("O")) {
            return 2;
        }
        return 0;
    }

    public static void TicTacToeBoard(String[][] board) {
        //What prints the board
        String line = "---|---|---";
        System.out.println(" " + board[0][0] + " | " + board[0][1] + " | " + board[0][2]);
        System.out.println(line);
        System.out.println(" " + board[1][0] + " | " + board[1][1] + " | " + board[1][2]);
        System.out.println(line);
        System.out.println(" " + board[2][0] + " | " + board[2][1] + " | " + board[2][2]);
    }
}
