package com.example.plum

import android.os.Bundle
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.viewinterop.AndroidView
import com.example.plum.ui.theme.PlumTheme

class WebActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            WebApen()

            }
        }
    }




@Preview(showBackground = true)
@Composable
fun WebApen() {
     Column {


         val mUrl = "https://apensoftwares.co.ke"

         AndroidView(factory = {
             WebView(it).apply {
                 layoutParams = ViewGroup.LayoutParams(
                     ViewGroup.LayoutParams.MATCH_PARENT,
                     ViewGroup.LayoutParams.MATCH_PARENT
                 )
                 webViewClient = WebViewClient()
                 loadUrl(mUrl)
             }
         }, update = {
             it.loadUrl(mUrl)
         })








     }

}