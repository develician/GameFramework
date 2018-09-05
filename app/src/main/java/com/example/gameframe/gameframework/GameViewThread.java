package com.example.gameframe.gameframework;

import android.content.Context;
import android.graphics.Canvas;
import android.view.SurfaceHolder;

public class GameViewThread extends Thread implements SurfaceHolder.Callback {

    private SurfaceHolder m_surfaceHolder;
    private GameView m_gameView;
    private boolean m_run = false;

    public GameViewThread(SurfaceHolder holder, GameView gameView) {
        this.m_surfaceHolder = holder;
        this.m_gameView = gameView;
    }

    @Override
    public void run() {
        super.run();

        Canvas canvas;

        while(m_run) {
            canvas = null;
            try {
                m_gameView.Update();

                canvas = m_surfaceHolder.lockCanvas(null);
                synchronized (m_surfaceHolder) {
                    m_gameView.onDraw(canvas);
                }
            } finally {
                if(canvas != null) {
                    m_surfaceHolder.unlockCanvasAndPost(canvas);
                }
            }
        }
    }

    public void setRunning(boolean run) {
        this.m_run = run;
    }

    @Override
    public void surfaceCreated(SurfaceHolder holder) {

    }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {

    }

    @Override
    public void surfaceDestroyed(SurfaceHolder holder) {

    }
}
