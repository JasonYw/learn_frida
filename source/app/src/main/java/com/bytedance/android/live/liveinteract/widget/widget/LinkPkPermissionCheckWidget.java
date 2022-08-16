package com.bytedance.android.live.liveinteract.widget.widget;

import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.LinkSubWidget;
import com.bytedance.android.live.permissioncheck.p407c.C5184a;
import com.bytedance.android.live.permissioncheck.p407c.C5185b;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.KVData;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC4569445g;
import p003X.C2TE;

/* loaded from: classes3.dex */
public final class LinkPkPermissionCheckWidget extends LinkSubWidget implements Observer<KVData>, AbstractC4569445g {
    public static ChangeQuickRedirect LIZJ;
    public final Lazy LIZLLL;

    static {
        Covode.recordClassIndex(31937);
    }

    @Override // com.bytedance.android.live.liveinteract.chatroom.chatroom.LinkSubWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZJ, false, 5).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.liveinteract.chatroom.chatroom.LinkSubWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onCreate() {
        if (PatchProxy.proxy(new Object[0], this, LIZJ, false, 3).isSupported) {
            return;
        }
        super.onCreate();
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LIZJ, false, 4).isSupported) {
            return;
        }
        super.onDestroy();
    }

    @Override // androidx.lifecycle.Observer
    public final /* synthetic */ void onChanged(KVData kVData) {
        Object mo27335getValue;
        Object LIZ;
        KVData kVData2 = kVData;
        if (!PatchProxy.proxy(new Object[]{kVData2}, this, LIZJ, false, 2).isSupported && kVData2 != null && !TextUtils.isEmpty(kVData2.getKey())) {
            String key = kVData2.getKey();
            if (key.hashCode() == -362596638 && key.equals("data_room_comment_is_audio_recording")) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZJ, false, 1);
                if (proxy.isSupported) {
                    mo27335getValue = proxy.result;
                } else {
                    mo27335getValue = this.LIZLLL.mo27335getValue();
                }
                C5185b c5185b = (C5185b) mo27335getValue;
                PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], c5185b, C5185b.LIZ, false, 24);
                if (proxy2.isSupported) {
                    LIZ = proxy2.result;
                } else {
                    LIZ = c5185b.LIZJ.LIZ(c5185b, C5185b.LIZIZ[22]);
                }
                C2TE c2te = (C2TE) LIZ;
                Object data = kVData2.getData(Boolean.TRUE);
                if (data == null) {
                    data = Boolean.TRUE;
                }
                Intrinsics.checkNotNullExpressionValue(data, "");
                c2te.LIZ(new C5184a(data, 0L, 2));
            }
        }
    }
}
