package com.bytedance.android.live.broadcast.api.model;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p003X.C106862S5w;
import p003X.C77947Go9;

/* renamed from: com.bytedance.android.live.broadcast.api.model.i */
/* loaded from: classes3.dex */
public final class C2912i {
    public static ChangeQuickRedirect LIZ;
    @SerializedName("star_status")
    public final int LIZIZ;
    @SerializedName("star_info")
    public final C77947Go9 LIZJ;
    @SerializedName("star_tasks")
    public final List<C2907c> LIZLLL;
    @SerializedName("is_show_icon")

    /* renamed from: LJ */
    public final int f25780LJ;
    @SerializedName("has_new_task")
    public final int LJFF;
    @SerializedName("is_show_yellow")
    public final int LJI;

    static {
        Covode.recordClassIndex(14560);
    }

    private Object[] LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{Integer.valueOf(this.LIZIZ), this.LIZJ, this.LIZLLL, Integer.valueOf(this.f25780LJ), Integer.valueOf(this.LJFF), Integer.valueOf(this.LJI)};
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 7);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2912i) {
            return C106862S5w.LIZ(((C2912i) obj).LIZIZ(), LIZIZ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 8);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZIZ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 9);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("GetAnchorStarStatusResponseData:%s,%s,%s,%s,%s,%s", LIZIZ());
    }

    public final C2907c LIZ() {
        Object obj;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        if (proxy.isSupported) {
            return (C2907c) proxy.result;
        }
        Iterator<T> it = this.LIZLLL.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((C2907c) obj).LIZLLL == 1) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (C2907c) obj;
    }
}
