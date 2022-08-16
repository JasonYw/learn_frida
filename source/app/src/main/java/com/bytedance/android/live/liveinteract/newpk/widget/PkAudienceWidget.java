package com.bytedance.android.live.liveinteract.newpk.widget;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.newpk.p379vm.C4689c;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.disposables.Disposable;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import p003X.AbstractC4569445g;
import p003X.C106862S5w;
import p003X.C458614Br;
import p003X.IQV;

/* loaded from: classes3.dex */
public final class PkAudienceWidget extends PkBaseWidget<C4689c> implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;

    static {
        Covode.recordClassIndex(28769);
    }

    @Override // com.bytedance.android.live.liveinteract.newpk.widget.PkBaseWidget, com.bytedance.android.livesdk.chatroom.widget.RoomWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 3).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.liveinteract.newpk.widget.PkBaseWidget
    public final Pair<C4689c, Disposable> LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (Pair) proxy.result;
        }
        return IQV.LIZ((Function0) new PkAudienceWidget$createPkDataContext$1(this));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PkAudienceWidget(long j, long j2, C458614Br c458614Br) {
        super(j, j2, c458614Br);
        C106862S5w.LIZ(c458614Br);
    }
}
