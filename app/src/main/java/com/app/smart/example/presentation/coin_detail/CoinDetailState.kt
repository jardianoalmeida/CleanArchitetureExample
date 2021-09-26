com.app.smart.examplecom.app.smart.examplecom.app.smart.examplepackage com.plcoding.cryptocurrencyappyt.presentation.coin_detail

import com.plcoding.cryptocurrencyappyt.domain.model.Coin
import com.plcoding.cryptocurrencyappyt.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)
