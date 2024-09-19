package com.example.testapp

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.text.set
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main) // Linking to the XML File.
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }

        var textView = findViewById<TextView>(R.id.textView)
//        var editText = findViewById<EditText>(R.id.id)
        var editText_num1 = findViewById<EditText>(R.id.editText_num1)
        var editText_num2 = findViewById<EditText>(R.id.editText_num2)
//        var submitButton = findViewById<Button>(R.id.button_submit)
        var additionButton = findViewById<Button>(R.id.button_addition)
        var subtractionButton = findViewById<Button>(R.id.button_subtraction)
        var multiplicationButton = findViewById<Button>(R.id.button_multiplication)
        var divisionButton = findViewById<Button>(R.id.button_division)
        var clearButton = findViewById<Button>(R.id.button_clear)


        // When button is clicked it should do something.

        // setOnClickListener.

//        submitButton.setOnClickListener{
////            var name: String = editText.text.toString() // has to be done in the onclick.
////            Log.d("Inside Submit Button", name)
////            textView.text = "Hello, ${name}"
//            val num1 = editText_num2.text.toString().toInt()
//            val num2 = editText_num2.text.toString().toInt()
//            Log.d("Inside Submit Button", "${num1 + num2}")
//            textView.text = "Sum is ${num1 + num2}"
//        }

        fun clearFields() {
            editText_num1.text.clear()
            editText_num2.text.clear()
        }

        additionButton.setOnClickListener {
            val num1 = editText_num1.text.toString().toInt()
            val num2 = editText_num2.text.toString().toInt()

            val sum = num1 + num2

            textView.text = "Sum is ${sum}"

            clearFields()
            editText_num1.setText(sum.toString())

        }

        subtractionButton.setOnClickListener {
            val num1 = editText_num1.text.toString().toInt()
            val num2 = editText_num2.text.toString().toInt()
            val sub = num1 - num2
            textView.text = "Subtraction is ${sub}"
            clearFields()
            editText_num1.setText(sub.toString())
        }

        multiplicationButton.setOnClickListener{
            val num1 = editText_num1.text.toString().toInt()
            val num2 = editText_num2.text.toString().toInt()
            val mul = num1 * num2
            textView.text = "Multiplication is ${mul}"
            clearFields()
            editText_num1.setText(mul.toString())
        }

        divisionButton.setOnClickListener{
            val num1 = editText_num1.text.toString().toInt()
            val num2 = editText_num2.text.toString().toInt()

            if(num2 == 0){
                textView.text = "Cannot divide by zero"
                return@setOnClickListener
                editText_num1.text.clear()
            }
            val div = num1 / num2
            textView.text = "Division is ${div}"
            clearFields()
        }
        clearButton.setOnClickListener{
            clearFields()
        }
    }
}