package app;

public class Locations {
	public static void locations(int[] m, int[][] n, int[][] f, int[][] k, int[][] l, int[][] p) {

		int sumDummy = 0;
		for (int c = 0; c < GameData.dimension; c++) {

			GameData.magnitude[c] = ((m[c] - n[0][c]) * (m[c] - n[0][c]));

		}
		sumDummy = GameData.magnitude[0] + GameData.magnitude[1];
		GameData.distance = Math.sqrt(sumDummy);

		System.out.println("You are " + GameData.distance + " Metres away from your goal.");

		for (int d = 0; d < GameData.dimension; d++) {
			GameData.magnitudeMonster[d] = ((m[d] - k[0][d]) * (m[d] - k[0][d]));

		}
		sumDummy = GameData.magnitudeMonster[0] + GameData.magnitudeMonster[1];
		GameData.distanceMonster = Math.sqrt(sumDummy);

		for (int w = 0; w < GameData.dimension; w++) {
			GameData.magnitudePit[w] = ((m[w] - l[0][w]) * (m[w] - l[0][w]));

		}
		sumDummy = GameData.magnitudePit[0] + GameData.magnitudePit[1];
		GameData.distancePit = Math.sqrt(sumDummy);

		for (int a = 0; a < GameData.dimension; a++) {
			GameData.magnitudeLake[a] = ((m[a] - p[0][a]) * (m[a] - p[0][a]));

		}
		sumDummy = GameData.magnitudeLake[0] + GameData.magnitudeLake[1];
		GameData.distanceLake = Math.sqrt(sumDummy);

		if (GameData.distancePit == 0) {
			System.out.println("you fell into a pit tough luck, look where you are going next time!");
		}

		if (GameData.distance == 0) {
			System.out.println("you found it congrats");
			GameData.gameComplete = true;
		}

		if (f[0][0] <= GameData.local[0] && GameData.local[0] <= f[0][1] && f[1][1] <= GameData.local[1]
				&& GameData.local[1] <= f[1][0]) {
			System.out.println("you ae in a forest");
		}
		if (GameData.distanceMonster <= 2) {
			System.out.println("you hear something lurking nearby");
		} else if (GameData.distanceMonster == 0) {
			System.out.println("You have been killed by Jeramiah gg");
			GameData.gameComplete = true;
		} else {
			System.out.println("but you are atleast safe");

		}

	}
}
