package com.bytedance.android.live.broadcastgame.opengame.service;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.broadcastgame.opengame.service.b */
/* loaded from: classes.dex */
public final class C3720b {
    public static ChangeQuickRedirect LIZ;
    public final Lazy LIZJ = LazyKt__LazyJVMKt.lazy(Cache$fileMd5Cache$2.INSTANCE);
    public final Lazy LIZIZ = LazyKt__LazyJVMKt.lazy(Cache$bitmapMd5Record$2.INSTANCE);

    static {
        Covode.recordClassIndex(21086);
    }

    public final ConcurrentHashMap<String, String> LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        return (ConcurrentHashMap) (proxy.isSupported ? proxy.result : this.LIZJ.mo27335getValue());
    }

    public final void LIZ(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, LIZ, false, 6).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, str2);
        LIZ().put(str, str2);
    }
}
