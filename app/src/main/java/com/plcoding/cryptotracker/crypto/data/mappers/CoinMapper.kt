package com.plcoding.cryptotracker.crypto.data.mappers

import com.plcoding.cryptotracker.crypto.data.network.dto.CoinDto
import com.plcoding.cryptotracker.crypto.domain.Coin

fun CoinDto.toCoin(): Coin =
    Coin(
        id = id,
        name = name,
        rank = rank,
        symbol = symbol,
        priceUsd = priceUsd,
        marketCapUsd = marketCapUsd,
        changePercent24Hr = changePercent24Hr,
    )
