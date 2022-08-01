import java.util.*;

public class MergeOverlappingIntervals {
	  public int[][] mergeOverlappingIntervals(int[][] intervals) {
		    if(intervals.length <= 1) return intervals;
		    Arrays.sort(intervals, (i1, i2) -> Integer.compare(i1[0], i2[0]));

		    int[] previousInterval = intervals[0];
		    List<int[]> mergedIntervals = new ArrayList<>();

		    for(int i=1; i<intervals.length; i++){
		      int [] currentInterval = intervals[i];
		      if(previousInterval[1] >= currentInterval[0]){
		        previousInterval[1] = Math.max(currentInterval[1], previousInterval[1]);
		      } else {
		        mergedIntervals.add(previousInterval);
		        previousInterval = currentInterval;
		      }
		      if(i == intervals.length-1){
		        mergedIntervals.add(previousInterval);
		      }
		    }
		    return mergedIntervals.toArray(new int[mergedIntervals.size()][]);
		  }
		}

