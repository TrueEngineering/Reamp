package etr.android.reamp.mvp;

import android.content.Context;


public interface MvpView<SM extends MvpStateModel> {

    Context getContext();

    void onStateChanged(SM stateModel);

    void onError(Throwable throwable);

    String getMvpId();
}