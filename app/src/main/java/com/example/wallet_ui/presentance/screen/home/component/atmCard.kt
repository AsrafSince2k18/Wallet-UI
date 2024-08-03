package com.example.wallet_ui.presentance.screen.home.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Wifi
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.wallet_ui.R

@Composable
fun AtmCard(modifier: Modifier = Modifier) {


        Box(
            modifier=Modifier
                .padding(horizontal = 12.dp)
        ){
            Box(modifier = Modifier
                .fillMaxWidth()
                .height(120.dp)
                .padding(horizontal = 22.dp)
                .clip(RoundedCornerShape(22.dp))
                .background(
                    Brush.linearGradient(
                        listOf(Color.Black, Color.Gray)
                    )
                ))

            Box(modifier = modifier
                .fillMaxWidth()
                .height(120.dp)
                .padding(horizontal = 12.dp, vertical = 8.dp)
                .clip(RoundedCornerShape(22.dp))
                .background(
                    Brush.linearGradient(
                        listOf(Color.Green, Color.LightGray)
                    )
                ))
            Card()
        }
}


@Composable
fun Card() {
    Box(modifier = Modifier
        .fillMaxWidth()
        .height(250.dp)
        .padding(vertical = 18.dp)
        .background(
            Brush.verticalGradient(
                colors = listOf(Color.Blue, Color.Black),
            ),
            shape = RoundedCornerShape(22.dp)
        )
        .clip(RoundedCornerShape(18.dp))){

        Image(painter = painterResource(id = R.drawable.earth),
            contentDescription = null,
            modifier= Modifier
                .size(140.dp)
                .offset(x = 30.dp)
                .align(Alignment.BottomEnd))


        Column(
            modifier= Modifier
                .fillMaxSize()
                .padding(horizontal = 18.dp),
            verticalArrangement = Arrangement.SpaceAround,
        ) {



            Row (
                modifier=Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ){
                Text(text = "DEBIT CARD",
                    style = TextStyle(
                        fontWeight = FontWeight.Bold,
                        fontSize = MaterialTheme.typography.bodyLarge.fontSize,
                        fontStyle = MaterialTheme.typography.bodyLarge.fontStyle
                    ),
                    color = Color.White
                )

                Text(text = "Since 007 Bank",
                    style = TextStyle(
                        fontWeight = FontWeight.SemiBold,
                        fontSize = MaterialTheme.typography.bodyLarge.fontSize,
                        fontStyle = MaterialTheme.typography.bodyLarge.fontStyle
                    ),
                    fontStyle = FontStyle.Italic,
                    color = Color.White
                )

            }
            Spacer(modifier = Modifier
                .height(22.dp))

            Row (
                modifier=Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ){
                Text(text = "7524 9854 5642 3647",
                    style = TextStyle(
                        fontWeight = FontWeight.SemiBold,
                        fontSize = MaterialTheme.typography.bodyLarge.fontSize,
                        fontStyle = MaterialTheme.typography.bodyLarge.fontStyle
                    ),
                    color = Color.White
                )

                Icon(imageVector = Icons.Rounded.Wifi,
                    contentDescription = null,
                    tint = Color.White,
                    modifier=Modifier
                        .rotate(90f))
            }


            Row (
                modifier=Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ){
                Text(text = "Mohamed",
                    style = TextStyle(
                        fontWeight = FontWeight.SemiBold,
                        fontSize = MaterialTheme.typography.bodyLarge.fontSize,
                        fontStyle = MaterialTheme.typography.bodyLarge.fontStyle
                    ),
                    color = Color.White
                )

                Icon(painter = painterResource(id = R.drawable.visa),
                    contentDescription = null,
                    tint = Color.White,
                    modifier=Modifier
                        .size(40.dp))
            }


            Text(text = "International Debit Card",
                style = TextStyle(
                    fontWeight = FontWeight.Normal,
                    fontSize = MaterialTheme.typography.bodySmall.fontSize,
                    fontStyle = MaterialTheme.typography.bodySmall.fontStyle
                ),
                color = Color.White
            )

        }

    }
}

@Preview(showBackground = true)
@Composable
private fun AS() {
    AtmCard()
}