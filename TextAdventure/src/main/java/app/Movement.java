package app;

import java.util.Scanner;

public class Movement {

	public static void movePlayer(boolean i, int[] local) {
		if (!i) {
			Scanner s2 = new Scanner(System.in);
			System.out.println("What move would you like to make next");
			String nextMove = s2.nextLine();

			if (nextMove.equals("n") || nextMove.equals("north") || nextMove.equals("up")) {
				local[1]++;
				System.out.println("move north");
			}
			if (nextMove.equals("e") || nextMove.equals("east") || nextMove.equals("right")) {
				local[0]++;
				System.out.println("move east");
			}
			if (nextMove.equals("s") || nextMove.equals("south") || nextMove.equals("down")) {
				local[1]--;
				System.out.println("move south");
			}
			if (nextMove.equals("w") || nextMove.equals("west") || nextMove.equals("left")) {
				local[0]--;
				System.out.println("move west");
			}
		} else {

		}

	}
	// public static void moveMonster(int[] ){
	// }
}
