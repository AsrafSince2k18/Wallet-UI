package com.example.wallet_ui.presentance.screen.home.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.wallet_ui.data.local.randomColor
import me.bytebeats.views.charts.bar.BarChart
import me.bytebeats.views.charts.bar.BarChartData
import me.bytebeats.views.charts.bar.render.label.SimpleLabelDrawer
import me.bytebeats.views.charts.bar.render.xaxis.SimpleXAxisDrawer
import me.bytebeats.views.charts.bar.render.yaxis.SimpleYAxisDrawer

@Composable
fun SpendingStatics(
    modifier: Modifier = Modifier
) {

    Column(
        modifier = modifier
            .padding(horizontal = 18.dp)
    ) {
        Text(
            text = "Spending Break Down",
            style = TextStyle(
                fontWeight = FontWeight.Bold,
                fontSize = MaterialTheme.typography.titleLarge.fontSize,
                fontStyle = MaterialTheme.typography.titleLarge.fontStyle
            ),
            color = MaterialTheme.colorScheme.onSurface
        )

        Spacer(
            modifier = Modifier
                .height(18.dp)
        )

        Chart()

    }

}


val barChat = BarChartData(
    bars = listOf(
        BarChartData.Bar(
            value = 211f,
            color = randomColor(),
            label = "Aug 1"
        ),
        BarChartData.Bar(
            value = 131f,
            color = randomColor(),
            label = "Aug 2"
        ),
        BarChartData.Bar(
            value = 311f,
            color = randomColor(),
            label = "Aug 3"
        ),
        BarChartData.Bar(
            value = 910f,
            color = randomColor(),
            label = "Aug 4"
        ),
        BarChartData.Bar(
            value = 1321f,
            color = randomColor(),
            label = "Aug 5"
        )
    )
)

@Composable
fun Chart() {

    BarChart(
        modifier=Modifier
            .fillMaxWidth()
            .height(200.dp),
        barChartData = barChat,
        xAxisDrawer = SimpleXAxisDrawer(
            axisLineThickness = 1.dp,
            axisLineColor = MaterialTheme.colorScheme.onSurface.copy(0.32f)
        ),
        yAxisDrawer = SimpleYAxisDrawer(
            axisLineThickness = 1.dp,
            axisLineColor = MaterialTheme.colorScheme.onSurface.copy(0.32f)
        ),
        labelDrawer = SimpleLabelDrawer(
            drawLocation = SimpleLabelDrawer.DrawLocation.Outside
        )
    )

}
