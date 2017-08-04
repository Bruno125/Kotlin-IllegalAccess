package com.example.pack.one;

public class MyClass {

    interface Listener{
        void foo();
    }

    private Listener mListener;

    public void setListener(Listener listener) {
        this.mListener = listener;
    }

    public void run(){
        if(mListener != null){
            mListener.foo();
        }
    }
}
