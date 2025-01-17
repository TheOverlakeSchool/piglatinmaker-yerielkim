//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class PigLatinSentenceConverter {
    public static void main(String[] args) {

        String firstOne = "Oh Yeaaaah!";
        String secondOne = "Oh Yeaaaah!";
        String thirdOne = new String ("Oh Yeaaaah!");

        System.out.println("first equal equal second? " + (firstOne == secondOne));
        System.out.println("first equal equal third? " + (firstOne == thirdOne));
        System.out.println("second equal equal as third? " + (secondOne == thirdOne));
        System.out.println("first dot equals second? " + (firstOne.equals(secondOne)));
        System.out.println("first dot equals third? " + (firstOne.equals(thirdOne)));
        System.out.println("second dot equals as third? " + (secondOne.equals(thirdOne)));
        String fourthOne = firstOne;
        firstOne = firstOne + "!";
        System.out.println("first equal equal fourth? " + (firstOne == fourthOne));
        System.out.println("second equal equal fourth? " + (secondOne == fourthOne));

        // Create a Scanner object with an identifier getData that takes in information
        // from System.in

        // Declare a String  and initialize it to the next line
        // read in from getData

        // Declare a String as a backup of the sentence and initialize it to the String read in above

        // Declare a String for the converted Sentence, initialized to an empty String

        // Declare an int to hold the location  of the next Space, initialized to the index where
        // it finds the first space.

        // Declare Strings for the next word read in, the converted version of the word,
        // and the first letter, all initialized to empty strings


        //As long as there are not more spaces in the sentence
        
            // Define the next word as everything in the sentence from the
            // beginning to the next space.


            // Repeat the logic from PigLatinWordConverter to convert the word

            // Concatenate the converted word and a space to the converted sentence.

            // Make the entered sentence a substring of itself after the space.


            // Set the next space to the index of the next space in the sentence.

        }
        // Repeat the process a final time for the word remaining.

        // Display the converted sentence.

    }
//}
