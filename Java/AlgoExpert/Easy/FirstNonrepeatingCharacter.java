import java.util.*;

public class FirstNonrepeatingCharacter {
	public int firstNonRepeatingCharacter(String string) {
		HashMap<Character, Integer> characterFrequencies = new HashMap<Character, Integer>();
		
		for (int idx = 0; idx < string.length(); idx++) {
			char character = string.charAt(idx);
			characterFrequencies.put(character, characterFrequencies.getOrDefault(character, 0) + 1);	
		}
		
		for (int idx = 0; idx < string.length(); idx++) {
			char character = string.charAt(idx);
			if (characterFrequencies.get(character) == 1) {
				return idx;
			}
		}
		return -1;
	}
}
