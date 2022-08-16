package com.bytedance.android.live.broadcast.draw;

import com.bytedance.android.live.broadcast.model.C3158d;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.NextLiveData;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class DrawWordViewModel$gameStartResp$2 extends Lambda implements Function0<NextLiveData<C3158d>> {
    public static final DrawWordViewModel$gameStartResp$2 INSTANCE = new DrawWordViewModel$gameStartResp$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(15621);
    }

    public DrawWordViewModel$gameStartResp$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.ies.sdk.widgets.NextLiveData<com.bytedance.android.live.broadcast.model.d>, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ NextLiveData<C3158d> mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        NextLiveData<C3158d> nextLiveData = new NextLiveData<>();
        nextLiveData.setValue(new C3158d());
        return nextLiveData;
    }
}
