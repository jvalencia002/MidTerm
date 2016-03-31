/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dicegame;

/**
 *
 * @author Joeyvalencia
 */
import java.util.Scanner; 
 
 
 public class DiceGame { 
 	public static void main(String[] args) { 
 		int Dice; 
 		int Comp; 
 		int Play = 0; 
 		int CountTurns = 0; 
		int CountWins = 0; 
 		int WinPercent; 
 		int CountEvenGuesses = 0; 
 		int CountOddDice = 0; 
		int EvenPercent; 
 		int OddPercent; 
 		String turn = "yes"; 
 		String PlayerGuess; 
 		int Player = 0; 
 
 		Scanner Input = new Scanner(System.in); 
 		 
 		System.out.println( 
 				"Lets play dice?"); 
 		while (turn.toLowerCase().equals("yes")) { 
 		System.out.println("Ready? "); 
 		Dice = 0 + (int) (Math.random() * 6); 
 		System.out.print("guess odd or even: "); 
 		PlayerGuess = Input.next(); 
 		// 1=odd, 0=even 


 		if (PlayerGuess.toLowerCase().equals("odd")) 
 			Player = 1; 
 		else if (PlayerGuess.toLowerCase().equals("even")) 
 			Player = 0; 
 
 
 		System.out.println("number rolled:" + Dice); 
 		Comp = Dice % 2; 
 		if (Comp == 0) 
 			CountEvenGuesses++; 
 		else 
 			CountOddDice++; 
 		if (Player == Comp) { 
 			System.out.println("correct!"); 
 			CountWins++; 
 		} else 
			System.out.println("incorrect"); 
 		CountTurns++; 
 		OddPercent = (CountOddDice * 100) / CountTurns; 
 		EvenPercent = (CountEvenGuesses * 100) / CountTurns; 
 		System.out.println("Percentage odd: " + OddPercent); 
 		System.out.println("Percentage even: " + EvenPercent); 
 		System.out.println("Number of games played: " + CountTurns); 
 		WinPercent = (CountWins * 100) / CountTurns; 
 		System.out.println("percentage wins: " + WinPercent); 
 		System.out.println("Would you like to play again?(y/n): "); 
 		turn = Input.next(); 
 		} 
 	} 
 } 