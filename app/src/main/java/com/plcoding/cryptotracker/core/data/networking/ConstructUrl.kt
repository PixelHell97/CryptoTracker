package com.plcoding.cryptotracker.core.data.networking

import com.plcoding.cryptotracker.BuildConfig.BASE_URL

fun constructUrl(url: String): String =
    when {
        url.contains(BASE_URL) -> url
        url.startsWith("/") -> BASE_URL + url.drop(1)
        else -> BASE_URL + url
    }
