import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.*;
import java.io.FileWriter;
import java.util.*;
import java.io.InputStreamReader;
import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
public class ProjectCH6 {
    public static void main(String [] args) throws FileNotFoundException, IOException, MalformedURLException{
        Path path = Paths.get("ProjectCH6.java");
        path = path.toAbsolutePath();
        path = path.getParent();
        E1(path);
        System.out.println();
        E5(path);
    }

    public static void E1(Path path) throws IOException, MalformedURLException, FileNotFoundException {
        FileWriter please = new FileWriter(path + "\\essay.txt");
        please.write("");
        please.close();
        File file = new File(path + "\\essay.txt");
        Scanner sc1 = new Scanner(file);
        PrintStream output = new PrintStream(file);
        int LineCount = 0;
        //all of this just to get the bee movie from online
        try {
            URL url = new URL("https://web.njit.edu/~cm395/theBeeMovieScript/");
            //read text returned by server
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
            String line;
            //all to get rid of html code from text
            while ((line = in.readLine()) != null) {
                line = line.replace("</html>", "");
                line = line.replace("</body>", "");
                line = line.replace("</pre>", "");
                line = line.replaceAll("<[^>]++>", "");
                line = line.replaceAll("\\{[^>]+\\}", "");
                line = line.replace(".parallax{", "");
                line = line.replace("#home a ", "");
                line = line.replace("#home a:link ", "");
                line = line.replace("#home a:visited ", "");
                line = line.replace("#home a:hover ", "");
                line = line.replace("#home a:active ", "");
                line = line.replace("#home h1 ", "");
                line = line.replace("background-image:url(\"field_fog_man.jpg\");", "");
                line = line.replace("background-attachment:fixed;", "");
                line = line.replace("background-position:center;", "");
                line = line.replace("background-repeat:no-repeat;", "");
                line = line.replace("background-size:cover;", "");
                line = line.replace("}", "");
                output.println(line);
            }
            in.close();
        }
        
        catch (MalformedURLException e) {
            System.out.println("Malformed URL: " + e.getMessage());
        }
        catch (IOException e) {
            System.out.println("I/O Error: " + e.getMessage());
        }
        while (sc1.hasNextLine()) {
            sc1.nextLine();
            LineCount++;
        }
        sc1.close();
        Scanner sc2 = new Scanner(file);
        String text = sc2.useDelimiter("\\A").next();
        String[] WordCounter = text.trim().split("\\s+");
        int WordCount = WordCounter.length;
        String text2 = text;
        text2 = text2.replace(" ", "");
        int letters = text2.length();
        System.out.printf("There are %d words, %d lines, and %d characters.%n", WordCount, LineCount, letters);
        sc2.close();
    }

    public static void E5(Path path) throws IOException, FileNotFoundException {
        //variables
        Scanner sc1 = new Scanner(System.in);
        int blanks = 0;
        File MadLib;
        int speed = 0;
        FileWriter please = new FileWriter(path + "\\madlib.txt");
        please.write("St. Patrick was born and raised in <location> until he was kidnapped by <adjective> Irish <profession> at the age of sixteen. St. Patrick was credited with driving all the <plural noun> out of, and bringing <noun> to Ireland. Legend says that his <noun> was preserved after his death for protection against the evil eye. Contrary to today's custom, the original color of St. Patrick's <noun> was <color> not green. St. Patrick's Day is celebrated in America in many <adjective> ways. There are <plural noun> in almost every major U.S. <noun>. The city of Chicago dyes it's <noun> green every year, and certain <sport> teams wear St. Patrick's Day <plural noun>. Traditionally, St. Patrick's Day celebrators in America wear <color> to keep from getting <present tense verb>. The phrase Erin Go Bragh is Gaelic for <two word phrase>. Two of the most famous Irish ballads of all-time are '<name> Boy' and 'When Irish <plural noun> are <verb ending in ing>. A traditional St. Patrick's Day dinner pairs <noun> with <noun>. Also consumed on this day are Jameson's Irish <noun> and Guinness <noun>. It is considered lucky to find a <adjective> clover on St. Patrick's Day and to search for the end of a <location> to find the pot of <noun> left by a <adjective> leprechaun.");
        please.close();
        System.out.print("Input file name? (Say madlib.txt there isn't another one) ");
        String FileName = sc1.next();
        FileName = "\\"+FileName;
        if (FileName.contains("lazy")) {
            MadLib = new File(path + "\\madlib.txt");
            Scanner sc2 = new Scanner(MadLib);
            String text = sc2.useDelimiter("\\A").next();
            text = text.replaceAll("<[^>]++>", "lazy");
            System.out.println("How fast?");
            speed = sc1.nextInt();
            System.out.println("The story is: ");
            for(int i = 0; i < text.length(); i++){
                System.out.printf("%c", text.charAt(i));
                try {
                    Thread.sleep(speed);
                }
                catch(InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            System.exit(0);
        }
        MadLib = new File(path + FileName);
        Scanner sc2 = new Scanner(MadLib);

        //converts stuff from file into string
        String text = sc2.useDelimiter("\\A").next();

        
        //all of this pain just to be able to count how many blanks there are
        String[] tempStrings = text.split("");
        String[] mStrings = new String[text.length()];
        for (int i = 0; i < text.length(); i++) {
            mStrings[i] = tempStrings[i];
        }
        for (int i = 0; i < mStrings.length; i++) {
            if (mStrings[i].contains("<")) {
                blanks++;
            }
        }

        //method
        text = GiveWords(text, sc1, blanks);
            
        //print story
        System.out.println("\nThe story is: ");
        try {
            Thread.sleep(600);
        }
        catch (Exception E) {
            System.out.println("why");
        }

        //typewriter text
        for(int i = 0; i < text.length(); i++){
            System.out.printf("%c", text.charAt(i));
            try {
                Thread.sleep(10);
            }
            catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        }
        //close scanners
        sc1.close();
        sc2.close();
    }

    public static String GiveWords(String text, Scanner sc1, int blanks) {
        //variables
        int border1 = 0;
        int border2 = 0;
        String TempText = "";

        for (int i = 0; i < blanks; i++) {
            //self explanatory
            border1 = text.indexOf("<");
            border2 = text.indexOf(">");
            //sets text to whatever is inside <>, regex was annoying and would let me define something inside of <>
            TempText = text.substring(border1+1, border2);
            //if statements to make sure grammar is right
            if (!TempText.contains("adjective")) {
                System.out.printf("Please enter a %s: ", TempText);
                text = text.replaceFirst("<[^>]++>", sc1.next());
            }
            else {
                System.out.printf("Please enter an %s: ", TempText);
                text = text.replaceFirst("<[^>]++>", sc1.next());
            }
        }
        return text;
        
    }
}
