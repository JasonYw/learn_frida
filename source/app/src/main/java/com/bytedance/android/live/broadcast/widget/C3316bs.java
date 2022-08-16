package com.bytedance.android.live.broadcast.widget;

import android.view.ViewGroup;
import com.bytedance.android.live.broadcast.preview.base.AbstractC3175a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.broadcast.widget.bs */
/* loaded from: classes5.dex */
public final class C3316bs implements Comparable<C3316bs> {
    public static ChangeQuickRedirect LIZ;
    public final AbstractC3175a LIZIZ;
    public final ViewGroup LIZJ;
    public final String LIZLLL;

    /* renamed from: LJ */
    public int f26009LJ;

    static {
        Covode.recordClassIndex(18939);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(C3316bs c3316bs) {
        C3316bs c3316bs2 = c3316bs;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c3316bs2}, this, LIZ, false, 2);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        C106862S5w.LIZ(c3316bs2);
        return this.f26009LJ - c3316bs2.f26009LJ;
    }

    public C3316bs(AbstractC3175a abstractC3175a, ViewGroup viewGroup, String str, int i) {
        C106862S5w.LIZ(viewGroup, str);
        this.LIZIZ = abstractC3175a;
        this.LIZJ = viewGroup;
        this.LIZLLL = str;
        this.f26009LJ = i;
    }

    public /* synthetic */ C3316bs(AbstractC3175a abstractC3175a, ViewGroup viewGroup, String str, int i, int i2) {
        this(abstractC3175a, viewGroup, str, 99);
    }
}
