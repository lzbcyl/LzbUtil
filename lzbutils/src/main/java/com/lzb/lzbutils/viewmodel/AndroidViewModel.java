package com.lzb.lzbutils.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;

/**
 * Subclasses must have a constructor which accepts {@link Application} as the only parameter.
 */
public class AndroidViewModel extends ViewModel {
    private Application mApplication;

    public AndroidViewModel(@NonNull Application application) {
        mApplication = application;
    }

    /**
     * Return the application.
     */
    @SuppressWarnings({"TypeParameterUnusedInFormals", "unchecked"})
    @NonNull
    public <T extends Application> T getApplication() {
        return (T) mApplication;
    }
}
