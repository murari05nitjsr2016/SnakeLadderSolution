package com.snakeladder;

import java.util.Random;

public class SnakeLadderSolution {
	
	public static void main(String[] args){
		System.out.println("Welcome in snake ladder game");
		final int WINNING_POSITION = 100;
		int position = 0;
		//this fun is used for getting random no.
		while(position <= WINNING_POSITION)
		{
		Random rand = new Random();
		int diceValue = rand.nextInt(6)+1;
		System.out.println(diceValue);
		int option=rand.nextInt(3);
		if(option == 0)
		{
			System.out.println("no play so your position is same as previous ");

		}
		else if(option == 1)
		{
			System.out.println("you got a ladder,your position will increment by dice value ");
			position = position + diceValue;
			System.out.println(position);
		}
		else
		{
			System.out.println("you got a snake,your position will decrement by dice value ");
			position = position - diceValue;
			System.out.println(position);
			if (position < 0)
				position = 0;

		}
		}

	}

}