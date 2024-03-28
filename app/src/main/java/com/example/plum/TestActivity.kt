package com.example.plum

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.plum.ui.theme.PlumTheme

class TestActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Test()
        }
    }
}
@Preview(showBackground = true)
@Composable
fun Test() {
    LazyColumn{
        item {
            Column(
                modifier = Modifier
                    .background(Color.LightGray)
                    .fillMaxSize()
                    .fillMaxHeight()
                    .fillMaxWidth(),

                verticalArrangement = Arrangement.Center,



            ) {
                Row (modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.LightGray),

               ){
                  Column(
                      modifier = Modifier
                          .height(20.dp)
                          .width(20.dp)


                  ) {
                      androidx.compose.foundation.Image(
                          painter = painterResource(id = R.drawable.icon),
                          contentDescription ="",
                          modifier = Modifier
                              .size(20.dp))
                  }
                 Row {
                         Text(text = "Current Location",
                             color = Color.Black)

                     Spacer(modifier =Modifier
                         .height(20.dp)
                         .width(20.dp))


                     androidx.compose.foundation.Image(
                         painter = painterResource(id = R.drawable.location),
                         contentDescription ="",
                         modifier = Modifier
                             .size(30.dp)
                             .height(20.dp)
                             .width(20.dp))

                     Text(text = "Denpasar, Bali",
                         color = Color.Black)

                 }
               Column(
                   modifier = Modifier
                       .height(60.dp)
                       .width(60.dp)

               ) {

                   androidx.compose.foundation.Image(
                       painter = painterResource(id = R.drawable.indian),
                       contentDescription ="",
                       modifier = Modifier
                           .size(20.dp))






               }









               }



                Row(
                    modifier = Modifier
                        .fillMaxSize()
                        .fillMaxWidth()
                        .fillMaxHeight(),
                    horizontalArrangement = Arrangement.SpaceEvenly,



                ) {

                    val love = LocalContext.current

                    Button(
                        onClick = {

                            love.startActivity(Intent(love, TestActivity::class.java))/*TODO*/
                        },
                        colors = ButtonDefaults.buttonColors(Color.White),
                        shape = RoundedCornerShape(5.dp),



                    )
                    {
                    androidx.compose.foundation.Image(
                        painter = painterResource(id = R.drawable.hotel),
                        contentDescription = "",
                        modifier  = Modifier
                            .size(20.dp))


                        Text(text = "Hotels",
                            color = Color.Black)
                    }



                    val believe = LocalContext.current

                    Button(
                        onClick = {

                            believe.startActivity(Intent(believe, TestActivity::class.java))/*TODO*/
                        },


                        colors = ButtonDefaults.buttonColors(Color.White),
                        shape = RoundedCornerShape(5.dp),




                    )
                    {
                        androidx.compose.foundation.Image(
                            painter = painterResource(id = R.drawable.holiday),
                            contentDescription = "",
                            modifier  = Modifier
                                .size(20.dp))


                        Text(text = "Holidays",
                            color = Color.Black)
                    }
                }


                Row(
                    modifier = Modifier
                        .fillMaxSize()
                        .fillMaxHeight()
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly

                ) {
                    val hope = LocalContext.current

                    Button(
                        onClick = {

                            hope.startActivity(Intent(hope, TestActivity::class.java))/*TODO*/
                        },


                        colors = ButtonDefaults.buttonColors(Color.White),
                        shape = RoundedCornerShape(5.dp)


                    )
                    {
                        androidx.compose.foundation.Image(
                            painter = painterResource(id = R.drawable.taxi),
                            contentDescription = "",
                            modifier  = Modifier
                                .size(20.dp))








                        Text(text = "Taxi",
                            color = Color.Black)
                    }


                    val faith = LocalContext.current

                    Button(
                        onClick = {

                            faith.startActivity(Intent(faith, TestActivity::class.java))/*TODO*/
                        },


                        colors = ButtonDefaults.buttonColors(Color.White),
                        shape = RoundedCornerShape(5.dp)


                    )
                    {
                        androidx.compose.foundation.Image(
                            painter = painterResource(id = R.drawable.ticket),
                            contentDescription = "",
                            modifier  = Modifier
                                .size(20.dp))

                        Text(text = "Ticket",
                            color = Color.Black)
                    }

                }

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight()
                        .fillMaxSize(),
                    horizontalArrangement = Arrangement.SpaceEvenly

                ) {
                    val joy = LocalContext.current

                    Button(
                        onClick = {

                            joy.startActivity(Intent(joy, TestActivity::class.java))/*TODO*/
                        },


                        colors = ButtonDefaults.buttonColors(Color.White),
                        shape = RoundedCornerShape(5.dp)


                    )
                    {
                        androidx.compose.foundation.Image(
                            painter = painterResource(id = R.drawable.aeroplane),
                            contentDescription = "",
                            modifier  = Modifier
                                .size(20.dp))

                        Text(text = "Airplane",
                            color = Color.Black)
                    }

                    val peace = LocalContext.current

                    Button(
                        onClick = {

                            peace.startActivity(Intent(peace, TestActivity::class.java))/*TODO*/
                        },


                        colors = ButtonDefaults.buttonColors(Color.White),
                        shape = RoundedCornerShape(5.dp)


                    )
                    {
                        androidx.compose.foundation.Image(
                            painter = painterResource(id = R.drawable.harbour),
                            contentDescription = "",
                            modifier  = Modifier
                                .size(20.dp))

                        Text(text = "Harbour",
                            color = Color.Black)
                    }


                }


            }


        }


    }

}
