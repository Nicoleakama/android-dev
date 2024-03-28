@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.plum

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextRange
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.plum.ui.theme.PlumTheme

class InputActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           Input()
        }
    }
}
@Preview(showBackground = true)
@Composable
fun Input() {
    Box(modifier = Modifier
        .fillMaxSize())

    {
        androidx.compose.foundation.Image(
            painter = painterResource(id = R.drawable.feet),
            contentDescription = "",
            modifier = Modifier
                .fillMaxSize(),

            contentScale = ContentScale.Crop
        )


        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .fillMaxSize()
                .padding(15.dp),
            horizontalAlignment = Alignment.CenterHorizontally


        ) {
            var name by remember {
                mutableStateOf(TextFieldValue(""))
            }

            OutlinedTextField(
                value = name,
                onValueChange = { name = it },
                label = { Text(text = "Enter name") },


                colors = TextFieldDefaults.outlinedTextFieldColors(
                    unfocusedBorderColor = Color.Magenta,
                    focusedBorderColor = Color.Black,
                    unfocusedLabelColor = Color.Magenta,
                    focusedLabelColor = Color.Black,
                    cursorColor = Color.White,)





            )
            Spacer(modifier = Modifier.height(10.dp))


            var email by remember {
                mutableStateOf(TextFieldValue(""))
            }
            OutlinedTextField(
                value = email,
                onValueChange = { email = it },
                label = { Text(text = "Enter email") },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
                textStyle = TextStyle(Color.Blue),


                leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "")},




                colors = TextFieldDefaults.outlinedTextFieldColors(
                    unfocusedBorderColor = Color.Magenta,
                    focusedBorderColor = Color.Black,
                    unfocusedLabelColor = Color.Magenta,
                    focusedLabelColor = Color.Black,
                    cursorColor = Color.White,
                    focusedLeadingIconColor = Color.Black,
                    unfocusedLeadingIconColor = Color.Magenta,
                    )






            )


            Spacer(modifier = Modifier.height(10.dp))


            var passcode by remember {
                mutableStateOf(TextFieldValue(""))
            }

            OutlinedTextField(
                value = passcode,
                onValueChange = {passcode = it },
                label = { Text(text = "Enter password") },
                textStyle = TextStyle(Color.White),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),


                colors = TextFieldDefaults.outlinedTextFieldColors(
                    unfocusedBorderColor = Color.Magenta,
                    focusedBorderColor = Color.Black,
                    unfocusedLabelColor = Color.Magenta,
                    focusedLabelColor = Color.Black,
                    cursorColor = Color.White,

                    )
            )

            val enter = LocalContext.current

            Button(onClick = {

                enter.startActivity(Intent(enter, InputActivity::class.java))


                /*TODO*/ }) {

                Text(text = "SUBMIT")


            }









//        LazyColumn (){
//            item {}
//
//        }
//      or
//
//      LazyRow {
//          item {  }
//      }
//








        }





























        }




    }










