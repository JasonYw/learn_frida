package com.bytedance.android.live.liveinteract.plantform.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.concurrent.ConcurrentHashMap;
import p003X.C106862S5w;
import p003X.C412372Tv;

/* renamed from: com.bytedance.android.live.liveinteract.plantform.utils.ad */
/* loaded from: classes12.dex */
public final class C4829ad {
    public static ChangeQuickRedirect LIZ;
    public static boolean LIZIZ;
    public static final C412372Tv LIZJ = new C412372Tv((byte) 0);
    public final ConcurrentHashMap<Integer, AbstractC4831s> LIZLLL = new ConcurrentHashMap<>();

    static {
        Covode.recordClassIndex(29510);
    }

    public final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            return;
        }
        for (AbstractC4831s abstractC4831s : this.LIZLLL.values()) {
            abstractC4831s.LIZ();
        }
    }

    public final AbstractC4831s LIZ(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 5);
        if (proxy.isSupported) {
            return (AbstractC4831s) proxy.result;
        }
        return this.LIZLLL.get(Integer.valueOf(i));
    }

    public final C4829ad LIZ(int i, AbstractC4831s abstractC4831s) {
        boolean z;
        boolean z2 = true;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), abstractC4831s}, this, LIZ, false, 2);
        if (proxy.isSupported) {
            return (C4829ad) proxy.result;
        }
        C106862S5w.LIZ(abstractC4831s);
        if (this.LIZLLL.contains(Integer.valueOf(i))) {
            PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 4);
            if (proxy2.isSupported) {
                Object obj = proxy2.result;
            } else {
                AbstractC4831s remove = this.LIZLLL.remove(Integer.valueOf(i));
                if (remove != null) {
                    remove.LIZ();
                }
                if (this.LIZLLL.size() <= 1) {
                    z = true;
                } else {
                    z = false;
                }
                LIZIZ = z;
            }
        }
        this.LIZLLL.put(Integer.valueOf(i), abstractC4831s);
        if (this.LIZLLL.size() > 1) {
            z2 = false;
        }
        LIZIZ = z2;
        return this;
    }
}
