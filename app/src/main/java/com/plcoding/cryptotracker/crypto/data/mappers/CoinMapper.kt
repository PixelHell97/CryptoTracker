package com.plcoding.cryptotracker.crypto.data.mappers

import com.plcoding.cryptotracker.crypto.data.network.dto.CoinDto
import com.plcoding.cryptotracker.crypto.data.network.dto.CoinPriceDto
import com.plcoding.cryptotracker.crypto.domain.Coin
import com.plcoding.cryptotracker.crypto.domain.CoinPrice
import java.time.Instant
import java.time.ZoneId

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

fun CoinPriceDto.toCoinPrice(): CoinPrice =
    CoinPrice(
        priceUsd = priceUsd,
        dateTime =
            Instant
                .ofEpochMilli(time)
                .atZone(ZoneId.of("UTC")),
    )
