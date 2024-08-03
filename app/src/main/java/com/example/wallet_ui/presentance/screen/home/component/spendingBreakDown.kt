package com.example.wallet_ui.presentance.screen.home.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.LunchDining
import androidx.compose.material.icons.rounded.MedicalInformation
import androidx.compose.material.icons.rounded.Medication
import androidx.compose.material.icons.rounded.ShoppingCart
import androidx.compose.material.icons.rounded.Subscriptions
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.wallet_ui.data.local.BreakDown
import com.example.wallet_ui.data.local.randomColor

@Composable
fun SpendingBreakDown(
    modifier: Modifier = Modifier) {

    Column (
        modifier= modifier
            .padding(horizontal = 18.dp)
    ){
        Text(text = "Spending Break Down",
            style = TextStyle(
                fontWeight = FontWeight.Bold,
                fontSize = MaterialTheme.typography.titleLarge.fontSize,
                fontStyle = MaterialTheme.typography.titleLarge.fontStyle
            ),
            color = MaterialTheme.colorScheme.onSurface
        )

        Spacer(modifier = Modifier
            .height(8.dp))

        LazyRow(
            modifier= Modifier
                .fillMaxWidth(),
            contentPadding = PaddingValues(8.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(breakDownItem){
                BreakDownSection(breakDown = it)
            }
        }

    }


}

val breakDownItem = listOf(

    BreakDown(
        icon = Icons.Rounded.LunchDining,
        title = "Lunch",
        price = 4131,
        color = randomColor()
    ),
    BreakDown(
        icon = Icons.Rounded.ShoppingCart,
        title = "Shopping",
        price = 5121,
        color = randomColor()
    ),
    BreakDown(
        icon = Icons.Rounded.Subscriptions,
        title = "Subscription",
        price = 1201,
        color = randomColor()
    ),
    BreakDown(
        icon = Icons.Rounded.MedicalInformation,
        title = "Medical",
        price = 981,
        color = randomColor()
    )

)

@Composable
fun BreakDownSection(breakDown: BreakDown) {

    Box(modifier = Modifier
        .size(150.dp)
        .clip(RoundedCornerShape(12.dp))
        .background(breakDown.color)){
        Column(
            modifier= Modifier
                .fillMaxSize()
                .padding(horizontal = 4.dp),
            verticalArrangement = Arrangement.SpaceAround,
            horizontalAlignment = Alignment.Start
        ) {
            Icon(
                imageVector =breakDown.icon,
                contentDescription =null,
                tint = Color.White,
                modifier=Modifier
                    .size(40.dp)
            )

            Text(text = breakDown.title,
                style = TextStyle(
                    fontWeight = FontWeight.Bold,
                    fontSize = MaterialTheme.typography.bodyLarge.fontSize,
                    fontStyle = MaterialTheme.typography.bodyLarge.fontStyle
                ),
                color = Color.White
            )

            Text(text = "$${breakDown.price}.00",
                style = TextStyle(
                    fontWeight = FontWeight.Bold,
                    fontSize = MaterialTheme.typography.bodyLarge.fontSize,
                    fontStyle = MaterialTheme.typography.bodyLarge.fontStyle
                ),
                color = Color.White
            )
        }
    }

}
