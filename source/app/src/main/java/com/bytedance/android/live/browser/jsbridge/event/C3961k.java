package com.bytedance.android.live.browser.jsbridge.event;

import com.bytedance.android.live.base.model.emoji.SelfEmoji;
import com.bytedance.android.livesdkapi.depend.model.live.episode.C9506e;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.List;
import java.util.Objects;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.browser.jsbridge.event.k */
/* loaded from: classes12.dex */
public final class C3961k {
    public static ChangeQuickRedirect LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;
    public final String LIZLLL;

    /* renamed from: LJ */
    public final String f26141LJ;
    public final AbstractC3962a LJFF;
    public final List<String> LJI;
    public final int LJII;
    public final C3960j LJIIIIZZ;

    /* renamed from: com.bytedance.android.live.browser.jsbridge.event.k$a */
    /* loaded from: classes12.dex */
    public interface AbstractC3962a {
        static {
            Covode.recordClassIndex(22309);
        }

        void LIZ();

        void LIZ(CharSequence charSequence, SelfEmoji selfEmoji, List<C9506e> list);
    }

    static {
        Covode.recordClassIndex(22308);
    }

    private Object[] LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{this.LIZIZ, Boolean.valueOf(this.LIZJ), this.LIZLLL, this.f26141LJ, this.LJFF, this.LJI, Integer.valueOf(this.LJII), this.LJIIIIZZ};
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3961k) {
            return C106862S5w.LIZ(((C3961k) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("OpenCommentPanelEvent:%s,%s,%s,%s,%s,%s,%s,%s", LIZ());
    }

    public C3961k(String str, boolean z, String str2, String str3, AbstractC3962a abstractC3962a, List<String> list, int i, C3960j c3960j) {
        C106862S5w.LIZ(str2, str3, abstractC3962a, c3960j);
        this.LIZIZ = str;
        this.LIZJ = z;
        this.LIZLLL = str2;
        this.f26141LJ = str3;
        this.LJFF = abstractC3962a;
        this.LJI = list;
        this.LJII = i;
        this.LJIIIIZZ = c3960j;
    }

    public /* synthetic */ C3961k(String str, boolean z, String str2, String str3, AbstractC3962a abstractC3962a, List list, int i, C3960j c3960j, int i2) {
        this(null, true, str2, str3, abstractC3962a, null, 0, new C3960j(null, null, null, null, null, null, null, null, null, null, 1023));
    }
}
