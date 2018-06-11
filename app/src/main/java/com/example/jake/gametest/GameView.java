package com.example.jake.gametest;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.GridLayout;

public class GameView extends GridLayout {
        public GameView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        InitGameView();
    }
    public GameView(Context context, AttributeSet attrs) {
        super(context, attrs);
        InitGameView();
    }
    public GameView(Context context) {
        super(context);
        InitGameView();
    }
    private  void InitGameView(){
            setOnTouchListener(new OnTouchListener() {
            private  float startX, startY, offsetX,offsetY;
                           @Override
                           public boolean onTouch(View v, MotionEvent event) {
                               switch (event.getAction()){
                                   case MotionEvent.ACTION_DOWN:
                                       startX = event.getX();
                                       startY = event.getY();
                                       break;
                                   case MotionEvent.ACTION_UP:
                                       offsetX = event.getX() - startX;
                                       offsetY = event.getY() - startY;

                                       if (Math.abs(offsetX)>Math.abs(offsetY)){
                                           if(offsetX<-5){
                                               //Log.v("TAG","left");
                                               swipLeft();
                                           }else if (offsetX>5) {
                                               //System.out.println("right");
                                              // Log.v("TAG","right");
                                               swipRight();
                                           }
                                       }else{
                                           if(offsetY<-5){
                                               //Log.v("TAG","up");
                                               swipUp();
                                           }else if(offsetY>5){
                                               //Log.v("TAG","down");
                                               swipDown();
                                           }
                                       }
                                       break;
                               }
                               return true;
                           }
                       }
    );
    }
    private void swipLeft(){

    }
    private void swipRight()
    {

    }
    private void swipUp()
    {

    }
    private void swipDown()
    {

    }

}
