package com.example.jake.gametest;

public class Sandbox {

    private Sandbox(String mShovel, int mChildren) {
        this.mShovel = mShovel;
        this.mChildren = mChildren;
        new Thread(new MyRunnable()).start();
    }

    private String mShovel;
    private int mChildren;

    public static Sandbox createSandbox(String mShovel, int mChildren) {
        return new Sandbox(mShovel, mChildren);
    }

    public String getmShovel() {
        return mShovel;
    }

    public void setmShovel(String mShovel) {
        this.mShovel = mShovel;
    }

    public int getmChildren() {
        return mChildren;
    }

    public void setmChildren(int mChildren) {
        this.mChildren = mChildren;
    }

    private static class MyRunnable implements Runnable {
        @Override
        public void run() {

        }
    }
}
