package com.plcoding.cryptotracker.crypto.domain

data class Coin(
    val id: String,
    val rank: String,
    val name: String,
    val symbol: String,
    val priceUsd: Double,
    val marketCapUsd: Double,
    val changePercent24Hr: Double,
)
