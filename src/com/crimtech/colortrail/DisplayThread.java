package com.crimtech.colortrail;

import java.util.ArrayList;

import android.content.Context;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.Log;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.widget.TextView;

public class DisplayThread extends Thread {

    public static final int STATE_PLAY = 0;
    
    private SurfaceHolder surfHolder;
    private Context ctx;
    
    private int gameState;
    private boolean dthreadRun = false;

    private int canvasHeight = 1;
    private int canvasWidth = 1;
    
    public static final double WATER_PERCENTAGE = 0.80;
    public static final double NON_FISHER_PERCENTAGE = 0.80;
 
  
    public DisplayThread(SurfaceHolder surfaceHolder, Game game, Context context) {
        surfHolder = surfaceHolder;
        ctx = context;
               
        gameState = STATE_PLAY;  
    }

    
    
    // generic draw function that calls other draws
    private void doDraw(Canvas canvas) {
        
    }
    
    // the looping run
    public void run() {
        while (dthreadRun) {
        	
            try {
				Thread.sleep(40);
			} catch (InterruptedException e) { }
            
        	Canvas c = null;
            try {
                c = surfHolder.lockCanvas(null);
                synchronized (surfHolder) {
                	doDraw(c);
                }
            } finally {                
                if (c != null) {
                    surfHolder.unlockCanvasAndPost(c);
                }
            }
        }
    }
    
    // sets the state of the thread.. false kills it
    public void setRunning(boolean b) {
        dthreadRun = b;       
    }

    // gets the game state    
    public int getGameState() {
        synchronized (surfHolder) {
            return gameState;
        }
    }
    
    // sets the state of the game
    public void setGameState(int mode) {
        synchronized (surfHolder) {
           gameState = mode;
        }
    }
   
    // when dimensions change
    public void setSurfaceSize(int width, int height) {
        synchronized (surfHolder) {
            canvasWidth = width;
            canvasHeight = height;
   
            
        }
    }
    
    // handles all touch inputs
    public void handle_touching(MotionEvent event) {
    	
    }

}
