package com.bytedance.android.live.broadcast.widget;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.api.model.RoomCreateInfo;
import com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC4569445g;
import p003X.C4574547f;
import p003X.KKB;
import p003X.KKR;

/* loaded from: classes5.dex */
public class PreviewActivityBannerWidget extends AbsPreviewWidget implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;

    static {
        Covode.recordClassIndex(18392);
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbstractC3175a
    public final String LIZ() {
        return "PreviewActivityBannerWidget";
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public int getLayoutId() {
        return 2131698422;
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 9).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public void onCreate() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            return;
        }
        super.onCreate();
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public void onResume() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
            return;
        }
        super.onResume();
        LIZIZ();
    }

    private final void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 8).isSupported) {
            return;
        }
        LIZ(LJIIJJI().LIZ(new PreviewActivityBannerWidget$refreshBanner$1(this)));
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget
    public final void LIZ(LiveMode liveMode) {
        Boolean bool;
        if (PatchProxy.proxy(new Object[]{liveMode}, this, LIZ, false, 7).isSupported) {
            return;
        }
        super.LIZ(liveMode);
        RoomCreateInfo LIZ2 = LJIIJJI().LIZIZ().LIZ();
        if (LIZ2 != null) {
            bool = Boolean.valueOf(KKB.LIZ(LIZ2, LJIIJJI().LIZ().LIZ()));
        } else {
            bool = null;
        }
        if (liveMode != LiveMode.THIRD_PARTY && Intrinsics.areEqual(bool, Boolean.TRUE)) {
            LIZIZ();
        } else {
            LJIILL();
        }
    }

    public final void LIZ(String str, RoomCreateInfo roomCreateInfo, LiveMode liveMode) {
        String str2;
        RoomCreateInfo.C2893d LIZ2;
        if (PatchProxy.proxy(new Object[]{str, roomCreateInfo, liveMode}, this, LIZ, false, 6).isSupported) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("event_page", "live_takepage");
        KKR kkr = roomCreateInfo.LJJIIJZLJL;
        if (kkr == null || (LIZ2 = kkr.LIZ(liveMode)) == null || (str2 = LIZ2.LIZLLL) == null) {
            str2 = "'";
        }
        hashMap.put("banner_id", str2);
        C4574547f.LIZ().LIZ(str, hashMap, new Object[0]);
    }
}
