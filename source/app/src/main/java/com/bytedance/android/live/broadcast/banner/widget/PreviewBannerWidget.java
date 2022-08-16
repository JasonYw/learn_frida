package com.bytedance.android.live.broadcast.banner.widget;

import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.android.live.broadcast.api.model.RoomCreateInfo;
import com.bytedance.android.live.broadcast.banner.view.AutoScrollViewPager;
import com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget;
import com.bytedance.android.live.user.IUserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC4569445g;
import p003X.C3VF;
import p003X.C413672Yv;
import p003X.C4574547f;
import p003X.C86863KKr;
import p003X.KKB;

/* loaded from: classes5.dex */
public final class PreviewBannerWidget extends AbsPreviewWidget implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public C86863KKr LIZIZ;
    public LiveMode LIZJ;
    public boolean LIZLLL;

    static {
        Covode.recordClassIndex(14653);
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbstractC3175a
    public final String LIZ() {
        return "PreviewBannerWidget";
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final int getLayoutId() {
        return 2131698434;
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 9).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    private final void LIZJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 6).isSupported) {
            return;
        }
        LIZ(LJIIJJI().LIZ(new PreviewBannerWidget$refreshBanner$1(this)));
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onCreate() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            return;
        }
        super.onCreate();
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onResume() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
            return;
        }
        super.onResume();
        LIZJ();
    }

    public final void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 7).isSupported) {
            return;
        }
        ViewGroup viewGroup = this.containerView;
        Intrinsics.checkNotNullExpressionValue(viewGroup, "");
        AutoScrollViewPager autoScrollViewPager = (AutoScrollViewPager) viewGroup.findViewById(2131193084);
        if (autoScrollViewPager != null) {
            autoScrollViewPager.LIZ();
        }
        C86863KKr c86863KKr = this.LIZIZ;
        if (c86863KKr != null) {
            c86863KKr.LIZIZ = null;
        }
        LJIILL();
        this.LIZLLL = false;
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
            return;
        }
        super.onDestroy();
        this.LIZJ = null;
        ViewGroup viewGroup = this.containerView;
        Intrinsics.checkNotNullExpressionValue(viewGroup, "");
        ViewPager viewPager = (ViewPager) viewGroup.findViewById(2131193084);
        if (viewPager != null) {
            viewPager.setAdapter(null);
        }
        this.LIZIZ = null;
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget
    public final void LIZ(LiveMode liveMode) {
        Boolean bool;
        if (PatchProxy.proxy(new Object[]{liveMode}, this, LIZ, false, 5).isSupported) {
            return;
        }
        super.LIZ(liveMode);
        if (liveMode != null) {
            RoomCreateInfo LIZ2 = LJIIJJI().LIZIZ().LIZ();
            if (LIZ2 != null) {
                bool = Boolean.valueOf(KKB.LIZIZ(LIZ2, LJIIJJI().LIZ().LIZ()));
            } else {
                bool = null;
            }
            if (liveMode != LiveMode.THIRD_PARTY && Intrinsics.areEqual(bool, Boolean.TRUE)) {
                LIZJ();
            } else {
                LIZIZ();
            }
        }
    }

    public final void LIZ(String str, RoomCreateInfo.C2893d c2893d, LiveMode liveMode) {
        C3VF user;
        String valueOf;
        if (!PatchProxy.proxy(new Object[]{str, c2893d, liveMode}, this, LIZ, false, 8).isSupported && c2893d != null) {
            HashMap hashMap = new HashMap();
            String str2 = null;
            Long l = c2893d.f25776LJ;
            if (l != null) {
                if (l.longValue() == 1) {
                    if (Intrinsics.areEqual(str, "CLICK")) {
                        str2 = "live_banner_click";
                    } else if (Intrinsics.areEqual(str, "EXPOSURE")) {
                        str2 = "live_banner_show";
                    }
                    hashMap.put("event_page", "live_takepage");
                    String str3 = c2893d.LIZLLL;
                    if (str3 != null) {
                        hashMap.put("banner_id", str3);
                    }
                } else if (l.longValue() == 2) {
                    if (Intrinsics.areEqual(str, "CLICK")) {
                        str2 = "livesdk_live_mission_banner_click";
                    } else if (Intrinsics.areEqual(str, "EXPOSURE")) {
                        str2 = "livesdk_live_mission_banner_show";
                    }
                    String str4 = c2893d.LIZLLL;
                    if (str4 != null) {
                        hashMap.put("mission_id", str4);
                    }
                    String str5 = c2893d.LJFF;
                    if (str5 != null) {
                        hashMap.put("life_cycle", str5);
                    }
                }
            }
            if (liveMode != null) {
                int i = C413672Yv.LIZ[liveMode.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            hashMap.put("live_type", "game");
                        }
                    } else {
                        hashMap.put("live_type", "voice");
                    }
                } else {
                    hashMap.put("live_type", "video");
                }
            }
            IUserService iUserService = (IUserService) ServiceManager.getService(IUserService.class);
            if (iUserService != null && (user = iUserService.user()) != null && (valueOf = String.valueOf(user.LIZIZ())) != null) {
                hashMap.put("anchor_id", valueOf);
            }
            if (str2 != null) {
                C4574547f.LIZ().LIZ(str2, hashMap, new Object[0]);
            }
        }
    }
}
