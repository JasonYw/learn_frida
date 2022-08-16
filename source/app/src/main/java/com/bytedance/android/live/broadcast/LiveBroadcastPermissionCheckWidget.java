package com.bytedance.android.live.broadcast;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.core.tetris.widgets.LiveWidget;
import com.bytedance.android.live.permissioncheck.interceptors.AbstractC5186a;
import com.bytedance.android.live.permissioncheck.p407c.C5184a;
import com.bytedance.android.live.permissioncheck.p407c.C5185b;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import java.util.ArrayList;
import p003X.AbstractC413402Xu;
import p003X.AbstractC4569445g;
import p003X.C106862S5w;
import p003X.C2WC;
import p003X.C91282Lxk;
import p003X.I06;
import p003X.I07;
import p003X.I08;
import p003X.IN0;

/* loaded from: classes3.dex */
public final class LiveBroadcastPermissionCheckWidget extends LiveWidget implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public DataCenter LIZLLL;
    public IN0 LIZIZ = new IN0();
    public C5185b LIZJ = new C5185b();

    /* renamed from: LJ */
    public LiveMode f25768LJ = LiveMode.UNDEFINED;

    static {
        Covode.recordClassIndex(14298);
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 3).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onCreate() {
        C2WC<C5184a> LJFF;
        AbstractC413402Xu<Boolean> m15622LJ;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            return;
        }
        super.onCreate();
        DataCenter dataCenter = this.LIZLLL;
        if (dataCenter != null) {
            this.LIZIZ = new IN0();
            this.LIZJ = new C5185b();
            this.LIZJ.LIZ().LIZ(new C5184a(this.f25768LJ, 0L, 2));
            I08 i08 = I08.LJFF;
            IN0 in0 = this.LIZIZ;
            C5185b c5185b = this.LIZJ;
            if (!PatchProxy.proxy(new Object[]{in0, c5185b, dataCenter}, i08, I08.LIZ, false, 6).isSupported) {
                C106862S5w.LIZ(in0, dataCenter);
                if (i08.LIZ(c5185b)) {
                    I08.LIZLLL = c5185b;
                    if (c5185b != null && (m15622LJ = c5185b.m15622LJ()) != null) {
                        m15622LJ.LIZIZ(Boolean.TRUE);
                    }
                    C5185b c5185b2 = I08.LIZLLL;
                    if (c5185b2 != null && (LJFF = c5185b2.LJFF()) != null) {
                        LJFF.LIZ(new C5184a(Boolean.FALSE, 0L, 2));
                    }
                    dataCenter.observe("data_broadcast_pause_state", new I06(dataCenter));
                    dataCenter.observe("cmd_anchor_broadcast_end", I07.LIZIZ);
                    if (!I08.LIZIZ.contains(in0)) {
                        ArrayList<AbstractC5186a> arrayList = I08.LIZIZ;
                        in0.LJII = I08.LIZLLL;
                        in0.LIZ();
                        arrayList.add(in0);
                        C91282Lxk.LIZJ.LIZ();
                    }
                }
            }
        }
    }
}
