package beaconsOfGondor;

import java.util.Set;
import java.util.HashSet;

public class LocateMinasTirith {

	/**
	 * 
	 * @param numLocations
	 *            the number of cities in the kingdom, 0 < numCities < 50.
	 * @param roadNetwork
	 *            represents the roads connecting different cities in the
	 *            kingdom. roadNetwork.length( ) is equal to
	 *            numLocations*numLocations. For all i, j such that 0 <= i <
	 *            numLocations and 0 <= j < numLocations, the character at index
	 *            numLocations*i+j in this string indicates if there is a road
	 *            between cities i and j (1 if there is and 0 if there is no
	 *            road). For all i such that 0 <= numLocations < i, the
	 *            character at index numLocations*i+i is 1.
	 * @return a set of city indices with the following condition: the maximum
	 *         travel time from a city (represented by its index) is as small as
	 *         possible. The travel time from one city to another is the number
	 *         of roads to traverse to get from one to the other. For a given
	 *         city, its maximum travel time is the time to reach that city that
	 *         is farthest from it in terms of number of roads traversed.
	 */
	public static Set<Integer> getGoodLocations(int numLocations, String roadNetwork) {
		// TODO: Implement this method
		return null; // change this
	}

	public static void main(String[] args) {

		// String connectivityInfo = "1101 1111 0111 1111".replaceAll("\\s","");
		// String connectivityInfo = "11100 11100 11111 00111
		// 00111".replaceAll("\\s","");
		String connectivityInfo = "10101 01110 11110 01111 10011".replaceAll("\\s", "");
		// String connectivityInfo = "110000 111000 011110 001111 000110
		// 000101".replaceAll("\\s", "");
		int numLocations = (int) Math.sqrt(connectivityInfo.length());
		Set<Integer> goodLocations = getGoodLocations(numLocations, connectivityInfo);

		for (Integer l : goodLocations)
			System.out.println(l);

	}

}
