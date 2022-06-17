import java.util.*;

public class SortedSquaredArray {

	  public static int[] sortedSquaredArray(int[] array) {
		    // Write your code here.
		  int[] newArray = new int[array.length];
		  for (int i = 0; i < array.length; i++) {
			  newArray[i] = array[i] * array[i];
		  }
		  Arrays.sort(newArray);
		    return newArray;
		  }
	  
	  public static void main(String[] Args) {
		  //Test Case
		  int[] array = {1, 2, 3, 5, 6, 8, 9};
		  int[] result = sortedSquaredArray(array);
		  System.out.println(Arrays.toString(result));
		  
	  }
}
