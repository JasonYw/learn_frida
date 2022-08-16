package com.bytedance.android.live.broadcast.draw;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.NextLiveData;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class DrawWordViewModel$gameToken$2 extends Lambda implements Function0<NextLiveData<Long>> {
    public static final DrawWordViewModel$gameToken$2 INSTANCE = new DrawWordViewModel$gameToken$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(15623);
    }

    public DrawWordViewModel$gameToken$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, com.bytedance.ies.sdk.widgets.NextLiveData<java.lang.Long>] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ NextLiveData<Long> mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        NextLiveData<Long> nextLiveData = new NextLiveData<>();
        nextLiveData.setValue(0L);
        return nextLiveData;
    }
}
