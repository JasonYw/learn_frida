package com.bytedance.android.live.liveinteract.wrds;

import com.bytedance.android.livesdk.wrds.C9415a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class LinkWRDSHelper$getLinkRoomDataSyncModel$1 extends Lambda implements Function0<C9415a> {
    public static final LinkWRDSHelper$getLinkRoomDataSyncModel$1 INSTANCE = new LinkWRDSHelper$getLinkRoomDataSyncModel$1();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(32083);
    }

    public LinkWRDSHelper$getLinkRoomDataSyncModel$1() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, com.bytedance.android.livesdk.wrds.a] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C9415a mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new C9415a();
    }
}
