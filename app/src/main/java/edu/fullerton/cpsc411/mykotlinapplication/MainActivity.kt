package edu.fullerton.cpsc411.mykotlinapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

fun TextView.increment() {
    val i = Integer.parseInt(this.text.toString())
    this.text = (i + 1).toString()
}

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val incrementButton: Button = findViewById(R.id.incrementButton)
        incrementButton.setOnClickListener {
//            val i = Integer.parseInt(countTextView.text.toString())
//            countTextView.text = (i + 1).toString()
            countTextView.increment()
        }
    }
}
