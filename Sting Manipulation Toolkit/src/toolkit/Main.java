/*
 * Main Class
 * 
 * Submitted By: De Limios, Franz Jearson, Dv
 * 
 * Date Submitted: 08/01/2025
 */

package toolkit; 
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		int doAgain; 				// result of showConfirmDialog
		
		do{							// restarts the toolkit menu if the user wants to.
			
			stringToolkitMenu(); 	/*The totality of User Interface and Method calls for String Toolkits*/
			
			doAgain = JOptionPane.showConfirmDialog(null, "Want to do another?");
		} while(doAgain == 0);		// doAgain == 0, indicates user clicked "yes" option
		
	}
	
	
	static void stringToolkitMenu() {
		int optionInput = 0;						 		//Stores user's option input
		
		while((optionInput < 1) || (optionInput > 10)) { 		//Limits the accepting input to possible options
			
			optionInput = Integer.parseInt(JOptionPane.showInputDialog(
					"Input the operation of your liking (1-10)\n"
							+ "1. String Reversal \n"
							+ "2. Palindrome Checker \n"
							+ "3. Anagram Checker \n"
							+ "4. Word Count \n"
							+ "5. Character Count \n"
							+ "6. Substring Finder \n"
							+ "7. Lower Case Converter \n"
							+ "8. Upper Case Converter \n"
							+ "9. Vowel Remover \n"
							+ "10. Consonant Remover \n"));
	
			if ((optionInput < 1) || (optionInput > 10)) {		//Informs the user if input is invalid
				JOptionPane.showMessageDialog(null, "That is not a valid option. Try again.");
			}
			
		}
		
		String sentenceInput = JOptionPane.showInputDialog("Enter 3 sentences Input:"); //asks user for a 3-sentence string input
		
		StringToolkit manipulateString = new StringToolkit((sentenceInput));
	
		switch(optionInput) {
		
			case 1:				//reverses the string
				JOptionPane.showMessageDialog(null, "The reversed string is: \n" 
													+manipulateString.reverse());
				break;
			
			case 2:				//checks if the string is a palindrome
				JOptionPane.showMessageDialog(null, "Palindrome Checker Result: \n" 
													+manipulateString.isPalindrome());
				break;
			
			case 3:				//tests the string for anagrams
				String anagramTarget = JOptionPane.showInputDialog("Enter string to test for Anagrams:");
				JOptionPane.showMessageDialog(null, "Anagram Checker Result: \n" 
													+manipulateString.isAnagram(anagramTarget));
				break;
			
			case 4:				//counts the word of the string
				JOptionPane.showMessageDialog(null, "The word count is: \n" 
													+manipulateString.countWords());
				break;
			
			case 5:				//counts the characters excluding spaces
				JOptionPane.showMessageDialog(null, "The character count is: \n" 
													+manipulateString.characterCount());
				break;
		
			case 6:				//counts and locates all matching substrings
				String substringTarget = JOptionPane.showInputDialog("Enter string to test for Anagrams:");
												manipulateString.findSubstring(substringTarget);
				break;
			case 7:				//converts the string to lower case
				JOptionPane.showMessageDialog(null, "Lower Case Converted: \n" 
												+manipulateString.toLowerString());
				break;
			case 8:				//converts the string to upper case
				JOptionPane.showMessageDialog(null, "Upper Case Converted: \n" 
												+manipulateString.toUpperString());
				break;
			case 9:				//removes the vowels in the string
				JOptionPane.showMessageDialog(null, "Vowels Removed: \n" 
												+manipulateString.removeVowels());
				break;
			case 10:			//removes the consonants in the string
				JOptionPane.showMessageDialog(null, "Consonants Removed: \n" 
												+manipulateString.removeConsonants());
				break;	
		}
		
	}
	
	
}
