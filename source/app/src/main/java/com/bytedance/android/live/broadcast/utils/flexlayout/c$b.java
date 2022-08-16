package com.bytedance.android.live.broadcast.utils.flexlayout;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes19.dex */
public class c$b implements Comparable<c$b> {
    public static ChangeQuickRedirect LIZ;
    public int LIZIZ;
    public int LIZJ;

    static {
        Covode.recordClassIndex(18031);
    }

    public c$b() {
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return "Order{order=" + this.LIZJ + ", index=" + this.LIZIZ + '}';
    }

    public /* synthetic */ c$b(byte b) {
        this();
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(c$b c_b) {
        c$b c_b2 = c_b;
        int i = this.LIZJ;
        int i2 = c_b2.LIZJ;
        if (i != i2) {
            return i - i2;
        }
        return this.LIZIZ - c_b2.LIZIZ;
    }
}
