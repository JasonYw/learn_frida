package com.bytedance.android.live.profit.fansclub.widget;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.profit.fansclub.AbstractC5268p;
import com.bytedance.android.live.profit.fansclub.FansClubEntranceParams;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p002O.C0002O;
import p003X.AbstractC4569445g;

/* loaded from: classes12.dex */
public final class OvalFollowFansClubWidget extends FansClubWidget implements AbstractC4569445g {
    public static ChangeQuickRedirect LJIILL;

    static {
        Covode.recordClassIndex(33359);
    }

    @Override // com.bytedance.android.live.profit.fansclub.widget.FansClubWidget
    public final void LIZ(boolean z) {
    }

    @Override // p003X.C4BQ
    public final int LJIIJ() {
        return 2130857621;
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final int getLayoutId() {
        return 2131700012;
    }

    @Override // com.bytedance.android.live.profit.fansclub.widget.FansClubWidget, com.bytedance.android.livesdk.chatroom.widget.RoomRecyclableWidget, com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LJIILL, false, 10).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    private final boolean LJIJ() {
        if (this.LJIILJJIL && this.LJIILIIL) {
            return true;
        }
        return false;
    }

    @Override // p003X.C4BQ
    public final int LJIIJJI() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LJIILL, false, 1);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        if (LJIJ()) {
            return 2130858261;
        }
        return 2130857620;
    }

    @Override // p003X.C4BQ
    public final int LJIIL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LJIILL, false, 2);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        if (LJIJ()) {
            return 2130858192;
        }
        return 2130857619;
    }

    @Override // p003X.C4BQ
    public final int LJIILIIL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LJIILL, false, 3);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        if (LJIJ()) {
            return 2130858192;
        }
        return 2130858038;
    }

    @Override // p003X.C4BQ
    public final String LJIILJJIL() {
        String str;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LJIILL, false, 4);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        if (LJIJ()) {
            str = "ttlive_vs_user_follow_animator.webp";
        } else {
            str = "ttlive_user_follow_animator_new.webp";
        }
        return C0002O.m25086C("asset://com.ss.android.ies.live.sdk/", str);
    }

    @Override // p003X.C4BQ
    public final String LJIILL() {
        String str;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LJIILL, false, 5);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        if (LJIJ()) {
            str = "ttlive_vs_user_join_fan_club_guid_animator.webp";
        } else {
            str = "ttlive_user_join_fan_club_guid_animator_new.webp";
        }
        return C0002O.m25086C("asset://com.ss.android.ies.live.sdk/", str);
    }

    @Override // p003X.C4BQ
    public final String LJIILLIIL() {
        String str;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LJIILL, false, 6);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        if (LJIJ()) {
            str = "ttlive_vs_user_join_fan_club_guid_animator.webp";
        } else {
            str = "ttlive_user_fansclub_icon_active_guide.webp";
        }
        return C0002O.m25086C("asset://com.ss.android.ies.live.sdk/", str);
    }

    @Override // p003X.C4BQ
    public final String LJIIZILJ() {
        String str;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LJIILL, false, 7);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        if (LJIJ()) {
            str = "ttlive_vs_user_join_fan_club_guid_animator.webp";
        } else {
            str = "ttlive_user_fansclub_renew_icon.webp";
        }
        return C0002O.m25086C("asset://com.ss.android.ies.live.sdk/", str);
    }

    @Override // com.bytedance.android.live.profit.fansclub.widget.FansClubWidget
    public final void LJIIIZ() {
        String str;
        if (PatchProxy.proxy(new Object[0], this, LJIILL, false, 9).isSupported) {
            return;
        }
        AbstractC5268p LIZ = LIZIZ().LIZ(new FansClubEntranceParams(FansClubEntranceParams.Page.Default, LJIJ(), "fans_club_button", "top", null, null, m15617LJ(), 48));
        if (LIZ != null) {
            LIZ.LIZ();
        }
        if (LJIJ()) {
            str = "livesdk_fans_club_icon_click";
        } else {
            str = "livesdk_fans_club_bottom_entrance_click";
        }
        LIZ(str);
    }

    public OvalFollowFansClubWidget(boolean z) {
        super(z);
    }

    @Override // p003X.C4BQ
    public final void LIZJ(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LJIILL, false, 8).isSupported) {
            return;
        }
        LIZIZ().LJIIIIZZ().LIZ(Integer.valueOf(i));
    }
}
