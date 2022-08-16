package com.bytedance.android.live.broadcast.api;

import android.app.Dialog;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.bytedance.android.live.base.IService;
import com.bytedance.covode.number.Covode;

/* loaded from: classes.dex */
public interface IBroadcastDialogManager extends IService {
    static {
        Covode.recordClassIndex(14396);
    }

    void addDialogToMananger(Dialog dialog);

    void addToShow(int i, LifecycleOwner lifecycleOwner, Observer<Integer> observer);

    void promoteTasks();
}
