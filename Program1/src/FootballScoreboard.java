/* Program of Assignment #: Assignment-1 Football Scoreboard

* Programmer: Ahmad Atieh

* Due Date: 9/9/15

* COMP110-001, Fall 2015     Instructor: Prof. Kris Jordan 

* Pledge: I have neither given nor received unauthorized aid on this program

* Description: A program using a Scanner input to take the input of the user and add all the variables using integer assignment

* Input: Scanner keyboard = new Scanner(System.in) or it is a Scanner Keyboard
	
* Output:
* How many points did the Tar Heels score in each quarter of the football game?
-
-
-
-
How many points did the Blue Devils score in each quarter of the football game?
-
-
-
-
UNC's total score is: -
Duke's total score is: -
UNC won the game! (or "Duke won the game"). The difference is - (or "It was a tie.")

*/
import java.util.Scanner;

public class FootballScoreboard {

	public static void main(String[] args) {

		System.out.println("Welcome to the Football Scoreboard! ");

		int uncQuarter1, uncQuarter2, uncQuarter3, uncQuarter4;

		Scanner keyboard = new Scanner(System.in);
		System.out.println("How many points did the Tar Heels score in each quarter of the football game?");


		uncQuarter1 = keyboard.nextInt();

		uncQuarter2 = keyboard.nextInt();

		uncQuarter3 = keyboard.nextInt();
		
		uncQuarter4 = keyboard.nextInt();

		System.out.println("How many points did the Blue Devils score in each quarter of the football game?");

		int dukeQuarter1, dukeQuarter2, dukeQuarter3, dukeQuarter4;


		dukeQuarter1 = keyboard.nextInt();

		dukeQuarter2 = keyboard.nextInt();

		dukeQuarter3 = keyboard.nextInt();

		dukeQuarter4 = keyboard.nextInt();

		int uncScore, dukeScore;
		uncScore = uncQuarter1 + uncQuarter2 + uncQuarter3 + uncQuarter4;
		dukeScore = dukeQuarter1 + dukeQuarter2 + dukeQuarter3 + dukeQuarter4;
		System.out.println("UNC's total score is: " + uncScore);
		System.out.println("Duke's total score is: " + dukeScore);

		int difference;
		if (uncScore >= dukeScore) {
			difference = (uncScore - dukeScore);
		} else {
			difference = (dukeScore - uncScore);
		}

		if (uncScore > dukeScore) {
			System.out.println("UNC won the game! The difference is " + difference + " points");
		} else if (uncScore == dukeScore) {
			System.out.println("It was a tie.");

		} else {
			System.out.println("Duke won the game. The difference is " + difference + " points");
		}
	}

}
