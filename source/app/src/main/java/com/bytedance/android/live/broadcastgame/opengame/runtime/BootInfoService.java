package com.bytedance.android.live.broadcastgame.opengame.runtime;

import com.bytedance.android.live.broadcastgame.api.openplatform.PluginType;
import com.bytedance.android.live.broadcastgame.opengame.network.C3531a;
import com.bytedance.android.live.broadcastgame.opengame.network.C3599x;
import com.bytedance.android.live.broadcastgame.opengame.network.OpenGameApi;
import com.bytedance.android.live.broadcastgame.opengame.service.p297a.AbstractC3719c;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.unisus.uniservice.logger.LoggerUtil;
import io.reactivex.Observable;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;
import p003X.C75771Fu9;
import p003X.C87369Kbj;

/* loaded from: classes5.dex */
public final class BootInfoService implements AbstractC3719c {
    public static ChangeQuickRedirect LIZ;
    public final Lazy LIZIZ = LazyKt__LazyJVMKt.lazy(new BootInfoService$bootInfo$2(this));
    public C3682x LIZJ;

    static {
        Covode.recordClassIndex(20834);
    }

    public final C3657d LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        return (C3657d) (proxy.isSupported ? proxy.result : this.LIZIZ.mo27335getValue());
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.service.p297a.AbstractC3719c
    public final void LIZIZ() {
        boolean z = PatchProxy.proxy(new Object[0], this, LIZ, false, 21).isSupported;
    }

    public final C3682x LJFF() {
        return this.LIZJ;
    }

    /* renamed from: LJ */
    public final String m15842LJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 16);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        C3657d LIZ2 = LIZ();
        if (LIZ2 != null) {
            return LIZ2.LIZIZ;
        }
        return null;
    }

    public final String LIZLLL() {
        C3658f c3658f;
        String str;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 15);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        C3657d LIZ2 = LIZ();
        if (LIZ2 == null || (c3658f = LIZ2.LIZJ) == null || (str = c3658f.LJI) == null) {
            return LoggerUtil.UNKNOWN;
        }
        return str;
    }

    public final boolean LIZJ() {
        C3658f c3658f;
        List<C3531a.C3532a> list;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C3657d LIZ2 = LIZ();
        if (LIZ2 == null || (c3658f = LIZ2.LIZJ) == null || (list = c3658f.LIZIZ) == null) {
            return false;
        }
        for (C3531a.C3532a c3532a : list) {
            if (Intrinsics.areEqual(c3532a.LIZ, "propRewardMsgNotifyCenter")) {
                return true;
            }
        }
        return false;
    }

    public BootInfoService(C3682x c3682x) {
        C106862S5w.LIZ(c3682x);
        this.LIZJ = c3682x;
    }

    public final String LIZ(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 19);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        C106862S5w.LIZ(str);
        long LJIIIIZZ = LJFF().LJIIIIZZ();
        String m15842LJ = m15842LJ();
        if (m15842LJ != null && str.length() != 0) {
            return C75771Fu9.LIZIZ.LIZ(str, LJIIIIZZ, m15842LJ);
        }
        return null;
    }

    public final long LIZ(String str, String str2) {
        C3658f c3658f;
        List<C3531a.C3532a> list;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, str2}, this, LIZ, false, 9);
        if (proxy.isSupported) {
            return ((Long) proxy.result).longValue();
        }
        C106862S5w.LIZ(str, str2);
        C3657d LIZ2 = LIZ();
        if (LIZ2 != null && (c3658f = LIZ2.LIZJ) != null && (list = c3658f.LIZIZ) != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C3531a.C3532a c3532a = (C3531a.C3532a) it.next();
                if (Intrinsics.areEqual(str2, c3532a.LIZ) && c3532a.LIZLLL != null) {
                    Long l = c3532a.LIZLLL.get(str);
                    if (l != null) {
                        return l.longValue();
                    }
                }
            }
        }
        return 0L;
    }

    public final Observable<C3657d> LIZ(String str, long j, PluginType pluginType) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, new Long(j), pluginType}, this, LIZ, false, 11);
        if (proxy.isSupported) {
            return (Observable) proxy.result;
        }
        C106862S5w.LIZ(str, pluginType);
        Observable map = ((OpenGameApi) C3599x.LIZJ.LIZ().LIZ(OpenGameApi.class)).getBootConfig(str, j).map(new C87369Kbj(this, str));
        Intrinsics.checkNotNullExpressionValue(map, "");
        return map;
    }
}
