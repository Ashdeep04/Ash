package com.example.androidproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        var btn = findViewById<Button>(R.id.button_4)
        var numf = findViewById<EditText>(R.id.et1_4)
        var nums = findViewById<EditText>(R.id.et2_4)
        var res = findViewById<TextView>(R.id.tv4)
        var sp = findViewById<Spinner>(R.id.spinner4)
        btn.setOnClickListener(View.OnClickListener {
            var a:Float = numf.text.toString().toFloat()
            var b:Float = nums.text.toString().toFloat()
            var s = sp.selectedItem.toString()
            when(s){
                "+"->res.setText("Result: "+Add(a,b))
                "-"->res.setText("Result: "+Sub(a,b))
                "*"->res.setText("Result: "+Mul(a,b))
                "/"->res.setText("Result: "+Div(a,b))
                "%"->res.setText("Result: "+Mod(a,b))
            }



        })

    }
    fun Add(a:Float,b:Float):Float{
        return a+b
    }
    fun Sub(a:Float,b:Float):Float{
        return a-b
    }
    fun Mul(a:Float,b:Float):Float{
        return a*b
    }

    fun Div(a:Float,b:Float):Float{
        return a/b
    }
    fun Mod(a:Float,b:Float):Float{
        return a%b
    }
}