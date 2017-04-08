package suhockii.rxmusic.ui.login

import com.arellomobile.mvp.MvpView
import com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy
import com.arellomobile.mvp.viewstate.strategy.SkipStrategy
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType
import suhockii.rxmusic.data.repositories.auth.models.Captcha
import suhockii.rxmusic.data.repositories.auth.models.Validation

/** Created by Maksim Sukhotski on 4/1/2017.*/
@StateStrategyType(AddToEndSingleStrategy::class)
interface LoginView : MvpView {

    @StateStrategyType(SkipStrategy::class)
    fun showSnackbar(text: String)

    fun showCaptcha(captcha: Captcha)

    fun showValidate(validation: Validation)

    fun showLogin(toString: String)

    @StateStrategyType(SkipStrategy::class)
    fun showNextController()
}