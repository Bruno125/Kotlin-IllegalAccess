package com.example.pack.two;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.pack.R;
import com.example.pack.one.MyClass;

public class JavaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java);

        MyClass myClass = new MyClass();
        // commented because otherwise the project won't compile
        /*myClass.setListener(new MyClass.Listener() {
            @Override
            public void foo() {

            }
        });*/

    }

}
