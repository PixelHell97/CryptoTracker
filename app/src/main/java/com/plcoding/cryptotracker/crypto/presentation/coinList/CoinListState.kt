package com.plcoding.cryptotracker.crypto.presentation.coinList

import androidx.compose.runtime.Immutable
import com.plcoding.cryptotracker.crypto.presentation.models.CoinUi

@Immutable
data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<CoinUi> = emptyList(),
    val currentCoin: CoinUi? = null,
)
