package com.example.wallet_ui.data.local

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector

data class BreakDown(
    val icon : ImageVector,
    val title: String,
    val price : Long,
    val color  : Color
)
