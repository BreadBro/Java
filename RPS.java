//Safin Stefanos
//Finishing 3/11/2021
import java.util.*;
public class RPS {
    public static void main(String [] args) {
        rps();
    }
    //main method
    public static void rps() {
        Scanner sc = new Scanner(System.in);
        //declare some variables
        int PlayerScore = 0;
        int x = 1;
        int y = 1;
        int comp = 0;

        String Pmove, idk, idk2, answ;
        String Cmove = "";

        Random num = new Random();
        
        char c, chrAnsw;

        System.out.println("This is a game of Rock Paper Scissors.");
        //loop for first round of rock paper scissors
        while (PlayerScore == 0) {
            System.out.println("Please type what move you want.");
            //set some more stuff
            Pmove = sc.nextLine();
            Pmove = Pmove.toLowerCase();
            c = Pmove.charAt(0);
            idk = Character.toString(c);
            //this randomly decides which move to choose, slightly weighted towards paper because more people move rock first
            comp = num.nextInt(4) + 1;
            idk2 = "";
            if (comp == 1) {
                Cmove = "rock";
                idk2 = "r";
            }
            if (comp == 2) {
                Cmove = "paper";
                idk2 = "p";
            }
            if (comp == 3) {
                Cmove = "paper";
                idk2 = "p";
            }
            if (comp == 3) {
                Cmove = "scissors";
                idk2 = "s";
            }
            //checks who won and updates the score
            PlayerScore = Check(PlayerScore, idk, idk2, Pmove, Cmove);
            System.out.println(PlayerScore);
        }

        while (y == 1) {
            x = 1;
            //checks if you want to play again
            while (x == 1) {
                System.out.println("Would you like to play again?");

                answ = sc.nextLine();
                chrAnsw = answ.charAt(0);
                answ = Character.toString(chrAnsw);

                if (answ.equals("y") || answ.equals("Y")) {
                    if (PlayerScore == 1) {
                        //method if computer loses
                        PlayerScore = NextMoveLoss(sc, Cmove, PlayerScore);
                        if (PlayerScore == 0) {
                            x++;
                        }
                    }
                    if (PlayerScore == -1) {
                        //method if computer wins
                        PlayerScore = NextMoveWin(sc, Cmove, PlayerScore);
                        if (PlayerScore == 0) {
                            x++;
                        }
                    }  
                }
                else {
                    System.exit(0);
                }
                //similar to the first move loop but this one is for ties and isn't weighted
                while (PlayerScore == 0) {
                    System.out.println("Please type what move you want.");
                    Pmove = sc.nextLine();
                    Pmove = Pmove.toLowerCase();
                    c = Pmove.charAt(0);
                    idk = Character.toString(c);
    
                    comp = num.nextInt(3) + 1;
                    idk2 = "";
                    if (comp == 1) {
                        Cmove = "rock";
                        idk2 = "r";
                    }
                    if (comp == 2) {
                        Cmove = "paper";
                        idk2 = "p";
                    }
                    if (comp == 3) {
                        Cmove = "scissors";
                        idk2 = "s";
                    }
                    
                    PlayerScore = Check(PlayerScore, idk, idk2, Pmove, Cmove);
                    System.out.println(PlayerScore);
                }
            }
        }
    }
//this method checks who won the round, computer or person
    public static int Check(int PlayerScore, String idk, String idk2, String Pmove, String Cmove) {
        String win = "You won! You chose %s and the computer chose %s. %n";
        String tie = "It was a tie! You chose %s and the computer chose %s. %n";
        String loss = "The computer won! You chose %s and the computer chose %s. %n";
        if (idk.equals("p")) {
            if (idk2.equals("r")) {
                System.out.printf(win, Pmove, Cmove);
                PlayerScore = 1;
            }
            if (idk2.equals("p")) {
                System.out.printf(tie, Pmove, Cmove);
                PlayerScore = 0;
            }
            if (idk2.equals("s")) {
                System.out.printf(loss, Pmove, Cmove);
                PlayerScore = -1;
            }
        }
        if (idk.equals("r")) {
            if (idk2.equals("s")) {
                System.out.printf(win, Pmove, Cmove);
                PlayerScore = 1;
            }
            if (idk2.equals("r")) {
                System.out.printf(tie, Pmove, Cmove);
                PlayerScore = 0;
            }
            if (idk2.equals("p")) {
                System.out.printf(loss, Pmove, Cmove);
                PlayerScore = -1;
            }
        }
        if (idk.equals("s")) {
            if (idk2.equals("p")) {
                System.out.printf(win, Pmove, Cmove);
                PlayerScore = 1;
            }
            if (idk2.equals("s")) {
                System.out.printf(tie, Pmove, Cmove);
                PlayerScore = 0;
            }
            if (idk2.equals("r")) {
                System.out.printf(loss, Pmove, Cmove);
                PlayerScore = -1;
            }
        }
        return PlayerScore;
    }
    //changes the moves to be more in favor of the computer based on the last round
    public static int NextMoveWin(Scanner sc, String Cmove, int PlayerScore) {
        System.out.println("Please type what move you want.");
        String Pmove, idk, idk2;
        idk2 = "";
        
        char c;
        Pmove = sc.nextLine();
        Pmove = Pmove.toLowerCase();
        c = Pmove.charAt(0);
        idk = Character.toString(c);
        if (Cmove.equals("rock")) {
            idk2 = "p";
            Cmove = "paper";
        }
        if (Cmove.equals("paper")) {
            idk2 = "s";
            Cmove = "scissors";
        }
        if (Cmove.equals("scissors")) {
            idk2 = "r";
            Cmove = "rock";
        }
        PlayerScore = Check(PlayerScore, idk, idk2, Pmove, Cmove);
        return PlayerScore;
    }

    //changes the moves to be more in favor of the computer based on the last round
    public static int NextMoveLoss(Scanner sc, String Cmove, int PlayerScore) {
        System.out.println("Please type what move you want.");
        String Pmove, idk, idk2;
        idk2 = "";
        char c;
            Pmove = sc.nextLine();
            Pmove = Pmove.toLowerCase();
            c = Pmove.charAt(0);
            idk = Character.toString(c);
        if (Cmove.equals("rock")) {
            idk2 = "s";
            Cmove = "scissors";
        }
        if (Cmove.equals("paper")) {
            idk2 = "r";
            Cmove = "rock";
        }
        if (Cmove.equals("scissors")) {
            idk2 = "p";
            Cmove = "paper";
        }
        PlayerScore = Check(PlayerScore, idk, idk2, Pmove, Cmove);
        return PlayerScore;
    }
}