/*
 * StringToolkit Class
 * 
 * Submitted By: De Limios, Franz Jearson, Dv
 * 
 * Date Submitted: 08/01/2025
 */

package toolkit;

import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane; 
import java.lang.StringBuilder;

public class StringToolkit {
	String passedString;				
	
	StringToolkit (String passedString){
		this.passedString = passedString;
	}
	
	String reverse() {					//reverses provided string 
		
		String reversedString = "";
		int strLen = passedString.length();
		
		for(int i = 0; i < strLen; i++) {
			reversedString = reversedString + passedString.charAt(strLen -(i + 1));
		}
		
		return reversedString;
	}
	
	boolean isPalindrome() {			//checks if palindrome (excludes usual special characters and spaces)
		
		String compare1 = passedString.toLowerCase().replaceAll("[ !,.?'\"-/]", "");
		String compare2 = reverse().toLowerCase().replaceAll("[ !,.?'\"-/]", "");
		//boolean state = compare1.equals(compare2);
		return compare1.equals(compare2);
	}
	
	boolean isAnagram(String target) {	//checks if anagram (excludes usual special characters and spaces)
		
		String compare1 = passedString.toLowerCase().replaceAll("[ !,.?'\"-/]", "");
		String compare2 = target.toLowerCase().replaceAll("[ !,.?'\"-/]", "");
		
		char[] convertedPassedString = compare1.toCharArray();
		char[] convertedTargetString = compare2.toCharArray();

		Arrays.sort(convertedTargetString);
		Arrays.sort(convertedPassedString);
		
		return Arrays.equals(convertedPassedString, convertedTargetString);
	}
	
	int countWords(){					//counts the words of provided string
		
		if(passedString.isEmpty() == true) return 0;
		char[] convertedPassedString = passedString.toCharArray();
		int count = 1;
		for(int i = 0; i < passedString.length(); i++) {
			if (convertedPassedString[i] == ' ') count++;
		}
		return count;
	}
	
	int characterCount() {				//counts the characters of provided string (excluding white spaces)
		
		int strLen = passedString.length();
		int count = 0;
		for(int i = 0; i < strLen; i++) {
			if(passedString.charAt(i) != ' ') {
				count++;
			}
		}
		return count;
	}
	
	void findSubstring(String target) {	//finds and locates all occurrences of the target substring
		
		/* XXX: The GUI is attached to the method itself instead of returning the values
		 * 		of the ArrayList of the found substring indexes and the count of found substrings.*/
		
		
		int lastIndex = 0;					//tracks the index of the last found substring
		int count = 0;						//tracks the number of found substrings
		
		ArrayList<Integer> indexOfFoundTargets = new ArrayList<Integer>();		//stores the found indexes
		while(lastIndex != -1) {
			
			lastIndex = passedString.indexOf(target, lastIndex);
			 
			if(lastIndex != -1) {
				count++;
				indexOfFoundTargets.add(lastIndex);
				lastIndex += target.length();
			}
			
		}
		
		JOptionPane.showMessageDialog(null, "The substring \""  +target+  "\" is found " +count+ " times.");
		
		StringBuilder messageContent = new StringBuilder();		
		
		for (Integer i : indexOfFoundTargets) {	
			messageContent.append("Substring found starting at index: "+ i +"\n");
		} //builds string by looping to display the messageDialog of found indexes in a single window.
		
		JOptionPane.showMessageDialog(null, messageContent);
	}
	
	String toLowerString() {				//Lowercases the whole string.
		
		return passedString.toLowerCase();
	}
	
	String toUpperString() {				//Uppercases the whole string.
		
		return passedString.toUpperCase();
	}
	
	String removeVowels() {					//removes vowels of the string.
		
		return passedString.replaceAll("[aeiou]", "");
	}
	
	String removeConsonants() {				//removes consonants of the string.
		
		return passedString.replaceAll("[^aeiou !,.?'\"-/]", "");
	}
}
