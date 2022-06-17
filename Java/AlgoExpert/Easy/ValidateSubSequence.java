import java.util.Arrays;
import java.util.List;

public class ValidateSubSequence {
	// Code to run test
	public static void main(String[] args) {
		List<Integer> array = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
		List<Integer> sequence = Arrays.asList(1, 6, -1, 10);
		
		Boolean result = isValidSubsequence(array, sequence);
		System.out.print(result);
	}
	// Execution of check
	  public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
		  	int arrIdx = 0;
		    int seqIdx = 0;
		    while (arrIdx < array.size() && seqIdx < sequence.size()){
		      if (array.get(arrIdx).equals(sequence.get(seqIdx))){
		        seqIdx++;
		      }
		      arrIdx++;
		    }
		    return seqIdx == sequence.size();
		  }

}
