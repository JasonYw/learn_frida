package com.bytedance.android.live.broadcast.bgbroadcast.game.window.adapter;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class LiveGameControlMenuListAdapter$menuItemList$2 extends Lambda implements Function0<List<C2943a>> {
    public static final LiveGameControlMenuListAdapter$menuItemList$2 INSTANCE = new LiveGameControlMenuListAdapter$menuItemList$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(14865);
    }

    public LiveGameControlMenuListAdapter$menuItemList$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.List<com.bytedance.android.live.broadcast.bgbroadcast.game.window.adapter.a>] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ List<C2943a> mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new ArrayList();
    }
}
