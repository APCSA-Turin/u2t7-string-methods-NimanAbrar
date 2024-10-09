import java.util.Scanner;
public class LabRunner {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first word: ");
        String str1 = scan.nextLine();
        System.out.println("Enter the second word: ");
        String str2 = scan.nextLine();
        if (str1.length() > str2.length()) {
            System.out.println(str1 + " is greater than " + str2);
        } else { 
            System.out.println(str2 + " is greater than " + str1);
        }
        String firstHalfOfStr1 = str1.substring(0,str1.length()/2);
        String secondHalfOfStr1 = str1.substring(str1.length()/2);
        String firstHalfOfStr2 = str2.substring(0,str2.length()/2);
        String secondHalfOfStr2 = str2.substring(str2.length()/2);
        System.out.println("First half: "+firstHalfOfStr1);
        System.out.println("Second half: "+secondHalfOfStr1);
        System.out.println("First half: "+firstHalfOfStr2);
        System.out.println("Second half: "+secondHalfOfStr2);
        int index = str1.indexOf(str2);
        if (index == -1) {
            System.out.println("The second word is not found in the first.");

        } 
        else {
            System.out.println(str2 + " is found in " + str1 + " at index " + str1.indexOf(str2));
        }
        scan.close();
    }
}