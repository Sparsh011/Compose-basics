package com.example.composedemo

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
import com.example.composedemo.ui.theme.ComposeDemoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeDemoTheme {
                var num by remember {
                    mutableStateOf(0)
                }

                Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = num.toString(), // Only the Text will be recomposed on button click
                        fontSize = 30.sp
                    )
                    Button(onClick = {
                        Toast.makeText(this@MainActivity, "Clicked!", Toast.LENGTH_SHORT).show()
                        num++
                    }) {
                        Text(text = "Click Me!", fontSize = 20.sp, color = Color.White)
                    }
                }
            }
        }
    }
}

//@Composable
//fun HelloJi(){
//    Column (
//        horizontalAlignment = Alignment.CenterHorizontally,
//        verticalArrangement = Arrangement.Center,
//        modifier = Modifier.fillMaxSize() // Have to use this as well so that the image and icon appear at the center of the screen
//            ){
//        Image(painter = painterResource(
//            id = R.drawable.ic_launcher_foreground),
//            contentDescription = null,
//            modifier = Modifier.background(Color.Black)
//        )
//
//        Icon(
//            imageVector = Icons.Default.Add,
//            contentDescription = null
//        )
//    }
//}

//@Composable
//fun Greeting(name: String) {
//
////    Box() is equivalent of constraint layout
//    Column(
//        horizontalAlignment = Alignment.CenterHorizontally,
//        verticalArrangement = Arrangement.Center,
//        modifier = Modifier
//            .background(Color.Yellow)
//            .padding(15.dp)
////            .fillMaxSize() Fills the whole screen
////            .fillMaxWidth()
////            .fillMaxHeight()
//            .size(300.dp)
//    ) {
//        Text(
//            text = "Hello $name!",
//            color = Color.Blue, // changes text color
//            fontSize = 30.sp,
//            modifier = Modifier // Modifiers are executed sequentially
//                .background(Color.Gray)
//                .padding(10.dp) // Set dp
//                .background(Color.Cyan)
//
//        )
//        Text(
//            text = "Hello $name!",
//            color = Color.Blue, // changes text color
//            fontSize = 30.sp,
//            modifier = Modifier // Modifiers are executed sequentially
//                .background(Color.Gray)
//                .padding(10.dp) // Set dp
//                .background(Color.Cyan)
//
//        )
//    }
//}


//@Preview(showBackground = true)
//@Composable
//fun DefaultPreview() {
//    ComposeDemoTheme {
////        Greeting("Android")
////        HelloJi()
////        RecyclerViewUI()
//    }
//}

//@Composable
//fun RecyclerViewUI() {
////    LazyColumn/LazyRow is scrollable and emulates recyclerview
//    LazyColumn(
//        modifier = Modifier.fillMaxSize()
//    ){
//        items(10){
//            Icon(
//                imageVector = Icons.Default.ArrowBack,
//                contentDescription = null,
//                modifier = Modifier.size(100.dp)
//            )
//        }
//    }
//}
