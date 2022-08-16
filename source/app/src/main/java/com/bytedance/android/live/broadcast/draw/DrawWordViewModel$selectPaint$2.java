package com.bytedance.android.live.broadcast.draw;

import com.bytedance.android.live.broadcast.model.C3159e;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.NextLiveData;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class DrawWordViewModel$selectPaint$2 extends Lambda implements Function0<NextLiveData<C3159e>> {
    public static final DrawWordViewModel$selectPaint$2 INSTANCE = new DrawWordViewModel$selectPaint$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(15626);
    }

    public DrawWordViewModel$selectPaint$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.ies.sdk.widgets.NextLiveData<com.bytedance.android.live.broadcast.model.e>, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ NextLiveData<C3159e> mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        NextLiveData<C3159e> nextLiveData = new NextLiveData<>();
        nextLiveData.setValue(new C3159e());
        return nextLiveData;
    }
}
