@file:OptIn(ExperimentalLayoutApi::class)

package com.plcoding.cryptotracker.crypto.presentation.coinDetail

import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.plcoding.cryptotracker.R
import com.plcoding.cryptotracker.crypto.presentation.coinDetail.components.InfoCard
import com.plcoding.cryptotracker.crypto.presentation.coinList.CoinListState
import com.plcoding.cryptotracker.crypto.presentation.coinList.components.coinUi
import com.plcoding.cryptotracker.crypto.presentation.models.toDisplayableNumber
import com.plcoding.cryptotracker.ui.theme.CryptoTrackerTheme
import com.plcoding.cryptotracker.ui.theme.greenBackground

@Composable
fun CoinDetailScreen(
    state: CoinListState,
    modifier: Modifier = Modifier,
) {
    val contentColor = if (isSystemInDarkTheme()) Color.White else Color.Black
    if (state.isLoading) {
        Box(
            modifier = modifier.fillMaxSize(),
            contentAlignment = Alignment.Center,
        ) {
            CircularProgressIndicator()
        }
    } else if (state.currentCoin != null) {
        val coin = state.currentCoin
        Column(
            modifier =
                modifier
                    .fillMaxSize()
                    .verticalScroll(rememberScrollState())
                    .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Icon(
                imageVector = ImageVector.vectorResource(id = coin.iconRes),
                contentDescription = coin.name,
                modifier = Modifier.size(100.dp),
                tint = MaterialTheme.colorScheme.primary,
            )
            Text(
                text = coin.name,
                fontSize = 40.sp,
                fontWeight = FontWeight.Black,
                textAlign = TextAlign.Center,
                color = contentColor,
            )
            Text(
                text = coin.symbol,
                fontSize = 20.sp,
                fontWeight = FontWeight.Light,
                textAlign = TextAlign.Center,
                color = contentColor,
            )

            FlowRow(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
            ) {
                InfoCard(
                    title = stringResource(R.string.market_cap),
                    formattedText = "$ ${coin.marketCapUsd.formattedValue}",
                    icon = ImageVector.vectorResource(R.drawable.stock),
                )
                InfoCard(
                    title = stringResource(R.string.price),
                    formattedText = "$ ${coin.priceUsd.formattedValue}",
                    icon = ImageVector.vectorResource(R.drawable.dollar),
                )
                val absoluteChangeFormated =
                    (coin.priceUsd.value * (coin.changePercent24Hr.value / 100))
                        .toDisplayableNumber()
                val isPositive = coin.changePercent24Hr.value > 0.0
                val cardContentColor =
                    if (isPositive) {
                        if (isSystemInDarkTheme()) Color.Green else greenBackground
                    } else {
                        MaterialTheme.colorScheme.error
                    }
                InfoCard(
                    title = stringResource(R.string.change_last_24h),
                    formattedText = absoluteChangeFormated.formattedValue,
                    icon =
                        if (isPositive) {
                            ImageVector.vectorResource(R.drawable.trending)
                        } else {
                            ImageVector.vectorResource(R.drawable.trending_down)
                        },
                    contentColor = cardContentColor,
                )
            }
        }
    }
}

@PreviewLightDark
@Composable
private fun CoinDetailScreenPrev() {
    CryptoTrackerTheme {
        CoinDetailScreen(
            state =
                CoinListState(
                    isLoading = false,
                    currentCoin = coinUi,
                ),
            modifier = Modifier.background(MaterialTheme.colorScheme.background),
        )
    }
}
