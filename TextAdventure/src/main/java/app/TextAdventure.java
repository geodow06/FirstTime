package app;

public class TextAdventure {

	public static void main(String[] args) {

		game(GameData.difficulty);
	}

	public static void game(int size) {

		UserDecisions.decisionMaking(size);
		while (!GameData.gameComplete) {
			Locations.locations(GameData.local, GameData.goal, Environment.generateEnvironment(size, 0),
					Environment.generateEnvironment(size, 1), Environment.generateEnvironment(size, 2),
					Environment.generateEnvironment(size, 2));
			Movement.movePlayer(GameData.gameComplete, GameData.local);

		}
	}

}
