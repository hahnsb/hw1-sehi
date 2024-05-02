import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        //String timeOfDay = EnglishTimeOfDay.tellTimeOfDay(12);
        System.out.println("Enter a word and I will tell you if it's a palindrome: ");

        String word = scnr.nextLine();
        if( palindromeCheck( word )){
            System.out.println( "It's a palindrome!");
        }
        else{
            System.out.println( "It's not a palindrome :(");
        }


        scnr.close();
    }//closes main method

    public static boolean palindromeCheck(String pal){
        //puts in variable for readability's sake
        int length = pal.length() - 1;

        //loop through string
        for( int i = 0; i < length; i++) {
            //compare current character with its mirror - if same, proceed
            if( pal.charAt(length - i) == pal.charAt(i) ){
                //if reach end of string, must be palindrome
                if( i == (length-1) ){
                    return true;
                }//closes final check
                //if not end of string, but match, go to next character
                continue;
            }//closes mirror check
            //if not same, break and return false
            break;
        }//closes for loop
        // not palindrome :(
        return false;
    }//closes palindromeCheck

}//closes main.Main class