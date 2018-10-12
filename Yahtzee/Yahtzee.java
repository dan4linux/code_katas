/**
 * @author Dan Swanson
 * Refactored 20181009 
 *
 */
public class Yahtzee {

	protected int[] dice;

	/**
	 * Deprecated constructor that used internal objects for deprecated methods
	 * @param d1 value for dice 1
	 * @param d2 value for dice 2
	 * @param d3 value for dice 3
	 * @param d4 value for dice 4
	 * @param d5 value for dice 5
	 */
	@Deprecated
	public Yahtzee(int d1, int d2, int d3, int d4, int d5) {
		dice = new int[5];
		dice[0] = d1;
		dice[1] = d2;
		dice[2] = d3;
		dice[3] = d4;
		dice[4] = d5;
	}

	/**
	 * Returns the sum of the ones
	 * @param d1 value for dice 1
	 * @param d2 value for dice 2
	 * @param d3 value for dice 3
	 * @param d4 value for dice 4
	 * @param d5 value for dice 5
	 * @return sum of the ones
	 */
	public static int ones(int d1, int d2, int d3, int d4, int d5) {
		return ScoringUtil.sumMatching(1, d1, d2, d3, d4, d5);
	}

	/**
	 * 
	 * @param d1 value for dice 1
	 * @param d2 value for dice 2
	 * @param d3 value for dice 3
	 * @param d4 value for dice 4
	 * @param d5 value for dice 5
	 * @return sum of the twos
	 */
	public static int twos(int d1, int d2, int d3, int d4, int d5) {
		return ScoringUtil.sumMatching(2, d1, d2, d3, d4, d5);
	}

	/**
	 * 
	 * @param d1 value for dice 1
	 * @param d2 value for dice 2
	 * @param d3 value for dice 3
	 * @param d4 value for dice 4
	 * @param d5 value for dice 5
	 * @return sum of the threes
	 */
	public static int threes(int d1, int d2, int d3, int d4, int d5) {
		return ScoringUtil.sumMatching(3, d1, d2, d3, d4, d5);
	}

	/**
	 * 
	 * @param d1 value for dice 1
	 * @param d2 value for dice 2
	 * @param d3 value for dice 3
	 * @param d4 value for dice 4
	 * @param d5 value for dice 5
	 * @return sum of the fours
	 */
	public static int fours(int d1, int d2, int d3, int d4, int d5) {
		return ScoringUtil.sumMatching(4, d1, d2, d3, d4, d5);
	}

	/**
	 * 
	 * @param d1 value for dice 1
	 * @param d2 value for dice 2
	 * @param d3 value for dice 3
	 * @param d4 value for dice 4
	 * @param d5 value for dice 5
	 * @return sum of the fives
	 */
	public static int fives(int d1, int d2, int d3, int d4, int d5) {
		return ScoringUtil.sumMatching(5, d1, d2, d3, d4, d5);
	}

	/**
	 * 
	 * @param d1 value for dice 1
	 * @param d2 value for dice 2
	 * @param d3 value for dice 3
	 * @param d4 value for dice 4
	 * @param d5 value for dice 5
	 * @return sum of the sixes
	 */
	public static int sixes(int d1, int d2, int d3, int d4, int d5) {
		return ScoringUtil.sumMatching(6, d1, d2, d3, d4, d5);
	}

	// Backwards compatibility
	/**
	 * @see {@link #fours(int, int, int, int, int)}
	 * @return the sum of the fours 
	 */
	@Deprecated
	public int fours() {
		return ScoringUtil.sumMatching(4, dice);
	}

	// Backwards compatibility
	/**
	 * @see {@link #fives(int, int, int, int, int)}
	 * @return the sum of the fives 
	 */
	@Deprecated
	public int fives() {
		return ScoringUtil.sumMatching(5, dice);
	}

	// Backwards compatibility
	/**
	 * @see {@link #sixes(int, int, int, int, int)}
	 * @return the sum of the sixes 
	 */
	@Deprecated
	public int sixes() {
		return ScoringUtil.sumMatching(6, dice);
	}

	/**
	 * Sum the matching dice if exactly 2 dice match
	 * @param d1 value for dice 1
	 * @param d2 value for dice 2
	 * @param d3 value for dice 3
	 * @param d4 value for dice 4
	 * @param d5 value for dice 5
	 * @return the sum of the matching dice
	 */
	public static int score_pair(int d1, int d2, int d3, int d4, int d5) {
		return ScoringUtil.sumIfTalliesIs(2, d1, d2, d3, d4, d5);
	}

	/**
	 * Sum the matching dice if exactly 3 dice match
	 * @param d1 value for dice 1
	 * @param d2 value for dice 2
	 * @param d3 value for dice 3
	 * @param d4 value for dice 4
	 * @param d5 value for dice 5
	 * @return the sum of the matching dice
	 */
	public static int three_of_a_kind(int d1, int d2, int d3, int d4, int d5) {
		return ScoringUtil.sumIfTalliesIs(3, d1, d2, d3, d4, d5);
	}

	/**
	 * Sun the matching dice if exactly 4 dice match 
	 * @param d1 value for dice 1
	 * @param d2 value for dice 2
	 * @param d3 value for dice 3
	 * @param d4 value for dice 4
	 * @param d5 value for dice 5
	 * @return the sum of the matching dice
	 */
	public static int four_of_a_kind(int d1, int d2, int d3, int d4, int d5) {
		return ScoringUtil.sumIfTalliesIs(4, d1, d2, d3, d4, d5);
	}

	/**
	 * Sum the matching dice if two pair are found
	 * @param d1 value for dice 1
	 * @param d2 value for dice 2
	 * @param d3 value for dice 3
	 * @param d4 value for dice 4
	 * @param d5 value for dice 5
	 * @return the sum of the matching dice
	 */
	public static int two_pair(int d1, int d2, int d3, int d4, int d5) {
		int[] counts = ScoringUtil.tallyDice(d1, d2, d3, d4, d5);
		int pairsCount = 0;
		int score = 0;
		for (int i = 5; i >= 0; i--) {
			if (counts[i] == 2) {
				pairsCount++;
				score += (i+1);
			}
		}
		if (pairsCount == 2)
			return score * 2;
		else
			return 0;
	}

	/**
	 * Return score if all dice are consecutively numbered starting with 1
	 * @param d1 value for dice 1
	 * @param d2 value for dice 2
	 * @param d3 value for dice 3
	 * @param d4 value for dice 4
	 * @param d5 value for dice 5
	 * @return 0 is not a small straight or 15 if it is
	 */
	public static int smallStraight(int d1, int d2, int d3, int d4, int d5) {
		return ScoringUtil.getStraightId(d1, d2, d3, d4, d5) == 1 ? 15 : 0;
	}

	/**
	 * Return score if all dice are consecutively numbered ending with 6
	 * @param d1 value for dice 1
	 * @param d2 value for dice 2
	 * @param d3 value for dice 3
	 * @param d4 value for dice 4
	 * @param d5 value for dice 5
	 * @return 0 is not a large straight or 20 if it is
	 */
	public static int largeStraight(int d1, int d2, int d3, int d4, int d5)	{
		return ScoringUtil.getStraightId(d1, d2, d3, d4, d5) == 2 ? 20 : 0;
	}

	/**
	 * Looks for a full house (3 of one value and 2 of another)
	 * @param d1 value for dice 1
	 * @param d2 value for dice 2
	 * @param d3 value for dice 3
	 * @param d4 value for dice 4
	 * @param d5 value for dice 5
	 * @return the sum of the dice or 0 if not a full house
	 */
	public static int fullHouse(int d1, int d2, int d3, int d4, int d5)	{
		boolean pair = false;
		int pairIndex = 0;
		boolean threeOfAKind = false;
		int threeOfAKindIndex = 0;
		
		int[] tallies = ScoringUtil.tallyDice(d1, d2, d3, d4, d5);

		for (int i = 0; i != 6; i++) {
			switch (tallies[i]) {
				case 2:
					pair = true;
					pairIndex = i+1; // 
					break;
				case 3:
					threeOfAKind = true;
					threeOfAKindIndex = i+1;
					break;
				default:
					// sux2beyou
			}
			
			if (pair && threeOfAKind) {
				return (pairIndex * 2) + (threeOfAKindIndex * 3);
			}
		}

		return 0;
	}

	/**
	 * Counts the value for the "chance" score box
	 * @param d1 value for dice 1
	 * @param d2 value for dice 2
	 * @param d3 value for dice 3
	 * @param d4 value for dice 4
	 * @param d5 value for dice 5
	 * @return count of all dice
	 */
	public static int chance(int d1, int d2, int d3, int d4, int d5) {
		return d1 + d2 + d3 + d4 + d5;
	}

	/**
	 * Safely accepts the values for the dice and returns the score for a yahtzee or 0 if not
	 * @param d1 value for dice 1
	 * @param d2 value for dice 2
	 * @param d3 value for dice 3
	 * @param d4 value for dice 4
	 * @param d5 value for dice 5
	 * @return 0 for no yahtzee or 50 for yahtzee
	 */
	public static int yahtzee(int d1, int d2, int d3, int d4, int d5) {
		int[] counts = new int[6];
		for (int die : new int[] { d1, d2, d3, d4, d5 }) 
			counts[die-1]++;
		for (int i = 0; i != 6; i++)
			if (counts[i] == 5)
				return 50;
		return 0;
	}
	
	/**
	 * Unsafely accepts the values for the dice
	 * @see {@link #yahtzee(int, int, int, int, int)} 
	 * @param dice
	 * @return 0 for no yahtzee or 50 for yahtzee
	 */
	@Deprecated
	public static int yahtzee(int... dice){
		if (dice.length != 5) {
			throw new ArrayIndexOutOfBoundsException("Requires (5) - Invalid number of dice specified: "+dice.length);
		}
		return yahtzee(dice[0], dice[1], dice[2], dice[3], dice[4]);
	}
}



