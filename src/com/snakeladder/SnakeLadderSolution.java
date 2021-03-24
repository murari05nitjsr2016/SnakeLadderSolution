package com.snakeladder;

import java.util.Random;

public class SnakeLadderSolution {
	public static void main(String[] args){
		System.out.println("Welcome in snake ladder game");
		int position = 0;
		//this fun is used for getting random no.
		Random rand = new Random();
		int diceValue = rand.nextInt(6)+1;
		System.out.println(diceValue);
	}

}