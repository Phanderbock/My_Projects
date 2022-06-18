import java.util.*;

public class TournamentWinner {
	
	public static int HOME_WIN = 1;
	
	public static String tournamentWinner(
		      ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
		    // Write your code here.
			String winner = "";
			HashMap<String, Integer> scores = new HashMap<String, Integer>();
			scores.put(winner, 0);
			
			for (int i = 0; i < competitions.size(); i++) {
				ArrayList<String> competition = competitions.get(i);
				int result = results.get(i);
				
				String home = competition.get(0);
				String away = competition.get(1);
				
				String matchWinner = (result == HOME_WIN) ? home : away;
				
				updateScores(matchWinner, 3, scores);
				
				if (scores.get(matchWinner) > scores.get(winner)) {
					winner = matchWinner;
				}
			}
			
		    return winner;
		  }

	
	public static void updateScores(String team, int points, HashMap<String, Integer> scores) {
		if (!scores.containsKey(team)) {
			scores.put(team, 0);
		}
		scores.put(team, scores.get(team) + points);
	}
	
	public static void main(String[] args) {
		ArrayList<ArrayList<String>> competitions = new ArrayList<>();
		ArrayList<String> C1 = new ArrayList<>();
		ArrayList<String> C2 = new ArrayList<>();
		ArrayList<String> C3 = new ArrayList<>();
		
		C1.add("HTML");
		C1.add("C#");
		
		C2.add("C#");
		C2.add("Python");
		
		C3.add("Python");
		C3.add("HTML");
		
		competitions.add(C1);
		competitions.add(C2);
		competitions.add(C3);
		
		ArrayList<Integer> results = new ArrayList<Integer>();
		results.add(0);
		results.add(0);
		results.add(1);
		
		String champ = tournamentWinner(competitions, results);
		System.out.println(champ);
	}
}
