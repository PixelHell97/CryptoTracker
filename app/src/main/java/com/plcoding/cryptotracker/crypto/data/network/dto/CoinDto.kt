package com.plcoding.cryptotracker.crypto.data.network.dto

import kotlinx.serialization.Serializable

@Serializable
data class CoinDto(
    val id: String,
    val rank: String,
    val name: String,
    val symbol: String,
    val priceUsd: Double,
    val marketCapUsd: Double,
    val changePercent24Hr: Double,
)
