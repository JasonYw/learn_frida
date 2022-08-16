package com.bytedance.android.live.playtogether.p410ui.adapter;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.bytedance.android.live.playtogether.ui.adapter.PlayTogetherAnchorFloatWindowAdapter$members$2 */
/* loaded from: classes.dex */
public final class PlayTogetherAnchorFloatWindowAdapter$members$2 extends Lambda implements Function0<List<Object>> {
    public static final PlayTogetherAnchorFloatWindowAdapter$members$2 INSTANCE = new PlayTogetherAnchorFloatWindowAdapter$members$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(33133);
    }

    public PlayTogetherAnchorFloatWindowAdapter$members$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.List<java.lang.Object>] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ List<Object> mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new ArrayList();
    }
}
