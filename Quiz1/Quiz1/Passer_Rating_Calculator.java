package Quiz1;

import java.util.Scanner;

public class Passer_Rating_Calculator {

	public static void main(String[] args) {
		Scanner user_input = new Scanner(System.in);

		int completions;
		System.out.print("How many completions?");
		completions = user_input.nextInt();

		int attempts;
		System.out.print("How many passes attempted?");
		attempts = user_input.nextInt();

		int yards;
		System.out.print("How many yards?");
		yards = user_input.nextInt();

		int touchdowns;
		System.out.print("How many touchdowns?");
		touchdowns = user_input.nextInt();

		int interceptions;
		System.out.print("How many interceptions?");
		interceptions = user_input.nextInt();

		double a;
		a = (((double) completions / (double) attempts) - .3) * (5);

		double b;
		b = (((double) yards / (double) attempts) - 3) * .25;

		double c;
		c = (((double) touchdowns / (double) attempts) * 20);

		double d;
		d = 2.375 - (((double) interceptions / (double) attempts) * 25);

		double passer_rating;
		passer_rating = ((a + b + c + d) / 6) * 100;

		System.out.println("Passer rating is " + passer_rating);
	}
}
