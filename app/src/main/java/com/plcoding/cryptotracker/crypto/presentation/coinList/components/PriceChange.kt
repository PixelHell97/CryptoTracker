package com.plcoding.cryptotracker.crypto.presentation.coinList.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.plcoding.cryptotracker.crypto.presentation.models.DisplayableNumber
import com.plcoding.cryptotracker.ui.theme.CryptoTrackerTheme
import com.plcoding.cryptotracker.ui.theme.greenBackground

@Composable
fun PriceChange(
    priceChange: DisplayableNumber,
    modifier: Modifier = Modifier,
) {
    val contentColor =
        if (priceChange.value < 0.0) MaterialTheme.colorScheme.onErrorContainer else Color.Green
    val containerColor =
        if (priceChange.value < 0.0) MaterialTheme.colorScheme.errorContainer else greenBackground
    Row(
        modifier =
            modifier
                .clip(RoundedCornerShape(100f))
                .background(containerColor)
                .padding(horizontal = 4.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Icon(
            imageVector = if (priceChange.value < 0.0) Icons.Default.KeyboardArrowDown else Icons.Default.KeyboardArrowUp,
            contentDescription = null,
            modifier = Modifier.size(20.dp),
            tint = contentColor,
        )
        Text(
            text = "${priceChange.formattedValue} %",
            fontSize = 14.sp,
            fontWeight = FontWeight.Medium,
            color = contentColor,
        )
    }
}

@PreviewLightDark
@Composable
private fun PriceIncPrev() {
    CryptoTrackerTheme {
        PriceChange(
            priceChange =
                DisplayableNumber(
                    value = 12.34,
                    formattedValue = "12.34",
                ),
        )
    }
}

@PreviewLightDark
@Composable
private fun PriceDecPrev() {
    CryptoTrackerTheme {
        PriceChange(
            priceChange =
                DisplayableNumber(
                    value = -12.34,
                    formattedValue = "-12.34",
                ),
        )
    }
}
