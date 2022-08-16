package com.bytedance.android.live.liveinteract.api;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.chatroom.widget.RoomWidget;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.AbstractC412722Ve;
import p003X.AbstractC4569445g;

/* loaded from: classes12.dex */
public abstract class BaseLinkRevControlWidget extends RoomWidget implements AbstractC412722Ve, AbstractC4569445g {

    /* renamed from: b_ */
    public static ChangeQuickRedirect f26250b_;

    static {
        Covode.recordClassIndex(25098);
    }

    public abstract void LIZ(Room room);

    @Override // com.bytedance.android.livesdk.chatroom.widget.RoomWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, f26250b_, false, 1).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }
}
