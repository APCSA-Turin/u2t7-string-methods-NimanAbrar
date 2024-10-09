import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       int score = 0;
       System.out.println("Enter the first word: ");
       String word = scan.nextLine();
       while (score < 50) {
        System.out.println("Enter the next word: ");
       String nextWord = scan.nextLine();
        if (nextWord.compareTo(word) > 0) {
            score += 2;
            System.out.println("+2 points! Current word is alphabetically after; Score: "+score);
        }
        if (nextWord.compareTo(word) < 0) {
            score -= 5;
            System.out.println("-5 points! Current word is alphabetically before; Score: "+score);
        } 
        if (nextWord.equals(word)) {
            score -= 10;
            System.out.println("-10 points! Current word is the same as previous");
        }
        int lengthMinus2 = word.length() - 2;
        if (nextWord.substring(0,2).equals(word.substring(lengthMinus2))) {
            score += 5;
            System.out.println("+5 points! Last two words of the last word is equal to the first two words of the current word! Score: " + score);
        } 
        if (nextWord.indexOf(word.substring(0,1)) >= 0) {
            score += 3;
            System.out.println("+3 points! First word in the last word occurs in the current word! Score: " + score);
        }
        int firstWordLength = word.length();
        int secondWordLength = nextWord.length();
        if (firstWordLength == secondWordLength) {
            score += 5;
            System.out.println("+5 points! The words are the same length! Score: "+score);
        }
        word = nextWord;
        }
        System.out.println("You won! You've achieved at least 50 points!");
       }   
    }