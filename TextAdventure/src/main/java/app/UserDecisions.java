package app;

import java.util.Random;
import java.util.Scanner;

public class UserDecisions {
	public static void decisionMaking(int size) {
		Random rand = new Random();
		Scanner s = new Scanner(System.in);
//		int difficulty = s.nextInt();
		while (!GameData.decisionMade) {

			System.out.println("would you like to have a random position y/n");
			String decision = s.nextLine();

			if (decision.equals("y")) {

				GameData.local[0] = rand.nextInt(size);
				GameData.local[1] = rand.nextInt(size);

				GameData.decisionMade = true;
			} else if (decision.equals("n")) {

				System.out.println("dont play then");
				System.out.println("only kidding enter your x position");
				int xPosition = s.nextInt();
				GameData.local[0] = xPosition;
				System.out.println("your y position");
				int yPosition = s.nextInt();
				GameData.local[1] = yPosition;

				GameData.decisionMade = true;
			} else {
				System.out.println("stop trying to break my code and enter y/n");
			}
			GameData.goal[0][0] = rand.nextInt(size);
			GameData.goal[0][1] = rand.nextInt(size);
		}
	}
}
