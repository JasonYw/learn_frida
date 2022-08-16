package com.bytedance.android.live.liveinteract.videotalk.p391ui;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.bytedance.android.live.core.tetris.layer.core.event.AbstractC4106a;
import com.bytedance.android.live.core.tetris.layer.core.event.C4108b;
import com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.KVData;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import p003X.AbstractC4569445g;
import p003X.C106862S5w;
import p003X.C2HO;

/* renamed from: com.bytedance.android.live.liveinteract.videotalk.ui.AnchorSilenceStatusWidget */
/* loaded from: classes12.dex */
public final class AnchorSilenceStatusWidget extends LiveRecyclableWidget implements Observer<KVData>, AbstractC4106a, AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;

    static {
        Covode.recordClassIndex(30432);
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final int getLayoutId() {
        return 2131700795;
    }

    @Override // androidx.lifecycle.Observer
    public final /* bridge */ /* synthetic */ void onChanged(KVData kVData) {
    }

    @Override // com.bytedance.android.live.core.tetris.layer.core.event.AbstractC4106a
    public final void onEvent(C4108b c4108b) {
        if (PatchProxy.proxy(new Object[]{c4108b}, this, LIZ, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(c4108b);
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public final void onLoad(Object[] objArr) {
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 3).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public final void onUnload() {
    }

    @Override // com.bytedance.android.live.core.tetris.layer.core.event.AbstractC4106a
    public final List<Class<? extends C4108b>> LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (List) proxy.result;
        }
        return CollectionsKt__CollectionsJVMKt.listOf(C2HO.class);
    }
}
