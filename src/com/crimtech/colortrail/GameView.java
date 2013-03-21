package com.crimtech.colortrail;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

import android.widget.TextView;

public class GameView extends SurfaceView implements SurfaceHolder.Callback {   

    private Context ctx;

    private boolean newTouchEvent;
    
    // init the view and thread
    public GameView(Context context, AttributeSet attrs) {
        super(context, attrs);

        SurfaceHolder holder = getHolder();
        holder.addCallback(this);
        
        newTouchEvent = true;
        
        ctx  = context;
        setFocusable(true); 
    }
    
  
    
    // save the state of the game if save state called
    public void save_state(Bundle outState) {
    	
    }
    
    // restore the state of the game
    public void restore_state(Bundle instate) {
    	
    }
   
    @Override
    public boolean onTouchEvent(MotionEvent event) {		
        // tell Thread to handle event
    	if (event.getAction() == MotionEvent.ACTION_DOWN && newTouchEvent) {
    		
    		newTouchEvent = false;
    	}
    	
    	if (event.getAction() == MotionEvent.ACTION_UP)
    		newTouchEvent = true;
    	
    	return true;
    }

   
   
    // connect all the buttons and interface guys
    public void set_interface(TextView textView, TextView txtnotice) {

    }

    // change the display parameters if surface is a different size
    public void surfaceChanged(SurfaceHolder holder, int format, int width,
            int height) {
      
    }

    // created the surface so safe to start display and physics threads
    public void surfaceCreated(SurfaceHolder holder) {
    	
    }


    public void surfaceDestroyed(SurfaceHolder holder) {
             
    }

	

	
}