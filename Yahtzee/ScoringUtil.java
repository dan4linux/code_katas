/**
 * @author Dan Swanson
 * Refactored 20181009 
 *
 */
public class ScoringUtil {
	
	/**
	 * Sums the dice that match the given value
	 * @param match 
	 * @param dice 
	 * @return the sum of the matching dice
	 */
	public static int sumMatching(int match, int... dice) {
		int sum = 0;
		for (int val : dice) {
            if (match == val) {
            	sum+= val;
            }
		}
		return sum;
	}
	
	/**
	 * Creates a "value minus 1" keyed array with the counts of the values
	 * @param d1 value for dice 1
	 * @param d2 value for dice 2
	 * @param d3 value for dice 3
	 * @param d4 value for dice 4
	 * @param d5 value for dice 5
	 * @return the array
	 */
	public static int[] tallyDice(int d1, int d2, int d3, int d4, int d5) {
		int[] counts = new int[6];
		counts[d1-1]++;
		counts[d2-1]++;
		counts[d3-1]++;
		counts[d4-1]++;
		counts[d5-1]++;
		return counts;
	}

	/**
	 * Sum the values that match the given value
	 * @param match the value to match
	 * @param d1 value for dice 1
	 * @param d2 value for dice 2
	 * @param d3 value for dice 3
	 * @param d4 value for dice 4
	 * @param d5 value for dice 5
	 * @return the sum of the matching values
	 */
	public static int sumIfTalliesIs(int match, int d1, int d2, int d3, int d4, int d5) {
		int[] tallies = tallyDice(d1, d2, d3, d4, d5);
		for (int i = 5; i >= 0; i--) {
			if (tallies[i] == match) {
				return (i+1) * match;
			}
		}
		return 0;
	}

	/**
	 * @param d1 value for dice 1
	 * @param d2 value for dice 2
	 * @param d3 value for dice 3
	 * @param d4 value for dice 4
	 * @param d5 value for dice 5
	 * @return 0=not straight, 1 = small, 2 = large;
	 */
	public static int getStraightId(int d1, int d2, int d3, int d4, int d5) {
		int[] tallies = ScoringUtil.tallyDice(d1, d2, d3, d4, d5);
		if (tallies[1] == tallies[2] && tallies[2] == tallies[3] && tallies[3] == tallies[4]) {
			if (tallies[0] == 1) {
				return 1;
			} else if (tallies[4] == 1) {
				return 2;
			}
		}
		return 0;
	}

	
}
