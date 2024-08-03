package com.example.wallet_ui.presentance.screen.home.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ArrowDownward
import androidx.compose.material.icons.rounded.ArrowUpward
import androidx.compose.material.icons.rounded.MoreHoriz
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun Section(
    modifier: Modifier = Modifier) {

    Row (
        modifier=modifier,
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceAround
    ){
        SectionItem(
            icon = Icons.Rounded.ArrowUpward,
            title ="Send",
            backGroundColor =Color.Magenta.copy(0.32f)
        )
        SectionItem(
            icon = Icons.Rounded.ArrowDownward,
            title ="Send",
            backGroundColor =Color.Green.copy(0.32f)
        )
        SectionItem(
            icon = Icons.Rounded.MoreHoriz,
            title ="More",
            backGroundColor =Color.LightGray.copy(0.32f)
        )
    }

}

@Composable
fun SectionItem(
    icon : ImageVector,
    title:String,
    backGroundColor : Color
) {

    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .size(70.dp)
                .clip(CircleShape)
                .background(backGroundColor),
            contentAlignment = Alignment.Center
        ) {
            Icon(
                imageVector = icon,
                contentDescription = null
            )

        }

        Spacer(
            modifier = Modifier
                .height(4.dp)
        )

        Text(
            text = title,
            style = TextStyle(
                fontWeight = FontWeight.SemiBold,
                fontSize = MaterialTheme.typography.bodyLarge.fontSize,
                fontStyle = MaterialTheme.typography.bodyLarge.fontStyle
            )
        )
    }

}
