import java.util.*;
public class TwoNumberSum {
	
	//This is the code to run the test case
	public static void main(String [] args) {
		int[] array = {3, 5, -4, 8, 11, 1, -1, 6};
		int targetSum = 10;
		int[] result = twoNumberSum(array, targetSum);
		System.out.println(Arrays.toString(result));
	}
		//This is the actual submission code to match the contents to target.
		  public static int[] twoNumberSum(int[] array, int targetSum) {
			  for (int i = 0; i < array.length - 1; i++) {
				  int firstNum = array[i];
				  for (int j = i + 1; j < array.length; j++) {
					  int secondNum = array[j];
					  if (firstNum + secondNum == targetSum) {
						  return new int[] {firstNum,secondNum};
					  }
				  }
		  }
			  
			  return new int[0];
		  }
		}

