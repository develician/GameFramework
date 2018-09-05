package com.example.gameframe.gameframework;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public class AppManager {
    private static AppManager s_instance;
    private GameView m_gameview;
    private Resources m_resources;

    public static AppManager getInstance() {
        if (s_instance == null) {
            s_instance = new AppManager();
        }
        return s_instance;
    }

    public void setM_gameview(GameView m_gameview) {
        this.m_gameview = m_gameview;
    }

    public void setM_resources(Resources m_resources) {
        this.m_resources = m_resources;
    }

    public GameView getM_gameview() {
        return m_gameview;
    }

    public Resources getM_resources() {
        return m_resources;
    }

    public Bitmap getBitmap(int r) {
        return BitmapFactory.decodeResource(m_resources, r);
    }




}
