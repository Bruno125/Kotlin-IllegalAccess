package com.example.pack.two

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.pack.R
import com.example.pack.one.MyClass

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myClass = MyClass()

        // commented because otherwise the project won't compile
        /*myClass.setListener(object: MyClass.Listener {
            override fun foo() {

            }
        })*/

        myClass.setListener {
            //do something
        }

        myClass.run();

    }
}
