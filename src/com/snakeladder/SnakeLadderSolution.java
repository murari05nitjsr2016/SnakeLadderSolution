package com.snakeladder;

import java.util.Random;

public class SnakeLadderSolution {

	public static void main(String[] args){
		System.out.println("Welcome in snake ladder game");
		final int WINNING_POSITION = 100;
		int diceRollCount = 0;
		int position = 0;
		System.out.println("initial position "+position);
		while(position <= WINNING_POSITION)
		{
			//this fun is used for getting random no.
			Random rand = new Random();
			int diceValue = rand.nextInt(6)+1;
			System.out.println("dice value"+diceValue);
			int option=rand.nextInt(3);
			System.out.println("option is "+option);
			if(option == 0)
			{
				//System.out.println("no play so your position is same as previous ");
				System.out.println("position  "+position+" , "+"diceRollCount  "+diceRollCount);
			}
			else if(option == 1)
			{
				diceRollCount++;
				//System.out.println("you got a ladder,your position will increment by dice value ");
				if(position + diceValue <= WINNING_POSITION)
				{
					position = position + diceValue;
					System.out.println("position  "+position+" , "+"diceRollCount  "+diceRollCount);

				}

				//System.out.println(position);
				else
					System.out.println("position  "+position+" , "+"diceRollCount  "+diceRollCount);

			}
			else
			{   diceRollCount++;
			//System.out.println("you got a snake,your position will decrement by dice value ");
			position = position - diceValue;
			System.out.println("position  "+position+" , "+"diceRollCount  "+diceRollCount);

			System.out.println(position);
			if (position < 0)
			{
				position = 0;
				System.out.println("position  "+position+" , "+"diceRollCount  "+diceRollCount);

			}

			}
		}
		System.out.println(diceRollCount);

	}

}