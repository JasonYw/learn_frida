package com.bytedance.android.live.broadcast.viewmodel.dialog;

import android.app.Dialog;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.bytedance.android.live.broadcast.api.IBroadcastDialogManager;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.p1594ss.android.ugc.aweme.experiment.ReDexClinitStringAb;
import p003X.C86502K6u;

/* loaded from: classes5.dex */
public class BroadcastDialogManager implements IBroadcastDialogManager {
    public static ChangeQuickRedirect changeQuickRedirect;
    public C86502K6u mDispatcher;

    static {
        if (ReDexClinitStringAb.abTest >= 5) {
            Covode.recordClassIndex(18142);
        } else {
            Covode.recordClassIndex(18142);
        }
    }

    public BroadcastDialogManager() {
        ServiceManager.registerService(IBroadcastDialogManager.class, this);
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastDialogManager
    public void promoteTasks() {
        C86502K6u c86502K6u;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2).isSupported && (c86502K6u = this.mDispatcher) != null) {
            c86502K6u.LIZ();
        }
    }

    public void setBroadcastDialgoDispatcher(C86502K6u c86502K6u) {
        this.mDispatcher = c86502K6u;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastDialogManager
    public void addDialogToMananger(Dialog dialog) {
        C86502K6u c86502K6u;
        if (!PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 3).isSupported && (c86502K6u = this.mDispatcher) != null) {
            c86502K6u.LIZ(dialog);
        }
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastDialogManager
    public void addToShow(int i, LifecycleOwner lifecycleOwner, Observer<Integer> observer) {
        C86502K6u c86502K6u;
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i), lifecycleOwner, observer}, this, changeQuickRedirect, false, 1).isSupported && (c86502K6u = this.mDispatcher) != null) {
            c86502K6u.LIZ(i, lifecycleOwner, observer);
        }
    }
}
