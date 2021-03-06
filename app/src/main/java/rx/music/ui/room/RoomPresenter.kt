package rx.music.ui.room

import com.arellomobile.mvp.InjectViewState
import com.arellomobile.mvp.MvpPresenter
import rx.music.business.audio.AudioInteractor
import rx.music.business.users.UsersInteractor
import rx.music.dagger.Dagger
import rx.music.ui.popular.RoomView
import javax.inject.Inject

/** Created by Maksim Sukhotski on 5/1/2017. */
@InjectViewState
class RoomPresenter : MvpPresenter<RoomView>() {
    @Inject lateinit var audioInteractor: AudioInteractor
    @Inject lateinit var usersInteractor: UsersInteractor

    override fun onFirstViewAttach() {
        super.onFirstViewAttach()
        Dagger.instance.userComponent?.inject(this)
//        usersInteractor.getAuthorized()
//                .subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread())
//                .filter { it.response?.isNotEmpty() ?: false }
//                .subscribe { viewState.showOnUserReceived(it) }
    }
}