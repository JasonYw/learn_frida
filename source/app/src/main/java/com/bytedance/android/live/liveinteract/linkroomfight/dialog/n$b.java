package com.bytedance.android.live.liveinteract.linkroomfight.dialog;

import com.bytedance.android.live.liveinteract.plantform.model.LinkPlayerInfo;
import com.bytedance.android.livesdkapi.depend.model.live.linker.C9540m;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.List;
import java.util.Objects;
import p003X.C106862S5w;

/* loaded from: classes3.dex */
public final class n$b {
    public static ChangeQuickRedirect LIZ;
    public final List<C9540m> LIZIZ;
    public final List<LinkPlayerInfo> LIZJ;
    public final String LIZLLL;

    /* renamed from: LJ */
    public final long f26337LJ;
    public final String LJFF;

    static {
        Covode.recordClassIndex(27766);
    }

    private Object[] LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{this.LIZIZ, this.LIZJ, this.LIZLLL, Long.valueOf(this.f26337LJ), this.LJFF};
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof n$b) {
            return C106862S5w.LIZ(((n$b) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("LinkRoomFightSelectGuestsDialog$Params:%s,%s,%s,%s,%s", LIZ());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public n$b(List<C9540m> list, List<? extends LinkPlayerInfo> list2, String str, long j, String str2) {
        C106862S5w.LIZ(list2, str, str2);
        this.LIZIZ = list;
        this.LIZJ = list2;
        this.LIZLLL = str;
        this.f26337LJ = j;
        this.LJFF = str2;
    }
}
