//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner
fun main() {
    // Create a Scanner object with an identifier getData that takes in information
    // from System.in (import Scanner, then "val reader = Scanner(System.`in`)")
    // UNTRANSLATED: We'll use readline later to get the data.

    // Ask the user for a word
    val reader = Scanner(System.`in`)
    // Declare a String named enteredTerm and initialize it to the next word
    // read in from getData
    val enteredTerm = reader.next()

    // Clear out the buffer by calling nextLine on getData. UNTRANSLATED.
    reader.nextLine()
    // Declare a String with an identifier convertedTerm, initialized to an empty String
    var convertedTerm = ""
    // Declare a String with an identifier firstLetter, initialized to a substring of
    // enteredWord starting at index 0 and ending at index 1. We'll use substring as normal
    val firstLetter = enteredTerm.substring(0,1)
    // If firstLetter is a vowel (note - this is five conditions using OR logic)
        //Set convertedTerm to enteredterm concatenated with "yay"
    // otherwise
        // Set convertedTerm to a substring of enteredTerm from index 1 to the end, concatenated
        // with a substring of enteredTerm from index 0 to index 1, concatenated with "ay"
    // TRANSLATED: When becomes a better control structure to use here
        when (firstLetter){
            "a" -> convertedTerm = enteredTerm + "yay"
            "e" -> convertedTerm = enteredTerm + "yay"
            "i" -> convertedTerm = enteredTerm + "yay"
            "o" -> convertedTerm = enteredTerm + "yay"
            "u" -> convertedTerm = enteredTerm + "yay"
            else -> convertedTerm = enteredTerm?.substring(1) + firstLetter + "ay"
    }
    // Print that the Pig Latin Version of the enteredTerm is your convertedTerm
    println("$enteredTerm converted to pig latin is $convertedTerm")




}