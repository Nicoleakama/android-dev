package com.example.plum

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.example.plum.ui.theme.PlumTheme

class AboutActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            About()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun About() {
   Column {
       Text(text = "About screen")
       val main = LocalContext.current
       
       Button(onClick = { 
           
           main.startActivity(Intent(main, MainActivity::class.java))  
       
       
       /*TODO*/ }) {
           
           Text(text = "HOME")
           
           
       }
       
       
       
       
       
       
       
   }

}

