package com.bytedance.android.live.broadcastgame;

import com.bytedance.android.live.broadcastgame.api.interactgame.m$b;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class AnchorGameStatusDispatcher$listeners$2 extends Lambda implements Function0<Set<m$b>> {
    public static final AnchorGameStatusDispatcher$listeners$2 INSTANCE = new AnchorGameStatusDispatcher$listeners$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(18992);
    }

    public AnchorGameStatusDispatcher$listeners$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.Set<com.bytedance.android.live.broadcastgame.api.interactgame.m$b>, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Set<m$b> mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new LinkedHashSet();
    }
}
