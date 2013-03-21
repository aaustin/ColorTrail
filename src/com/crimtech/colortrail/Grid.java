package com.crimtech.colortrail;

public class Grid {

	private int startX;
	private int startY;
	private int stepX;
	private int stepY;
	private int numStepX;
	private int numStepY;
	
	public Grid(int startX, int startY, int stepX, int stepY, int numStepX, int numStepY) {
		this.startX = startY;
		this.startY = startY;
		this.stepX = stepX;
		this.stepY = stepY;
		this.numStepX = numStepY;
		this.numStepY = numStepY;
	}

	public int getStartX() {
		return startX;
	}

	public int getStartY() {
		return startY;
	}

	public int getStepX() {
		return stepX;
	}

	public int getStepY() {
		return stepY;
	}

	public int getNumStepX() {
		return numStepX;
	}

	public int getNumStepY() {
		return numStepY;
	}
	
	
	
}
