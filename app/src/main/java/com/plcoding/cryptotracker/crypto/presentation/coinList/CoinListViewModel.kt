package com.plcoding.cryptotracker.crypto.presentation.coinList

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.plcoding.cryptotracker.core.domain.util.onError
import com.plcoding.cryptotracker.core.domain.util.onSuccess
import com.plcoding.cryptotracker.crypto.domain.CoinDataSource
import com.plcoding.cryptotracker.crypto.presentation.models.toCoinUi
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.onStart
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class CoinListViewModel(
    private val coinDataSource: CoinDataSource,
) : ViewModel() {
    private val _state = MutableStateFlow(CoinListState())
    val state =
        _state
            .onStart { loadCoins() }
            .stateIn(
                viewModelScope,
                SharingStarted.WhileSubscribed(5000L),
                CoinListState(),
            )

    private val _event = Channel<CoinListEvent>()
    val event = _event.receiveAsFlow()

    fun onAction(action: CoinListActions) {
        when (action) {
            is CoinListActions.OnCoinClick -> TODO()
        }
    }

    private fun loadCoins() {
        viewModelScope.launch {
            _state.update { it.copy(isLoading = true) }

            coinDataSource
                .getCoins()
                .onSuccess { coins ->
                    _state.update { coinState ->
                        coinState.copy(
                            isLoading = false,
                            coins = coins.map { it.toCoinUi() },
                        )
                    }
                }.onError { error ->
                    _state.update {
                        it.copy(
                            isLoading = false,
                        )
                    }
                    _event.send(CoinListEvent.Error(error))
                }
        }
    }
}
