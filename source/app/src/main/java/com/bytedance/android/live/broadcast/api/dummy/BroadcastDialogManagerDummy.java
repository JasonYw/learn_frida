package com.bytedance.android.live.broadcast.api.dummy;

import android.app.Dialog;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.bytedance.android.live.broadcast.api.IBroadcastDialogManager;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.covode.number.Covode;

/* loaded from: classes.dex */
public final class BroadcastDialogManagerDummy implements IBroadcastDialogManager {
    static {
        Covode.recordClassIndex(14431);
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastDialogManager
    public final void addDialogToMananger(Dialog dialog) {
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastDialogManager
    public final void addToShow(int i, LifecycleOwner lifecycleOwner, Observer<Integer> observer) {
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastDialogManager
    public final void promoteTasks() {
    }

    public BroadcastDialogManagerDummy() {
        ServiceManager.registerService(IBroadcastDialogManager.class, this);
    }
}
