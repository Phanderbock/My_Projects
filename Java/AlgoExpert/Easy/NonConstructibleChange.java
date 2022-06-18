import java.util.*;


public class NonConstructibleChange {

	public static void main(String[] args) {
		int[] coins = {5, 7, 1, 1, 2, 3, 22};
		int result = minChange(coins);
		System.out.println(result);
	}

	public static int minChange(int[] coins) {
		Arrays.sort(coins);
		
		int change = 0;
		for(int coin : coins) {
			if(coin > change + 1) {
				return change + 1;
			}
			
			change += coin;
		}
		
		return change += 1;
	}
	
}
