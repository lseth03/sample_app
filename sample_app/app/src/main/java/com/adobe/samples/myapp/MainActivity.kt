package com.adobe.samples.myapp

import android.os.Bundle
import android.widget.EditText
import androidx.annotation.Keep
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.ComposeView
import com.example.myapp.R

@Keep
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scan_sdk)

        val editText: EditText = findViewById(R.id.editText)
        editText.setText("Updated TextView content")

        val composeView: ComposeView = findViewById(R.id.composeView)
        composeView.setContent {
            MaterialTheme {
                Surface {
                    Greeting("ComposeView")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello, $name!")
}