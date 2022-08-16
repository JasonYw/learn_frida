package com.bytedance.android.live.broadcast.widget;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.IUser;
import com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget;
import com.bytedance.android.live.user.IUserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC4569445g;
import p003X.C413602Yo;
import p003X.C421352lt;
import p003X.C439993ar;
import p003X.C4574547f;
import p003X.C77347GeT;

/* loaded from: classes12.dex */
public final class PreviewConfirmReplayWidget extends AbsPreviewWidget implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public final Lazy LIZIZ = C77347GeT.LIZ(new PreviewConfirmReplayWidget$dialog$2(this));

    static {
        Covode.recordClassIndex(18472);
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbstractC3175a
    public final String LIZ() {
        return "PreviewConfirmReplayWidget";
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 6).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onCreate() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
            return;
        }
        super.onCreate();
        LIZ(C413602Yo.LIZ(LJIIJJI().LIZIZ(), new PreviewConfirmReplayWidget$onCreate$1(this)));
    }

    public final void LIZ(boolean z) {
        FragmentActivity LIZIZ;
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 3).isSupported && (LIZIZ = C439993ar.LIZIZ(this.context)) != null) {
            C421352lt.LIZIZ.LIZ(LIZIZ, 4, z, 0L, PreviewConfirmReplayWidget$updateReplaySetting$1$1.INSTANCE, PreviewConfirmReplayWidget$updateReplaySetting$1$2.INSTANCE);
        }
    }

    public final void LIZIZ(boolean z) {
        String str;
        String str2;
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 4).isSupported) {
            return;
        }
        C4574547f LIZ2 = C4574547f.LIZ();
        HashMap hashMap = new HashMap();
        if (z) {
            str = "on";
        } else {
            str = "off";
        }
        hashMap.put("is_open", str);
        hashMap.put("request_page", "live_start");
        IUser LIZ3 = ((IUserService) ServiceManager.getService(IUserService.class)).user().LIZ();
        Intrinsics.checkNotNullExpressionValue(LIZ3, "");
        if (LIZ3.isEnableShowCommerceSale()) {
            str2 = "1";
        } else {
            str2 = "0";
        }
        hashMap.put("is_ecom", str2);
        hashMap.put("anchor_id", String.valueOf(((IUserService) ServiceManager.getService(IUserService.class)).user().LIZIZ()));
        hashMap.put("live_status_type", "live_before");
        hashMap.put("room_id", "");
        hashMap.put("_param_live_platform", "live");
        LIZ2.LIZ("livesdk_click_explain_replay_toggle_confirm_window", hashMap, new Object[0]);
    }
}
