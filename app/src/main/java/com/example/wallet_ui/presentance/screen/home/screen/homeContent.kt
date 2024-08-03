package com.example.wallet_ui.presentance.screen.home.screen

import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.wallet_ui.presentance.screen.home.component.AtmCard
import com.example.wallet_ui.presentance.screen.home.component.Section
import com.example.wallet_ui.presentance.screen.home.component.SpendingBreakDown
import com.example.wallet_ui.presentance.screen.home.component.SpendingStatics

@Composable
fun HomeContent(modifier: Modifier = Modifier) {

    Column (
        modifier=modifier
            .navigationBarsPadding()
    ){

        Spacer(modifier = Modifier
            .height(22.dp))

        AtmCard()

        Spacer(modifier = Modifier
            .height(12.dp))

        Section(modifier=Modifier.fillMaxWidth())

        Spacer(modifier = Modifier
            .height(22.dp))

        SpendingBreakDown(modifier=Modifier
            .fillMaxWidth())

        Spacer(modifier = Modifier
            .height(22.dp))

        SpendingStatics(modifier=Modifier
            .fillMaxWidth())

    }

}