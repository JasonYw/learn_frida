package com.bytedance.android.live.broadcast.widget;

import android.view.View;
import android.widget.TextView;
import com.bytedance.android.livesdk.popup.C9163d;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* renamed from: com.bytedance.android.live.broadcast.widget.av */
/* loaded from: classes5.dex */
public final class C3313av {
    public static ChangeQuickRedirect LIZ;
    public TextView LIZIZ;
    public View LIZJ;
    public View LIZLLL;

    /* renamed from: LJ */
    public C9163d f26008LJ;
    public String LJFF = "";

    static {
        Covode.recordClassIndex(18907);
    }

    public final boolean LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C9163d c9163d = this.f26008LJ;
        if (c9163d == null) {
            return false;
        }
        return c9163d.m15297LJ();
    }
}
