package com.bytedance.android.live.liveinteract.chatroom.chatroom;

import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.core.tetris.widgets.LiveWidget;
import com.bytedance.android.live.linkpk.LinkCrossRoomDataHolder;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.AbstractC4569445g;

/* loaded from: classes3.dex */
public abstract class LinkSubWidget extends LiveWidget implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public boolean LIZIZ;

    static {
        Covode.recordClassIndex(25297);
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 2).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public void onCreate() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            return;
        }
        super.onCreate();
        LinkCrossRoomDataHolder.LJII();
        this.dataCenter.get("data_room");
        this.LIZIZ = ((Boolean) this.dataCenter.get("data_is_anchor")).booleanValue();
    }

    public LinkSubWidget(View view, ViewGroup viewGroup) {
        this.contentView = view;
        this.containerView = viewGroup;
    }
}
