package com.plcoding.cryptotracker.crypto.presentation.coinList

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import com.plcoding.cryptotracker.crypto.presentation.coinList.components.CoinListItem
import com.plcoding.cryptotracker.crypto.presentation.coinList.components.coinUi
import com.plcoding.cryptotracker.ui.theme.CryptoTrackerTheme

@Composable
fun CoinListScreen(
    coinListState: CoinListState,
    modifier: Modifier = Modifier,
) {
    if (coinListState.isLoading) {
        Box(
            modifier = modifier.fillMaxSize(),
            contentAlignment = Alignment.Center,
        ) {
            CircularProgressIndicator()
        }
    } else {
        LazyColumn(
            modifier = modifier.fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            items(coinListState.coins) { coin ->
                CoinListItem(
                    coinUi = coin,
                    onClick = { /* TODO */ },
                )

                HorizontalDivider()
            }
        }
    }
}

@PreviewLightDark
@Composable
private fun CoinListScreenPrev() {
    CryptoTrackerTheme {
        CoinListScreen(
            coinListState =
                CoinListState(
                    isLoading = false,
                    coins = (1..50).map { coinUi },
                ),
            modifier = Modifier.background(MaterialTheme.colorScheme.background),
        )
    }
}
