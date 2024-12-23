package com.plcoding.cryptotracker.crypto.presentation.coinList.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.plcoding.cryptotracker.crypto.domain.Coin
import com.plcoding.cryptotracker.crypto.presentation.models.CoinUi
import com.plcoding.cryptotracker.crypto.presentation.models.toCoinUi
import com.plcoding.cryptotracker.ui.theme.CryptoTrackerTheme

@Composable
fun CoinListItem(
    coinUi: CoinUi,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    val contentColor = if (isSystemInDarkTheme()) Color.White else Color.Black
    Row(
        modifier =
            modifier
                .clickable(onClick = onClick)
                .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(16.dp),
    ) {
        Icon(
            imageVector = ImageVector.vectorResource(coinUi.iconRes),
            contentDescription = coinUi.name,
            tint = MaterialTheme.colorScheme.primary,
        )

        Column(
            modifier = Modifier.weight(1f),
        ) {
            Text(
                text = coinUi.symbol,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = contentColor,
            )
            Text(
                text = coinUi.name,
                fontSize = 14.sp,
                fontWeight = FontWeight.Light,
                color = contentColor,
            )
        }
        Column(
            horizontalAlignment = Alignment.End,
        ) {
            Text(
                text = "$ ${coinUi.priceUsd.formattedValue}",
                fontSize = 16.sp,
                fontWeight = FontWeight.SemiBold,
                color = contentColor,
            )
            Spacer(modifier = Modifier.padding(8.dp))
            PriceChange(
                priceChange = coinUi.changePercent24Hr,
            )
        }
    }
}

@PreviewLightDark
@Composable
private fun CoinListItemPrev() {
    CryptoTrackerTheme {
        CoinListItem(
            coinUi = coinUi,
            onClick = { /* TODO */ },
            modifier = Modifier.background(MaterialTheme.colorScheme.background),
        )
    }
}

internal val coinUi: CoinUi =
    Coin(
        id = "bitcoin",
        rank = "1",
        name = "Bitcoin",
        symbol = "BTC",
        priceUsd = 34000.0,
        marketCapUsd = 1234567890.0,
        changePercent24Hr = -12.34,
    ).toCoinUi()
