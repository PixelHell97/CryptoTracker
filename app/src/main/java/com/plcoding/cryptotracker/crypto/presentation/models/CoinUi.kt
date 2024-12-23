package com.plcoding.cryptotracker.crypto.presentation.models

import android.icu.text.NumberFormat
import androidx.annotation.DrawableRes
import com.plcoding.cryptotracker.core.presentation.util.getDrawableIdForCoin
import com.plcoding.cryptotracker.crypto.domain.Coin
import java.util.Locale

data class CoinUi(
    val id: String,
    val rank: String,
    val name: String,
    val symbol: String,
    val priceUsd: DisplayableNumber,
    val marketCapUsd: DisplayableNumber,
    val changePercent24Hr: DisplayableNumber,
    @DrawableRes val iconRes: Int,
)

data class DisplayableNumber(
    val value: Double,
    val formattedValue: String,
)

fun Coin.toCoinUi(): CoinUi =
    CoinUi(
        id = id,
        rank = rank,
        name = name,
        symbol = symbol,
        priceUsd = priceUsd.toDisplayableNumber(),
        marketCapUsd = marketCapUsd.toDisplayableNumber(),
        changePercent24Hr = changePercent24Hr.toDisplayableNumber(),
        iconRes = getDrawableIdForCoin(symbol),
    )

fun Double.toDisplayableNumber(): DisplayableNumber {
    val formatter =
        NumberFormat.getNumberInstance(Locale.getDefault()).apply {
            minimumFractionDigits = 2
            maximumFractionDigits = 2
        }

    return DisplayableNumber(
        value = this,
        formattedValue = formatter.format(this),
    )
}
