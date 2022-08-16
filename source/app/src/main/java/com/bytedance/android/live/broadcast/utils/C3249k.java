package com.bytedance.android.live.broadcast.utils;

import com.bytedance.android.live.broadcast.api.BroadcastRoomApi;
import com.bytedance.android.live.broadcast.api.BroadcastUserApi;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.C425332sJ;

/* renamed from: com.bytedance.android.live.broadcast.utils.k */
/* loaded from: classes5.dex */
public final class C3249k {
    public static ChangeQuickRedirect LIZ;

    static {
        Covode.recordClassIndex(18037);
    }

    public C3249k() {
    }

    public final BroadcastRoomApi LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        if (proxy.isSupported) {
            return (BroadcastRoomApi) proxy.result;
        }
        return (BroadcastRoomApi) C425332sJ.LIZIZ.LIZ(BroadcastRoomApi.class);
    }

    public final BroadcastUserApi LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        if (proxy.isSupported) {
            return (BroadcastUserApi) proxy.result;
        }
        return (BroadcastUserApi) C425332sJ.LIZIZ.LIZ(BroadcastUserApi.class);
    }

    public /* synthetic */ C3249k(byte b) {
        this();
    }
}
