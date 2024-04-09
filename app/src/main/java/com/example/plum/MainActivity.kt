package com.example.plum

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.plum.ui.theme.PlumTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Gold()


        }
    }
}
@Preview(showBackground = true)
@Composable
fun Gold(){
    Column (
        modifier = Modifier
            .background(Color.Black)
//            .fillMaxWidth()
//            .fillMaxHeight()
            .fillMaxSize()
            .padding(10.dp)
        
    ) {
        Row {


            Text(text = "About", color = Color.White)

            Spacer(modifier = Modifier.width(60.dp))

            Text(text = "Main", color = Color.White)

            Spacer(modifier = Modifier.width(60.dp))

            Text(text = "Settings", color = Color.White)

            Spacer(modifier = Modifier.width(60.dp))

        }
        Text(
            text = "Game loading",
            fontSize = 25.sp,
            fontFamily = FontFamily.Cursive,
            color = Color.LightGray
        )


        Text(text = "The game is about to start", color = Color.White)
        val about = LocalContext.current
        Button(
            onClick = {

                about.startActivity(Intent(about, AboutActivity::class.java))/*TODO*/
            },


            colors = ButtonDefaults.buttonColors(Color.Transparent),
            shape = RoundedCornerShape(10.dp),
//         shape = CutCornerShape(10),
//         shape = RectangleShape
            border = BorderStroke(2.dp, Color.Magenta)


        ) {
            Text(text = "START")
        }



            Column {
                val fille = LocalContext.current

                Text(text = "Access choose activity here",
                    color = Color.Cyan,
                    modifier = Modifier
                        .clickable {
                            fille.startActivity(Intent(fille, ChooseActivity::class.java))
                        }
                )

                Spacer(
                    modifier = Modifier
                        .width(10.dp)
                        .height(10.dp)
                )


                val Web = LocalContext.current

                Text(text = "Access Web Activity here",
                    color = Color(0xFFBB86FC),
                    modifier = Modifier
                        .clickable { Web.startActivity(Intent(Web, WebActivity::class.java)) }


                )
                Spacer(
                    modifier = Modifier
                        .width(10.dp)
                        .height(10.dp)
                )


                val Input = LocalContext.current

                Text(text = "Access input Activity here",
                    color = Color(0xFFBB86FC),
                    modifier = Modifier
                        .clickable { Input.startActivity(Intent(Input, InputActivity::class.java)) }

                )
                Spacer(
                    modifier = Modifier
                        .width(10.dp)
                        .height(10.dp)
                )

            }



    }}