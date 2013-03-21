package com.crimtech.colortrail;

public class Game {
	private static final double X_PADDING = 0.05;
	private static final double Y_PADDING = 0.20;
	
	
	private int difficulty;
	private int width;
	private int height;
	
	private int numXGrids;
	private int numYGrids;
	private int numColors;
	
	
	
	public Game(int difficulty, int width, int height) {
		this.difficulty = difficulty;
		this.width = width;
		this.height = height;
		
		initGame();
	}
	
	private void initGame() {
		switch(difficulty) {
			case 0:
				numXGrids = 4;
				numYGrids = 4;
				numColors = 4;
				break;
			default:
				break;
		}
		initGrid();
	}
	
	private void initGrid() {
		
	}
	
}
