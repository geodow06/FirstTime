package app;

public class GameData {
	static int[] local = { 3, 5 };
	static int[] magnitude = { 0, 0 };
	static int[] magnitudeMonster = { 0, 0 };
	static int[] magnitudePit = { 0, 0 };
	static int[] magnitudeLake = { 0, 0 };
	static int[][] goal = { { 6, 6 }, { 0, 0 } };
	static int dimension = 2;
	static double distance = 0;
	static double distanceMonster = 0;
	static double distancePit = 0;
	static double distanceLake = 0;
	static String nextMove = "";
	static boolean gameComplete = false;
	static boolean decisionMade = false;
	static int difficulty = 10;
	static int xPosition = 0;
	static int yPosition = 0;

}
