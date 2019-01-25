package app;

import java.util.Random;

// given more time would utilise superclass for different environment objects

public class Environment {
	
	static int[][] monster = { { 4, 4 }, { 0, 0 } };
	static int[][] pit = { { 0, 0 }, { 0, 0 } };
	static int[][] forest = { { 0, 0 }, { 0, 0 } };
	static int[][] lake = { { 0, 0 }, { 0, 0 } };

	public static int[][] generateEnvironment(int size, int o) {

		forest = generateForest(size);
		pit = generatePit(size);
		monster = generateMonster(size);
		lake = generateLake(size);
		if (o == 0) {
			return forest;
		} else if (o == 1) {
			return monster;
		} else if (o == 2) {
			return pit;
		} else {
			return lake;
		}

	}

	public static int[][] generateForest(int size) {
		Random rand = new Random();
		int[][] forestBoundaries = { { rand.nextInt(size / 2), rand.nextInt(size / 2) },
				{ rand.nextInt(size / 2), rand.nextInt(size / 2) } };

		return forestBoundaries;

	}

	public static int[][] generateMonster(int size) {
		Random rand = new Random();
		int[][] monsterPosition = { { rand.nextInt(size), rand.nextInt(size) }, { 0, 0 } };
		return monsterPosition;
	}

	public static int[][] generatePit(int size) {
		Random rand = new Random();
		int[][] pitPosition = { { rand.nextInt(size), rand.nextInt(size) }, { 0, 0 } };
		return pitPosition;
	}

	public static int[][] generateLake(int size) {
		Random rand = new Random();
		int[][] lakePosition = { { rand.nextInt(size), rand.nextInt(size) }, { 0, 0 } };
		return lakePosition;
	}

}
