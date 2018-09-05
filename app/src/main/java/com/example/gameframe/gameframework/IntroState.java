package com.example.gameframe.gameframework;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.MotionEvent;

public class IntroState implements IState {
    Bitmap icon;
    int x, y;

    @Override
    public void Init() {
        icon = AppManager.getInstance().getBitmap(R.drawable.ic_launcher_background);
    }

    @Override
    public void Destroy() {

    }

    @Override
    public void Update() {

    }

    @Override
    public void Render(Canvas canvas) {

    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        return false;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return false;
    }
}
