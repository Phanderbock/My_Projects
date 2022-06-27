
public class RunLengthEncoding {
	public String runLengthEncoding(String string) {
		StringBuilder newString = new StringBuilder();
		char curChar = string.charAt(0);
		int count = 0;
		
		for (char c : string.toCharArray()) {
			if ( count == 9 || curChar != c) {
				newString.append(count);
				newString.append(curChar);
				curChar = c;
				count = 0;
			}
			count++;
		}
		
		if (count != 0) {
			newString.append(count);
			newString.append(curChar);
		}
		return newString.toString();
	}
}
